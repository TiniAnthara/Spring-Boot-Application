package com.example.Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Demo.model. Student;

@Repository
public interface  StudentRepository extends JpaRepository<Student, Long>{

}

