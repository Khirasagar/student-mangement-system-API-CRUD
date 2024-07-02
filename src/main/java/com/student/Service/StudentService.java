package com.student.Service;

import com.student.dto.StudentDto;

public interface StudentService {
    public StudentDto addStudent(StudentDto dto);
    void deleteStudent(long studentId);
}
