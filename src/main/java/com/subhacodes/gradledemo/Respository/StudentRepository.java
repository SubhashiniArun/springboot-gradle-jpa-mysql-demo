package com.subhacodes.gradledemo.Respository;

import org.springframework.data.repository.CrudRepository;

import com.subhacodes.gradledemo.models.Student;

public interface StudentRepository extends  CrudRepository<Student, Long>{
    
}
