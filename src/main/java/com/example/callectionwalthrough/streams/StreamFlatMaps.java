package com.example.callectionwalthrough.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMaps {

    public void backgroupFlatMaps(){

        List<String> name1= Arrays.asList("Franc","Lucas","Mkala");
        List<String> name2= Arrays.asList("Franc","Lucas","Mkala");
        List<String> name3= Arrays.asList("Franc","Lucas","Mkala");
        List<List<String>>combinedNames = new ArrayList<>();
        combinedNames.add(name1);
        combinedNames.add(name2);
        combinedNames.add(name3);
        String value = combinedNames.toString();
        System.out.println(value);
        //initially before java 8
//        for (List<String> innerList:combinedNames){
//            for (String name:innerList){
//                System.out.println(name);
//            }
//        }
        List<String> combinedData = combinedNames.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
    }
}
