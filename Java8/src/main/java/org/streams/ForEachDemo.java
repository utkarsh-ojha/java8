package org.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Utkarsh", "Kritika", "Prem", "Urmila");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Utkarsh");
        map.put(2, "kritika");
        map.put(3, "shyam");
        map.put(4,"ram");


        /**************** forEach() ****************/
//        for(String a:list){
//            System.out.println(a);
//        }

        //Here for each is using consumer functional interface
        list.stream().forEach(li -> System.out.println("List item : " + li));

        //This way of for each does not provide the functinality of String functions
        map.forEach((key, value) -> System.out.println("key: " + key + " Value: " + value));

        //Provide functionality of String functions as well.
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

        /********************************************************************************************/

        /********************* filter() *************************/

        System.out.println("************************************************");
        //Traditional way to filter list(below is example based on starts with)
//        for (String s : list){
//            if (s.startsWith("U")){
//                System.out.println(s);
//            }
//        }

        list.stream().filter(li -> li.startsWith("U")).forEach(li -> System.out.println(li));

        //Getting even key map data
        map.entrySet().stream().filter(mapObj -> mapObj.getKey() % 2 == 0).forEach(mapObj -> System.out.println(mapObj));

    }
}
