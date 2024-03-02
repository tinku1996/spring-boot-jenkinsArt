package com.example.demo.services;

import com.example.demo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testGetStudentById(){
        Student student=studentService.getStudentById(0);
        Assert.isTrue(student!=null,"Student is Not Null");
        Assert.isTrue(student.getName().equals("Sachin"),"Student Name Valid");
        Assert.isTrue(student.getCity().equals("Rajasthan"),"Student City Valid");
        Assert.isTrue(student.getRollNo().equals("1234"),"Student RollNo Valid");

        student=studentService.getStudentById(2);
        Assert.isTrue(student!=null,"Student is Not Null");
        Assert.isTrue(student.getName().equals("Sham"),"Student Name Valid");
        Assert.isTrue(student.getCity().equals("Maharastra"),"Student City Valid");
        Assert.isTrue(student.getRollNo().equals("1236"),"Student RollNo Valid");

    }

    @Test
    public void testGetAllStudents(){
        List<Student> students=studentService.getAllStudents();
        Assert.isTrue(students!=null,"Student are Not Null");
        Assert.isTrue(students.get(0).getName().equals("Sachin"),"Student 0 Name Valid");
        Assert.isTrue(students.get(1).getCity().equals("Rajasthan"),"Student 1 City Valid");
        Assert.isTrue(students.get(2).getRollNo().equals("1236"),"Student 2 RollNo Valid");
    }
}
