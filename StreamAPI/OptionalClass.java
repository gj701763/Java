package StreamAPI;

import java.util.*;

class Employee {
    private int id;
    private String name;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[" + name + "," + id + "]";
    }
}

public class OptionalClass {
    public static void main(String x[]) {

        // Employee emp = null;
        // Optional<Employee> o = Optional.ofNullable(emp);
        // if (o.isPresent()) {
        //     Employee e = o.get();
        //     System.out.println(e.getId() + "\t" + e.getName());
        // } else {
        //     System.out.println("No data found");
        // }
        if (Optional.ofNullable(new Employee("Gajanan", 23)).isPresent()) {
            Employee e = Optional.ofNullable(new Employee("Gajanan", 23)).get();
            System.out.println(e.getId() + "\t" + e.getName());
        } else {
            System.out.println("No data found");
        }
    }
}
