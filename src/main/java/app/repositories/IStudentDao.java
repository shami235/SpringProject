package app.repositories;

import app.models.Student;

import java.util.Collection;

public interface IStudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudentById(Student student);

    void insertStudent(Student student);
}
