package com.shami.Dao;

import com.shami.Entity.Student;

import java.util.Collection;

public interface IStudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
