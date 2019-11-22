package com.javalesson.domainmodel;

public class Employee {
    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;


    static {
        id = 1001;
        System.out.println("Static init block");
    }

    {
        System.out.println("Non static initialisation block");
    }


    public Employee () {
        this("A", "B", 13);
        System.out.println('\'' + toString());
        System.out.println("Empty constructor called");
    }

    public Employee (String name, String position, int salary) {
        this(name, position, salary, "IT");
        System.out.println("Constructor with 3 param called");
    }

    private Employee (String name, String position, int salary, String department) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        System.out.println("Constructor with 4 param called");
    }

    public static int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String getPosition () {
        return position;
    }

    public int getSalary () {
        return salary;
    }


    public String toString () {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
