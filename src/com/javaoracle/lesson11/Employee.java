package com.javaoracle.lesson11;

class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double uvelichitel (double a){
        a*=2;
        return a;
    }

    double zp2() {
        return salary*=2;
    }


}
