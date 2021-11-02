package org.generation.dependencies_injection.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StudentController
{

    private final StudentService studentService;

    private Log LOGGER = LogFactory.getLog(StudentController.class);

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;

        Student student1 = new Student("1",1,"Javier", "serrano", 1);

        studentService.add(student1);

        LOGGER.info("Los estudiantes son: " + studentService.findById("1"));

    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
       return studentService.findById(String.valueOf(id));
    }



}
