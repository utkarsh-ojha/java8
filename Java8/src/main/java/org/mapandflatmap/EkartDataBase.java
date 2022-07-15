package org.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {

    public static List<Customer> getAll() {
        return Stream.of(new Customer(101, "Utkarsh", "Utkarsh@gmail.com", Arrays.asList("8877663366")), new Customer(102, "Kritika", "Kritika@gmail.com", Arrays.asList("8877663366")), new Customer(103, "Prem", "Prem@gmail.com", Arrays.asList("8877663366")), new Customer(104, "Urmila", "Urmila@gmail.com", Arrays.asList("8877663366")), new Customer(105, "Ram", "Ram@gmail.com", Arrays.asList("8877663366"))
        ).collect(Collectors.toList());
    }
}
