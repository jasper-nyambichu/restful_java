package com.moseti.example;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class School {


    public School() {

    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public School(String name){
        this.name = name;
    }



    @Id
    @GeneratedValue
    private Integer Id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    private String name;


    @OneToMany(
            mappedBy = "school"
    )

    @JsonManagedReference
    private List<Student> students;




}
