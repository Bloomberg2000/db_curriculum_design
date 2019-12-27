package com.dbcourse.curriculum_design.utils;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

public class EsClient {
    public static RestHighLevelClient  getClient(){
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("39.107.112.199", 9200, "http")));
        return client;
    }
}
