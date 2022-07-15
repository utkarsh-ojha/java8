package org.mapandflatmap;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Customer customer = new Customer(11,"Utkarsh",null, Arrays.asList("9873986966","875765"));


        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> email = Optional.of(customer.getEmail());
//        System.out.println(email);


        Optional<String> email = Optional.ofNullable(customer.getEmail());
        System.out.println(email.orElse("A"));

//        if(email.isPresent())System.out.println(email.get());

    }

}
