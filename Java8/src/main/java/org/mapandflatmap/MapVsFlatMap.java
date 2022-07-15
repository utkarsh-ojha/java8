package org.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {


        List<Customer> customers = EkartDataBase.getAll();

        //Requierment is to get list of email form customer
        //Which is from List<Customer> to List<String>, so we will
        //use map function (This is called as data transformation)
//This is one to one mapping
        List<String> email = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(email);


        //We are expecting list of stream as output but getting list of list of stream, because phone number is a list
        List<List<String>> phone = customers.stream().map(cust-> cust.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phone);

        List<String> phonenum= customers.stream().flatMap(cust->cust.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(phonenum);

    }
}
