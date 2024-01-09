package com.example.callectionwalthrough.lambdas;

import com.example.callectionwalthrough.models.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterface {

    public void functionOverview(){
        Function<Integer, Integer> fn = i -> i*i;
        System.out.println(fn.apply(5));
    }

    public void testwithObject(){
        Employee [] emp = {
                new Employee("Franc",10000),
                new Employee("Jack",30000),
                new Employee("Tom",40000),
                new Employee("Ann",15000),

        };
        List<Employee> employeeList = Arrays.asList(emp);
        Function<Employee,Integer> empFunc = ef -> {
            int sal = ef.getSalary();
            if (sal>10000 && sal<20000)
                return (sal *10/100);
            else if (sal>20000 && sal<30000)
                return (sal *20/100);
            else
                return (sal *40/100);
        };
        for (Employee empl: employeeList){
            int bonus = empFunc.apply(empl);
            System.out.println("Bonus for "+empl.getName()+"is "+bonus);

        }
    }
}
