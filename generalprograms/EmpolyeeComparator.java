package generalprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpolyeeComparator {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee ("Raj", 24));
        employees.add(new Employee("Rahul", 38));
        employees.add(new Employee("Deepak", 26));
        employees.add(new Employee("Kavya", 28));
        employees.add(new Employee("Divya", 20));
        employees.add(new Employee("Anju", 24));

        System.out.println(employees);
        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("Sort by name" + employees);
        Collections.sort(employees, new EmployeeAgeComparator());
        System.out.println("Sort by age" + employees);

    }
}

class Employee {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age - o2.age;
    }
}