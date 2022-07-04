package com.carlosguemes.lambdas.sorting;

import java.util.*;

public class SortList {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10,30,20,50,40);
//
//        Collections.sort(list); // ascending order
//        System.out.println(list);
//
//        Collections.reverse(list); // descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

//        Collections.sort(employees, new MySort()); // ascending order
//        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o1.getSalary() - o2.getSalary());
//            }

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getName().compareTo(o2.getName()));
            }
        });


        Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        System.out.println(employees);

        Collections.sort(employees, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println(employees);
    }
}

class MySort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
