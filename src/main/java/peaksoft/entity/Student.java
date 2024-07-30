package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="students11")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_gen")
    @SequenceGenerator(
            name="student_gen",
    sequenceName = "student_seq",
    allocationSize=1)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
   @Column(unique = true)
    private String email;
    private int age;

    public Student(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
