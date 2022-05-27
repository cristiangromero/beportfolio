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
    public void deleteCourse(int id) {
       courseRepo.deleteById(id);
    }

    @Override
    public Course findCourse(int id) {
       return courseRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editCourse(Course course) {
        courseRepo.save(course);
    }
}
