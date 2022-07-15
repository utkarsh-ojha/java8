package org.functionalInterface;

public class ExampleFunctionalInterfaceTest {

    public static void main(String[] args) {

//        ExampleFunctionalInterface myObj = () -> {
//            System.out.println("Test abstract method");
//        };

        //Test abstract method 1
//       ExampleFunctionalInterface myObj1 = () -> System.out.println("Test abstract method");
//       myObj1.test();

        //Test abstract method 2
//        ExampleFunctionalInterface myObj2 = (integerNumber) -> System.out.println("the entered numebr is " + integerNumber);
//        myObj2.test2(8);

        //Test abstract method 3
        ExampleFunctionalInterface myObj3 = (num1,num2)->num1+num2;
        System.out.println(myObj3.add(99,52));

    }
}

