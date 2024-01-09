package com.example.callectionwalthrough.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGenerals {

    public void filterTest(){
        List<Integer> myCurrentNumbers = Arrays.asList(2,4,22,3,5,7,8,9);
        System.out.println("Values for filter "); myCurrentNumbers.stream().filter(num -> num %2 == 0).forEach(System.out::println);
        long countValue = myCurrentNumbers.stream().filter(num -> num %2 == 0).count();
        System.out.println("filter Count "+countValue);
        System.out.println("Comparison of values ");
        Optional<Integer> min = myCurrentNumbers.stream().min(Integer::compareTo);
        Optional<Integer> max = myCurrentNumbers.stream().max(Integer::compareTo);
        //below can be used instead
//       Optional<Integer> min = myCurrentNumbers.stream().min((val1, val2) -> {
//            return val1.compareTo(val2);
//        });
        System.out.println("Min Value "+min.get());
        System.out.println("Max Value "+max.get());
    }
    public void streamSort(){
        List<Integer> myCurrentNumbers = Arrays.asList(2,4,22,3,5,7,8,9);
        List<Integer> sortedListasc = myCurrentNumbers.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedListdesc = myCurrentNumbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedListasc);
        System.out.println(sortedListdesc);
    }
    public void streamMatch(){

    }

}
