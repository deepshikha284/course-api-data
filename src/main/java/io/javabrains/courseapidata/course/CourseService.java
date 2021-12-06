package io.javabrains.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCoursesByTopicId(String topicId) {
        List<Course> courses = new ArrayList<>();
        for(Course course : courseRepository.findAll()) {
            courses.add(course);
        }
        return courses;
    }

    public Course getCourseByTopicIdAndCourseId(String topicId, String courseId) {
        //  return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        List<Course> courses = getAllCoursesByTopicId(topicId);
        for(Course course : courses) {
            if(course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        // topics.add(course);
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        //for(int i=0; i<topics.size(); i++){
        //  Topic t=topics.get(i);
        // if (t.getId().equals(id)){
        //    topics.set(i, topic);
        //   return;
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        courseRepository.deleteById(id);
    }
}
