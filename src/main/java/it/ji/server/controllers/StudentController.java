package it.ji.server.controllers;

import it.ji.server.models.Student;
import it.ji.server.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController()
@RequestMapping(path = "api/v1/studenti")
public class StudentController {
    
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student){
        this.studentService.registerStudent(student);
    }
    @DeleteMapping(path = "{student_id}")
    public void deleteStudent(@PathVariable("student_id") Long id){
        this.studentService.deleteStudent(id);
    }

    @PutMapping(path = "{student_id}")
    public void updateStudent(
           @PathVariable("student_id") Long id,
           @RequestParam(required = false) String name,
           @RequestParam(required = false) String email
    ){
        this.studentService.updateNameAndEmail(id,name,email);
    }

}
