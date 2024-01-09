package com.example.callectionwalthrough.lambdas;

import com.example.callectionwalthrough.models.Employee;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerInterface {

    public void  consumerWalkthrough(){

    }
    public void consumerCollection(List<Employee> empList){
        System.out.println("Processing collection");

        Function<Employee,Integer> f =emp -> emp.getSalary()*10/100;
        Predicate<Integer> p = b->b>2000;
        Consumer<Employee> c = cd ->{
            System.out.println("Name "+cd.getName()+"Salary "+cd.getSalary());
        };
        System.out.println("-------------------------------");
        for (Employee e:empList) {
            int bonus =f.apply(e);
            if (p.test(bonus)) {
                c.accept(e);
            }
            }
        System.out.println("-------------------------------");
        }
    }

