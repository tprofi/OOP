package com.javaoracle.lesson11;


public class Lesson11Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        emp1.zp2();
        System.out.println(emp1.salary);

        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        st1.changeName(st1);
        System.out.println(st1);
    }
}
