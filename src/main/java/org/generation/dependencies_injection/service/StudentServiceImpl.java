package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class StudentServiceImpl implements StudentService{
    private final List<Student> studentsList = new ArrayList<>();

    public StudentServiceImpl() {
        addStudents();
    }

    @Override
    public void add(Student student) {
        studentsList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentsList.remove(student);

    }

    @Override
    public List<Student> all() {
        return studentsList;
    }

    @Override
    public Student findById(String id) {
       return studentsList.get(Integer.parseInt(id));
    }

    private void addStudents(){
        studentsList.add(new Student("1",1,"Mireya","Audiffred", 1));
        studentsList.add(new Student("2",1,"Javier","Eduardo", 1));
        studentsList.add(new Student("3",1,"Pedro","Picapiedra", 1));
        studentsList.add(new Student("4",1,"Pablo","Marmol", 1));

    }

}
