package org.stream.sortmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ShortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("one",1);
        map.put("ten",10);
        map.put("three",3);

        //By key
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("**********************");

        //By Value
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
