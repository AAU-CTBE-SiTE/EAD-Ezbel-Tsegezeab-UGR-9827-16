package com.site.student_management.repository;

import com.site.student_management.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Long> {

}