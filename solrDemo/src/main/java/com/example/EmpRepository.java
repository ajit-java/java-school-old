package com.example;

import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface EmpRepository extends SolrCrudRepository<Emp, String> {

    List<Emp> findByNameStartingWith(String name);

}
