package com.student.controller;

import com.student.Service.StudentServiceImpl;
import com.student.dto.StudentDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private StudentServiceImpl std;

    public StudentController(StudentServiceImpl std) {
        this.std = std;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto dto){
        StudentDto studentDto = std.addStudent(dto);
        return new ResponseEntity<>(studentDto, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestParam long studentId){
        std.deleteStudent(studentId);
        return new ResponseEntity<> ("Record deleted successfully!",HttpStatus.OK);
    }
}
