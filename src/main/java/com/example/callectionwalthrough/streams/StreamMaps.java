package com.example.callectionwalthrough.streams;

import com.example.callectionwalthrough.models.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMaps {

    public void mapWalkthrough(List<Employee> employeeList){
       List<String>empNames =  employeeList.stream().filter(employee -> employee.getSalary()>50000)
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(empNames);
    }
}
