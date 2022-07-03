package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Course;
import com.portfolio.beportfolio.model.Person;
import com.portfolio.beportfolio.repository.CourseRepository;
import com.portfolio.beportfolio.repository.PersonRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService{
    
    @Autowired
    public CourseRepository courseRepo;
    
    @Autowired
    public PersonRepository personRepo;
    
    @Override
    public List<Course> listCourse() {
        return courseRepo.findAll();
    }

    @Override
    public void newCourse(Course course) {
        
        Optional<Person> optionalPerson = personRepo.findById(course.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        course.setPerson(optionalPerson.get());
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
        Optional<Person> optionalPerson = personRepo.findById(course.getPerson().getIdPerson());
        if (!optionalPerson.isPresent()) {
            return;
        }
        Optional<Course> optionalCourse = courseRepo.findById(course.getIdCourse());
        if (!optionalCourse.isPresent()) {
            return;
        }
        course.setPerson(optionalPerson.get());
        course.setIdCourse(optionalCourse.get().getIdCourse());
        courseRepo.save(course);
    }
}
