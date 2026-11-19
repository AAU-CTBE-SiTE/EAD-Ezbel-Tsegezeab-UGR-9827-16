package com.site.student_management.Contriller;

import com.site.student_management.model.student;
import com.site.student_management.service.studentService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final studentService studentService;

    public StudentController(studentService studentService) {
        this.studentService = studentService;
    }

    // CREATE: Add a new student
    @PostMapping
    public student createStudent(@RequestBody student student) {
        return studentService.saveStudent(student);
    }

    // READ: Get all students
    @GetMapping
    public List<student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // READ: Get student by ID
    @GetMapping("/{id}")
    public student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // UPDATE: Update student information
    @PutMapping("/{id}")
    public student updateStudent(
            @PathVariable Long id,
            @RequestBody student student) {

        return studentService.updateStudent(id, student);
    }

    // DELETE: Delete a student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}