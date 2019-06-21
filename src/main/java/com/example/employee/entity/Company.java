package com.example.employee.entity;

public class Company {
    private int id;
    private String companyName;
    private int employeesNumber;
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

}
//    CREATE TABLE Company(
//        id INT PRIMARY KEY,
//        companyName VARCHAR(255) NOT NULL,
//    employeesNumber INT NOT NULL
//) engine=InnoDB DEFAULT CHARSET = gbk;