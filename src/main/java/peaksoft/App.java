package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;
import peaksoft.service.StudentService;
import peaksoft.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println(HibernateConfig.getSession());
        StudentService studentServiceservice=new StudentServiceImpl();
        System.out.println(studentServiceservice.saveStudent(new Student("Baktulan", "Nazirbekov", "baktulan@", 24)));
        System.out.println(studentServiceservice.getStudentById(1L));
        System.out.println(studentServiceservice.getAllStudents());
    }
}
