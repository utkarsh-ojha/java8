package org.preDefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//    @Override
//    public void accept(Integer o) {
//        System.out.println("Printing : " +o);
//    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = obj -> System.out.println("Value is : "+obj);
        consumer.accept(56);


        //For each method of stream uses consumer functional interface

        List<Integer> list1 = Arrays.asList(1,2,3,4);
//        list1.stream().forEach(consumer);

        //Or can also be written as
        list1.stream().forEach(obj -> System.out.println("Value is : "+obj));
    }
}
