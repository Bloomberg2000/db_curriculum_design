package com.dbcourse.curriculum_design.elasticsearch;

import com.dbcourse.curriculum_design.utils.EsClient;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SearchStaff {
    private RestHighLevelClient client;

    public SearchStaff() {
        client = EsClient.getClient();
    }

    private BoolQueryBuilder buildQuery(String name, String terms) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        if (name != null) {
            boolQueryBuilder.should(QueryBuilders.prefixQuery("c_name.keyword", name));
            boolQueryBuilder.must(QueryBuilders.matchQuery("c_name", name));
            boolQueryBuilder.must(QueryBuilders.matchPhrasePrefixQuery("c_name", name));
        }
        if (terms != null) {
            boolQueryBuilder.must(
                    QueryBuilders.multiMatchQuery(
                            terms,
                            "c_birth_place", "c_occupation").type("cross_fields").minimumShouldMatch("100%")
            );
        }
        return boolQueryBuilder;
    }

    private SearchSourceBuilder buildScore(BoolQueryBuilder query, int page, int size) {
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(query);
        sourceBuilder.from((page - 1) * size);
        sourceBuilder.size(size);
        String[] excludeFields = new String[] {"@version", "@timestamp", "edittime"};
        sourceBuilder.fetchSource(null, excludeFields);
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        return sourceBuilder;
    }

    public Object[] search(String name, String terms, int page, int size) {
        SearchRequest searchRequest = new SearchRequest("orange-staff");
        BoolQueryBuilder boolQueryBuilder = buildQuery(name, terms);
        SearchSourceBuilder searchSourceBuilder = buildScore(boolQueryBuilder, page, size);
        searchRequest.source(searchSourceBuilder);

        try {
            SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
            SearchHits hits = searchResponse.getHits();
            SearchHit[] searchHits = hits.getHits();
            ArrayList<Map<String, Object>> ms = new ArrayList<>();
            for (SearchHit searchHit : searchHits) {
                ms.add(searchHit.getSourceAsMap());
            }
            Object[] objects = new Object[2];
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
