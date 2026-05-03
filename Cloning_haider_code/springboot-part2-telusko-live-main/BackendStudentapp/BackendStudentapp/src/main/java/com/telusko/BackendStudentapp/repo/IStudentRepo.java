package com.telusko.BackendStudentapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.BackendStudentapp.entity.Student;

public interface IStudentRepo extends JpaRepository
<Student, Long> {

}
