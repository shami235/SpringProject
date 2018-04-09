package app.services;

import app.repositories.IStudentDao;
import app.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service

public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private IStudentDao iStudentDao;

    public Collection<Student> getAllStudents(){
        return iStudentDao.getAllStudents();
    }

    public  Student getStudentById(int id){
        return iStudentDao.getStudentById(id);
    }

    public  void removeStudentById(int id){
         iStudentDao.removeStudentById(id);
    }

    public  void updateStudent(Student student){
        iStudentDao.updateStudentById(student);
    }

    public void insertStudent(Student student) {

        iStudentDao.insertStudent(student);
    }
}
