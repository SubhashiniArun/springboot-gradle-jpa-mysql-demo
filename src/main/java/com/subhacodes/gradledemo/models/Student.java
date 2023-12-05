package com.subhacodes.gradledemo.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Table(name="Student")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Please enter proper student name")
    @Size(min=5, message = "Name should be atleast 5 characters")
    @Size(max=12, message = "Name should not be greater than 12 characters")
    String studentName;

    // @NotBlank(message = "Please enter Student Age")
    // @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="studentAge")
    int studentAge;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="studentDetailId")
    StudentDetail studentDetail;

    public Student(){

    }

    public Student(String studentName, int studentAge){
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public StudentDetail getStudentDetail(){
        return this.studentDetail;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int setStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentDetail(StudentDetail studentDetail){
        this.studentDetail = studentDetail;
    }
   
    @Override
    public String toString(){
        return "Student(name: "+studentName+")";
    }
}
