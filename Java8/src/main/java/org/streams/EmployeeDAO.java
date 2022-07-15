package org.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public static List<Employee> getEmployee(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Utkarsh","IT"));
        list.add(new Employee(2,"Kritika","CS"));
        list.add(new Employee(3,"Urmila","ENG"));
        list.add(new Employee(4,"Prem","SER"));
        list.add(new Employee(5,"Ram","IT"));
        return list;
    }
}
