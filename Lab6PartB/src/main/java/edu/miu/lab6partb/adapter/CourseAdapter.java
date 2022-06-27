package edu.miu.lab6partb.adapter;

import edu.miu.lab6partb.DTO.CourseDTO;
import edu.miu.lab6partb.domain.Course;

import java.util.List;
import java.util.stream.Collectors;

public class CourseAdapter {
    public static CourseDTO getCourseDTO(Course course){
        return new CourseDTO(course.getName());
    }
    public static Course getCourse(CourseDTO courseDTO){
        return  new Course(courseDTO.getName());
    }
    List<CourseDTO> getCourseDTOList(List<Course> courses){
        return courses.stream().map(CourseAdapter::getCourseDTO).collect(Collectors.toList());
    }
}
