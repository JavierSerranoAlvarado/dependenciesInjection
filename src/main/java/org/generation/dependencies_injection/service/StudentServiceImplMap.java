package org.generation.dependencies_injection.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImplMap implements StudentService{

    final Map<Integer, Student> studentList = new HashMap<Integer, Student>();

    private Log LOGGER = LogFactory.getLog(StudentServiceImplMap.class);

    public StudentServiceImplMap() {

        //Student student1 = new Student("1",1,"Javier", "serrano", 1);

        //studentList.put(student1.getIdType(),student1);

        //LOGGER.info("Los estudiantes son: " + studentList.get(Integer.parseInt("1")));
    }

    @Override
    public void add(Student student) {
        studentList.put(student.getIdType(), student);
    }

    @Override
    public void delete(Student student) {
        studentList.remove(student.getIdType(), student);
    }

    @Override
    public List<Student> all() {
        return null;
    }

    @Override
    public Student findById(String id) {
        return studentList.get(Integer.parseInt(id));
    }



}
