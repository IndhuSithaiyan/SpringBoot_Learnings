package com.SpringBoot_Learnings_02.SpringBoot_Learnings_02.beans;

public class Student {

    private int id;
    private String Name;
    private String degree;

    public Student(){

    }
    public Student(int id, String name, String degree) {
        this.id = id;
        this.Name = name;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
