package com.example.callectionwalthrough.collcetions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListwalkthrough {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    public void linkedListusage(){
        LinkedList ll = new LinkedList();
        ll.add("C"); ll.add("G"); ll.add("A"); ll.add("D"); ll.add("E"); ll.add("B");ll.add("F");
        LinkedList new_ll = new LinkedList();
        new_ll.addAll(ll);
        log.info("New Linked List data {}",new_ll);
        Collections.sort(new_ll);
        log.info("Sorted collection {}",new_ll);
        log.info("Read values from the linked list");
        log.info("----------Using for loop--------------");
        for (int i=0; i<new_ll.size();i++){
            log.info("Linked list Value {}",new_ll.get(i));
        }
        log.info("----------Using for each--------------");
        for (Object listValue: new_ll){
            log.info("Value in List {}",listValue);
        }
        log.info("----------Using iterator--------------");
        Iterator it = new_ll.iterator();
        while (it.hasNext()){
            log.info("Value in List {}",it.next());
                    }

    }
}
