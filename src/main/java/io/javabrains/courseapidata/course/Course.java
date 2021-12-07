package io.javabrains.courseapidata.course;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private String courseDesc;

    public String getCourseId(){
        return courseId;
    }
    public void setCourseId(String courseId){
        this.courseId = courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseDesc(){
        return courseDesc;
    }
    public void setCourseDesc(String courseDesc){
        this.courseDesc = courseDesc;
    }

}
