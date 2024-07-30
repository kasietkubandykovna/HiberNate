package peaksoft.service;

import peaksoft.dao.StudentDao;
import peaksoft.dao.StudentDaoImpl;
import peaksoft.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{
   StudentDao studentDao=new StudentDaoImpl() {
       @Override
       public String saveStudent(Student student) {
           return studentDao.saveStudent(student);
       }

       @Override
       public Student getStudentById(Long id) {
          return studentDao.getStudentById(id);

       }

       @Override
       public List<Student> getAllStudents() {
           return studentDao.getAllStudents();
       }

       @Override
       public Student updateStudent(Long oldStudentId, Student newStudent) {
           return null;
       }

       @Override
       public String deleteStudent(Long id) {
           return "";
       }
   };

    @Override
    public String saveStudent(Student student) {
        return "";
    }

    @Override
    public Student getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student updateStudent(Long oldStudentId, Student newStudent) {
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        return "";
    }
}
