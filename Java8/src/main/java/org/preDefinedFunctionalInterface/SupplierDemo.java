package org.preDefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier supplier = () -> "Hi from supplier";
        System.out.println(supplier.get());


        //streams findany orelse uses supplier interface
        List<Integer> list1 = Arrays.asList();

        System.out.println(list1.stream().findAny().orElseGet(supplier));
    }

//    @Override
//    public Object get() {
//        return "Hi from supplier";
//    }
}
