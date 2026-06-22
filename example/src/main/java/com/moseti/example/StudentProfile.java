package com.moseti.example;

import jakarta.persistence.*;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer Id;

    private String bio;


    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentProfile(){

    }

    public StudentProfile(String bio){
        this.bio = bio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
