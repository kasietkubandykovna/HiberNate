package peaksoft.dao;

import org.hibernate.Session;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public String saveStudent(Student student) {
        Session session= HibernateConfig.getSession().openSession();
        session.beginTransaction();
session.persist(student);
session.getTransaction().commit();
session.close();
        return student.getFirstName()+"is successfully saved";
    }

    @Override
    public Student getStudentById(Long id) {
        Session session=HibernateConfig.getSession().openSession();
        session.beginTransaction();
       Student student= session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        Session session=HibernateConfig.getSession().openSession();
session.beginTransaction();
List<Student>students= session.createQuery("select s from Student s",Student.class).getResultList();
session.getTransaction().commit();
session.close();
        return students;
    }

    @Override
    public Student updateStudent(Long oldStudentId, Student newStudent) {
      Session session=HibernateConfig.getSession().openSession();
      session.beginTransaction();
      Student student=getStudentById(oldStudentId);
      student.setFirstName(newStudent.getFirstName());
      student.setLastName(newStudent.getLastName());
      student.setEmail(newStudent.getEmail());
      student.setAge(newStudent.getAge());
     // session.merge()

        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        return "";
    }
}
