package com.example.demo.services;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static List<Student> students=new ArrayList<>();

    public  StudentService(){
        fillStudents();
    }

    public Student getStudentById(int id){
        if (id>=students.size()) return null;
        return students.get(id);
    }

    public List<Student> getAllStudents(){
        return students;
    }

    private void fillStudents(){
        students.add(new Student("Sachin","1234","Rajasthan"));
        students.add(new Student("Ram","1235","Rajasthan"));
        students.add(new Student("Sham","1236","Maharastra"));
    }

}
