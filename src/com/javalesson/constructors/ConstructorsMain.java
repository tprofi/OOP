package com.javalesson.constructors;


import com.javalesson.domainmodel.Employee;


public class ConstructorsMain {
    public static void main (String[] args) {

        Employee employee = new Employee();
        Employee employee2 = new Employee("Phil", "Developer", 1000000);
        Employee employee1 = new Employee("Andrey", "Developer", 1000000);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

    }
}