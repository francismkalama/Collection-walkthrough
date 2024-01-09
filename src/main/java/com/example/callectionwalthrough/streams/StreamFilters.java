package com.example.callectionwalthrough.streams;

import com.example.callectionwalthrough.models.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamFilters {

    public void filterWalkthrough(List<Employee> empList){
//        List<?> bonusList = empList.stream().filter(employee -> employee.getSalary()*10/100>2000).collect(Collectors.toList());
     empList.stream().filter(employee -> employee.getSalary()*10/100>2000).forEach(employee -> System.out.println(objectToJson(employee)) );

    }
    private String objectToJson(Object object){
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (JsonProcessingException e) {

            return e.getMessage();
        }

    }
}
