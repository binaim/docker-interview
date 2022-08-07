package com.example.dockerinterview.controller;

import com.example.dockerinterview.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/{id}")
    public Student getStudents(@PathVariable("id") String id){
        return new Student("Biniam","123","33");
    }
}
