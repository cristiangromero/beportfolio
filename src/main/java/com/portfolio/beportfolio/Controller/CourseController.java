package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Course;
import com.portfolio.beportfolio.service.ICourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private ICourseService courseServ;    
    
//    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public void addCourse (@RequestBody Course course){
        courseServ.newCourse(course);
    }
    @GetMapping
    @ResponseBody
    public List<Course> listCourse(){
        return courseServ.listCourse();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public Course findCourse(@PathVariable Long id){
        return courseServ.findCourse(id);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @DeleteMapping("/{id}")
    public void deleteCourse (@PathVariable Long id){
        Course course= findCourse(id);
        courseServ.deleteCourse(course);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @PutMapping
    public void editCourse (@RequestBody Course course){
        courseServ.editCourse(course);
    }
    
//    @PreAuthorize("isAuthenticated()")
    @PutMapping("/{id}")
    public void editCourse(@PathVariable Long id) {
        Course course= findCourse(id);
        courseServ.editCourse(course);
    }
}
