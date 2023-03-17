package com.futurex.services.FutureXCourseApp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Course {
    @Id
    private BigInteger courseid;
    private String coursename;
    private String author;

    public Course() {

    }

    public BigInteger getCourseid() {
        return courseid;
    }

    public void setCourseid(BigInteger courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return coursename;
    }

    public void setCourseName(String courseName) {
        this.coursename = courseName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
