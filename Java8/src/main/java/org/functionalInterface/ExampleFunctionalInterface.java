package org.functionalInterface;

/**
 * Functional interface is a interface having only one
 * abstract method and any number of static or default
 * method
 */

@FunctionalInterface
public interface ExampleFunctionalInterface {

    static void anotherStaticFunction() {
        System.out.println("static function");
    }

    //Abstract method-1
//    void test();

    //Abstract method-2
//    void test2(int input);

    //Abstract method-3
    int add(int num1, int num2);



    default void anotherFunction() {
        System.out.println("Just a another default function");

    }
}
