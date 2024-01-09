package com.example.callectionwalthrough.controllers;

import com.example.callectionwalthrough.collcetions.QueueWalkthrough;
import com.example.callectionwalthrough.lambdas.ConsumerInterface;
import com.example.callectionwalthrough.lambdas.FunctionInterface;
import com.example.callectionwalthrough.lambdas.Predicates;
import com.example.callectionwalthrough.models.Employee;
import com.example.callectionwalthrough.streams.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CollectionController {

    @GetMapping("docker-test")
    public ResponseEntity<?> mainController(){
//        Employee[] emp = {
//                new Employee("Franc",10000),
//                new Employee("Jack",30000),
//                new Employee("Tom",40000),
//                new Employee("Ann",15000),
//                new Employee("Tobias",1500000),
//
//        };

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Franc",10000));
        empList.add(new Employee("Jack",30000));
        empList.add(new Employee("Tom",40000));
        empList.add(new Employee("Ann",15000));
        empList.add( new Employee("Tobias",1500000));
//        LinkedListwalkthrough llwalk = new LinkedListwalkthrough();
//        llwalk.linkedListusage();
        System.out.println(empList);
        QueueWalkthrough queueWalkthrough = new QueueWalkthrough();
//        queueWalkthrough.priorityQueueWorks();
        Predicates ps = new Predicates();
//        ps.predicateWalkthrough();
//        ps.predicateObject();
        FunctionInterface fi = new FunctionInterface();
//        fi.testwithObject();

        ConsumerInterface ci = new ConsumerInterface();
//        ci.consumerCollection(empList);

        StreamFilters sf = new StreamFilters();
//        sf.filterWalkthrough(empList);
        StreamMaps sm = new StreamMaps();
//        sm.mapWalkthrough(empList);
        StreamFlatMaps sfm = new StreamFlatMaps();
//        sfm.backgroupFlatMaps();
        StreamGenerals sgm = new StreamGenerals();
//        sgm.filterTest();
//        sgm.streamSort();
        Outscoped outscoped = new Outscoped();
        outscoped.checkObject();

        ResponseEntity responseEntity = new ResponseEntity("success", HttpStatus.ACCEPTED);

        return responseEntity;
    }
}
