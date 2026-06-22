package com.moseti.example;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "T_STUDENT")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name = "c-fname",
            length = 20
    )
    private String firstname;
    private String lastname;

    @Column(unique = true)
    private String email;
    private int age;


    @OneToOne(
            mappedBy = "student",
            cascade = CascadeType.ALL
    )
    private StudentProfile studentProfile;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student(){

    }

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    @ManyToOne()
    @JoinColumn(
            name = "school_id"
    )

    @JsonBackReference
    private School school;

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
