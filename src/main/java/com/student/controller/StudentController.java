package com.student.controller;

import com.student.Service.StudentServiceImpl;
import com.student.dto.StudentDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private StudentServiceImpl std;

    public StudentController(StudentServiceImpl std) {
        this.std = std;
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentDto dto){
        std.addStudent(dto);
        return "Done";


    }

}
