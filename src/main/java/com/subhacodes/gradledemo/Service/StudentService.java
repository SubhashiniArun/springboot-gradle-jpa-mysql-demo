package com.subhacodes.gradledemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhacodes.gradledemo.Respository.StudentRepository;
import com.subhacodes.gradledemo.models.Student;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public void createStudent(String studentName, int studentAge){
        Student s = new Student();
        s.setStudentName(studentName);
        s.setStudentAge(studentAge);
        studentRepository.save(s);
    }
}
