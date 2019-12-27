package com.dbcourse.curriculum_design.elasticsearch;

import com.dbcourse.curriculum_design.controller.MoviesController.bean.response.MoviesSearchResponse;
import com.dbcourse.curriculum_design.utils.EsClient;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.CountRequest;
import org.elasticsearch.client.core.CountResponse;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.SortOrder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SearchMovie {
    private RestHighLevelClient client;
    public SearchMovie() {
        client = EsClient.getClient();
    }

    private SearchSourceBuilder buildScore(String str){
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(QueryBuilders.multiMatchQuery(str,
                "movielanguage", "moviedatestr", "moviealias",
                "movieinfo", "moviearea", "movietype", "movietag").field("moviename", 5).type("cross_fields").minimumShouldMatch("100%"));
        return sourceBuilder;
    }


    public  Object[] search(String str, int page, int size){
        Object[] objects;
        SearchRequest searchRequest = new SearchRequest("orange-movie");
        SearchSourceBuilder sourceBuilder = buildScore(str);
        sourceBuilder.from((page - 1) * size);
        sourceBuilder.size(size);
        String[] excludeFields = new String[] {"@version", "@timestamp", "edittime"};
        sourceBuilder.fetchSource(null, excludeFields);
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        searchRequest.source(sourceBuilder);
        try {

            SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
            SearchHits hits = searchResponse.getHits();
            SearchHit[] searchHits = hits.getHits();
            ArrayList<Map<String, Object>> ms = new ArrayList<>();
            for (SearchHit searchHit : searchHits) {
                ms.add(searchHit.getSourceAsMap());
            }
            objects = new Object[2];
            objects[0] = ms;
            objects[1] = hits.getTotalHits().value;
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void closeClient(){
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
