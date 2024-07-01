package com.student.Service;

import com.student.dto.StudentDto;
import com.student.entity.StudentEntity;
import com.student.repository.StudentEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentEntityRepository studentEntityRepository;

    public StudentServiceImpl(StudentEntityRepository studentEntityRepository) {
        this.studentEntityRepository = studentEntityRepository;
    }

    @Override
    public void addStudent(StudentDto dto) {
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setHouse(dto.getHouse());
        studentEntityRepository.save(entity);

    }
}
