package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication
//@EnableSolrRepositories
public class DemosolrApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemosolrApplication.class, args);
    }
}
