package org.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        long start1 = 0;
        long end1 = 0;
        long start2 = 0;
        long end2 = 0;

        start1 = System.currentTimeMillis();

        IntStream.range(1, 10000).forEach(System.out::println);
        end1 = System.currentTimeMillis();


        System.out.println("*******Parallel stream****");
        //Paraller stream

        start2 = System.currentTimeMillis();

        IntStream.range(1, 10000).parallel().forEach(System.out::println);
        end2 = System.currentTimeMillis();

        System.out.println("END-START of single stream : " + (end1 - start1));

        System.out.println("END-START of parallel stream is : " + (end2 - start2));


    }
}
