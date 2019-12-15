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

  static class EmployeeTest{
        public static void main(String[] args) {
            Employee emp1 = new Employee("Ivan", 100.55);
            double d = emp1.uvelichitel(emp1.salary);
            System.out.println(d);
            emp1.zp2();
            System.out.println(emp1.salary);
        }
    }

}
