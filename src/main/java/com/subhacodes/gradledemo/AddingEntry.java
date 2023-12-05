package com.subhacodes.gradledemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

import com.subhacodes.gradledemo.models.Student;
import com.subhacodes.gradledemo.models.StudentDetail;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class AddingEntry {
    @PersistenceContext
    EntityManager entityManager;

    public  void hello(){
 

        try(Session session = entityManager.unwrap(Session.class)){
            Student s = new Student("Kumari", 21);
            StudentDetail sd = new StudentDetail("Panimalar", 120);

            s.setStudentDetail(sd);

            session.beginTransaction();
            session.persist(s);
            session.getTransaction().commit();
            System.out.println("Completed");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args){
        AddingEntry obj = new AddingEntry();
        
        obj.hello();
        
    }
}