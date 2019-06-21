package com.example.employee.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private int id;
    private String companyName;
    private int employeesNumber;
    public Company(){}
    public Company(int id, String companyName,int employeesNumber){
        this.id=id;
        this.companyName=companyName;
        this.employeesNumber=employeesNumber;
    }
    public int getId(){
        return id;
    }
    public int getEmployeesNumber(){
        return employeesNumber;
    }
    public String getCompanyName(){
        return companyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
//    CREATE TABLE Company(
//        id INT PRIMARY KEY,
//        companyName VARCHAR(255) NOT NULL,
//    employeesNumber INT NOT NULL
//) engine=InnoDB DEFAULT CHARSET = gbk;