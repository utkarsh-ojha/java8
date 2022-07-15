package org.preDefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
//    @Override
//    public boolean test(Integer o) {
//
//        if (o % 2 == 0)
//            return true;
//        else return false;
//    }

    public static void main(String[] args) {
//        Predicate<Integer> predicate= new PredicateDemo();
//        System.out.println(predicate.test(57));

        Predicate<Integer> predicate = o-> o % 2 != 0;
        System.out.println(predicate.test(57));

        //filter method of stream uses predicate interface
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        list1.stream().filter(predicate).forEach( o -> System.out.println(o));

        //or
        list1.stream().filter(o-> o % 2 != 0).forEach( o -> System.out.println(o));


    }
}
