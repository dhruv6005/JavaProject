package com.practice;

import com.practice.string.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class sort {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "AABC", 10000));
        empList.add(new Employee(2, "XYZ", 2000));
        empList.add(new Employee(3, "PQR", 30000));

        empList.sort(Comparator.comparing(Employee::getSalary));

        for (Employee e:empList) {
            System.out.println(e.toString());
        }

        Optional<Employee> eNull = Optional.ofNullable(null);

        if (eNull.isPresent()){
            // complter the logic
            System.out.println("if");
        } else {
            //default process
            System.out.println("else");
        }

        String a="Hello";
        String b = a.concat("ABC");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode("Hello"));
        System.out.println(System.identityHashCode(b));
        System.out.println(b);


    }
}
