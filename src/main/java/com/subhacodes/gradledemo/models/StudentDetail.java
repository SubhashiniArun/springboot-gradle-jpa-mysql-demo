package com.subhacodes.gradledemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentDetail")
public class StudentDetail {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String college;
    private int noOfProblemsSolved;


    public StudentDetail() {
    }

    public StudentDetail(String college, int noOfProblemsSolved) {
        this.college = college;
        this.noOfProblemsSolved = noOfProblemsSolved;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getNoOfProblemsSolved() {
        return this.noOfProblemsSolved;
    }

    public void setNoOfProblemsSolved(int noOfProblemsSolved) {
        this.noOfProblemsSolved = noOfProblemsSolved;
    }

    @Override
    public String toString(){
        return "(Problem Solved: "+this.noOfProblemsSolved+" college name: "+this.college+")";
    }

}