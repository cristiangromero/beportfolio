package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Course;
import java.util.List;

public interface ICourseService {
    
    public List<Course> listCourse();
    public void newCourse(Course course);
    public void deleteCourse(Course course);
    public Course findCourse(Long id);
    public void editCourse(Course course);
    
}
