package com.subhacodes.gradledemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subhacodes.gradledemo.Service.ContestService;
import com.subhacodes.gradledemo.Service.StudentService;
import com.subhacodes.gradledemo.models.Contest;
import com.subhacodes.gradledemo.models.Student;

@RestController
@RequestMapping(path="/v1")
public class HomeController{

    @Autowired
    ContestService contestService;

    @Autowired
    StudentService studentService;
    
    @PostMapping("/contest/create")
    public String createContest(@RequestParam String contestName, @RequestParam String contestDescription){
        contestService.createContest(contestName, contestDescription);
        return "contest created";
    }

    @GetMapping("/contest/all")
    public Iterable<Contest> getContest(){
        System.out.println("Printing Contset getContest");
        
        return contestService.getAllContests();
    }

    @PostMapping("/student/create")
    public String createStudent(@RequestParam String studentName, @RequestParam int studentAge){
        studentService.createStudent(studentName, studentAge);
        return "student created";
    }
}