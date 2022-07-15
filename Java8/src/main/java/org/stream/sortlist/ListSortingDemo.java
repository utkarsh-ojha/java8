package org.stream.sortlist;

import org.streams.Employee;
import org.streams.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(37);
        list.add(5);
        list.add(545);
        list.add(54);

/************ PRIMITIVE TYPE *************/

        //Traditional approach
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        //Using lambda java 8 asce
        list.stream().sorted().forEach(s -> System.out.println(s));

        //desc
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        /************* OBJECT TYPE *****************/

        List<Employee> employees = EmployeeDAO.getEmployee();

        //Traditional way
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeeId() - o2.getEmployeeId();
            }
        });

        System.out.println(employees);

        Collections.sort(employees, (o1, o2) -> o2.getEmployeeId() - o1.getEmployeeId());

        System.out.println(employees);

        //stream java 8 way

        employees.stream().sorted((o1, o2) -> o1.getEmployeeId() - o2.getEmployeeId()).forEach(System.out::println);

        System.out.println("****************************************");

        //Rather than writing the custom logic we can do it by fields
        employees.stream().sorted(Comparator.comparing(emp->emp.getEmployeeDept())).forEach(System.out::println);
        System.out.println("****************************************");

//        employees.stream().sorted(Comparator.comparing(org.stream.sortlist.Employee::getEmployeeName)).forEach(System.out::println);


    }

}
