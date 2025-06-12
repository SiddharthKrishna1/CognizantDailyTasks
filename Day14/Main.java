class Person {
    String name;
    int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    double salary;


    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        displayPersonInfo(); 
        System.out.println("Salary: " + salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Jonathan", 30, 55000.0);
        emp.displayEmployeeInfo();
    }
}
