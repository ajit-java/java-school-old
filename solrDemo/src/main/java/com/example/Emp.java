package com.example;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * Created by ajit on 15.10.15.
 */
@Data
@SolrDocument(solrCoreName = "basic1")
public class Emp     {
    @Id
    @Field("id")
    private int id;
    @Field("name")
    private String name;
    @Field("salary")
    private float salary;
    @Field("category")
    private List<String> category;
}
