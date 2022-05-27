package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Course;
import com.portfolio.beportfolio.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService{
    
    @Autowired
    public CourseRepository courseRepo;
    
    @Override
    public List<Course> listCourse() {
        return courseRepo.findAll();
    }

    @Override
    public void newCourse(Course course) {
        courseRepo.save(course);
    }
    
    @Override
    public void deleteCourse(Course course) {
       courseRepo.delete(course);
    }

    @Override
    public Course findCourse(Long id) {
       return courseRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCourse(Course course) {
        courseRepo.save(course);
    }
}
