package com.example;

import org.apache.solr.client.solrj.SolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ajit on 15.10.15.
 */
@RestController
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @RequestMapping(value = "/emps/{id}")
    public Emp getEmp(@PathVariable String id) {
        Emp e = empRepository.findOne(id);
        return e;
    }

    @RequestMapping(value = "/emps/save", method = RequestMethod.POST)
    public Emp saveEmp(@RequestBody Emp emp) {
        Emp e = empRepository.save(emp);
        return e;
    }


    @RequestMapping(value = "/emps/starts/{text}")
    public List<Emp> getEmpsStartingWith(@PathVariable String text) {

        return empRepository.findByNameStartingWith(text);
    }

    @RequestMapping(value = "/emps/all")
    public Iterable<Emp> getEmpListAll() {

        Iterable<Emp> i = empRepository.findAll();

        System.out.println(i);

        return i;
    }
}

