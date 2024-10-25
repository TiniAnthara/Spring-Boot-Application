package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.Demo.model.Student;

public interface StudentService {
	public Student createStudent(Student student);
	public List getAll();
	public Optional<Student> findByStudentId(long studentId);
	public Student update(Student student);
	public void deleteStudent(Student student);

}
