package com.example.Amira201811086;

import java.io.Serializable;

public class Job implements Serializable {
    public String name, location, payRate, jobtype;

    public Job(){

    }
    public Job(String name,String location, String payRate, String jobtype){
        this.name =name;
        this.location = location;
        this.payRate = payRate;
        this.jobtype = jobtype;
    }
}