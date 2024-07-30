package peaksoft.dao;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentDao {

    //crud
    //C=create
    String saveStudent(Student student);

    //R=read
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    //U=update
    Student updateStudent(Long oldStudentId,Student newStudent);
    //D=delete
    String deleteStudent(Long id);
}
