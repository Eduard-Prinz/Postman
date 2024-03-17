package hwhwPrince.service;

import hwhwPrince.model.Student;

import java.util.Collection;

public interface StudentService {

    Student addStudent(Student student);

    Student findStudent(long id);

    Student editStudent(Student student);

    Student deleteStudent(long id);
    public Collection<Student> findByAge(int age);
}