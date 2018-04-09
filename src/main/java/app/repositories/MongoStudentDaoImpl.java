package app.repositories;

import app.models.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;


@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements  IStudentDao {


    @Override
    public Collection<Student> getAllStudents() {
        return new ArrayList<Student>(){

            {
                add(new Student(1,"Mario", "Sports"));
            }

        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudentById(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
