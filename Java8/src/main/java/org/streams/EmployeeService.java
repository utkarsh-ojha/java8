package org.streams;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    public static void main(String[] args) {
        System.out.println(evaluateValuableEmployeee());
    }

    public static List<Employee> evaluateValuableEmployeee() {
        return EmployeeDAO.getEmployee().stream().filter((emp) -> emp.getEmployeeDept().equals("IT")).collect(Collectors.toList());

    }
}
