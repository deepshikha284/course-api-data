package io.javabrains.courseapidata.course;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    @ResponseBody
    public List<Course> getAllCourses(@PathVariable String topicId){
        return courseService.getAllCoursesByTopicId(topicId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}")
        public Course getCourseByTopicIdAndCourseId(@PathVariable String topicId, @PathVariable String courseId){
        return courseService.getCourseByTopicIdAndCourseId(topicId, courseId);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        //course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId){
        //course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
