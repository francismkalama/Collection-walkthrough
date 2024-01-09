package com.example.callectionwalthrough.lambdas;

import com.example.callectionwalthrough.models.Dao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

    public void predicateWalkthrough(){
        Predicate<Integer>  p = i ->(i>10 && i-3<5);
        System.out.println(p.test(4));
        System.out.println(p.test(14));
    }
    public void predicateObject(){
        Dao [] daoArray = {new Dao("francis",50,'Y'),
                new Dao("francis",50,'N')};
        List<Dao> daoList = Arrays.asList(daoArray);
        Predicate<Dao> da = dao1 -> (dao1.getName().length()>0 && dao1.getSchooled()!='N');
      for (Dao dao2:daoList){
          if (da.test(dao2)){
              System.out.println(dao2.toString());
          }

      }
    }
}
