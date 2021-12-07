package io.javabrains.courseapidata.course;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    @ResponseBody
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @RequestMapping("/courses/{courseId}")
        public Course getCourseByCourseId(@PathVariable String courseId){
        return courseService.getCourseByCourseId(courseId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/courses")
    public void updateCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
