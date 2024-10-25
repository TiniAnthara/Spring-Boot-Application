package com.example.Demo.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo.Repo.StudentRepository;
import com.example.Demo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List getAll() {
		return studentRepository.findAll();
	}
	
	public Optional<Student> findByStudentId(long studentId){
		return studentRepository.findById(studentId);
	}
	
	public List < Student > findAll() {
	     return studentRepository.findAll();
	    }
	
	public void deleteStudent(Student student){
		  studentRepository.delete(student);
		  }

	public Student save(Long studentId, @Valid Student studentDetails) {
		return null;
	}

	@Override
	public Student update(Student student) {
		return studentRepository.save(student) ;
	}
}
