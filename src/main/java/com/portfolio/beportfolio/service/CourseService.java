package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Course;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.CourseRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService{
    
    @Autowired
    public CourseRepository courseRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Course> listCourse() {
        return courseRepo.findAll();
    }

    @Override
    public void newCourse(Course course) {
        
        Optional<User> optionalUser = userRepo.findById(course.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        course.setUser(optionalUser.get());
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
        Optional<User> optionalUser = userRepo.findById(course.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<Course> optionalCourse = courseRepo.findById(course.getIdCourse());
        if (!optionalCourse.isPresent()) {
            return;
        }
        course.setUser(optionalUser.get());
        course.setIdCourse(optionalCourse.get().getIdCourse());
        courseRepo.save(course);
    }
}
