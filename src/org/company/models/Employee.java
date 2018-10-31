package org.company.models;

public class Employee {
    private long id;
    private String name;
    private String gender;
    private double salary;
    private String department;

    public Employee(long id, String name, String gender,
                    double salary, String department)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
    }

    public Employee() {
        this.id = 0;
        this.name = "";
        this.gender ="";
        this.salary = 0;
        this.department = "";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() { return gender;}

    public void setGender(String gender) { this.gender = gender; }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
