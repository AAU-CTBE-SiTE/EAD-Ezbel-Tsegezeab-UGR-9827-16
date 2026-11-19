package com.site.student_management.service;

import com.site.student_management.model.student;
import com.site.student_management.repository.studentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    private final studentRepository studentRepository;

    public studentService(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public student saveStudent(student student) {
        return studentRepository.save(student);
    }

    // READ ALL
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ BY ID
    public student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE
    public student updateStudent(Long id, student student) {

        student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public void deleteStudent(Long id) {

        student student = studentRepository.findById(id).orElse(null);

        if (student != null) {
            studentRepository.delete(student);
        }
    }
}