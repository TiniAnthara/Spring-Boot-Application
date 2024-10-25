package com.example.Demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Demo.Exception.ResourceNotFoundException;
import com.example.Demo.Service.StudentServiceImpl;
import com.example.Demo.model.Student;

@RestController 			@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class  StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/students")
    public  Student createStudent(@Valid @RequestBody Student student) {
        return  studentService.update(student);
    }
    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return  studentService.findAll();
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
        throws ResourceNotFoundException {
        Student student= studentService.findByStudentId(studentId)
          .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
        return ResponseEntity.ok().body(student);
    }
   @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent( @RequestBody Student studentDetails) throws ResourceNotFoundException {
        final Student updatedStudent = studentService.update(studentDetails);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId)
         throws ResourceNotFoundException {
        Student student= studentService.findByStudentId(studentId)
       .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));

        studentService.deleteStudent(student);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}



//@GetMapping("/student")
//public List<Student> getAllStudents () {
//  return studentService.findAll();
//}

//   student.setMode(studentDetails.getMode());
//   student.setDate(studentDetails.getDate());
 //  student.setCourse(studentDetails.getCourse());
   //   student.setDegree(studentDetails.getDegree());

