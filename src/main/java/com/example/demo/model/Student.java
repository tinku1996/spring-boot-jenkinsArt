package com.example.demo.model;

public class Student {

    String name;
    String rollNo;

    String city;

    public Student(String name, String rollNo, String city) {
        this.name = name;
        this.rollNo = rollNo;
        this.city = city;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
