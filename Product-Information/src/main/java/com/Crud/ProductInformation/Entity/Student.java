package com.Crud.ProductInformation.Entity;

import jakarta.persistence.*;
@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stu_id;
    @Column
    private String name;
    @Column
    private double email;
    @Column
    private int dept;

    @Column
    private double roll;

    public Student() {
    }

    public Student(int stu_id, String name, double email, int dept, double roll) {
        this.stu_id = stu_id;
        this.name = name;
        this.email = email;
        this.dept = dept;
        this.roll = roll;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmail() {
        return email;
    }

    public void setEmail(double email) {
        this.email = email;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", dept=" + dept +
                ", roll=" + roll +
                '}';
    }
}
