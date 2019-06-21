package com.example.employee.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private int age;
    private String gender;
    private int companyId;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getCompanyId() {
        return companyId;
    }

    public int getSalary() {
        return salary;
    }
    public Employee(){}

    public Employee(int id, String name, int age, String gender, int companyId, int salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.companyId=companyId;
        this.salary=salary;
    }


}
//    CREATE TABLE Employee(
//        id INT PRIMARY KEY,
//        name VARCHAR(255) NOT NULL,
//    age INT NOT NULL,
//    gender VARCHAR(10),
//    companyId INT NOT NULL,
//    salary INT NOT NULL
//) engine=InnoDB DEFAULT CHARSET = utf8;