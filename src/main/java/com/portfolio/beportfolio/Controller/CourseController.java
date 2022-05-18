package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Course;
import com.portfolio.beportfolio.service.ICourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private ICourseService courseServ;    
    
    @PostMapping("/new/course")
    public void addCourse (@RequestBody Course course){
        courseServ.newCourse(course);
    }
    @GetMapping("/list/course")
    @ResponseBody
    public List<Course> listCourse(){
        return courseServ.listCourse();
    }
   
    @GetMapping("/findcourse/{id}")
    @ResponseBody
    public Course findCourse(@PathVariable Integer id){
        return courseServ.findCourse(id);
    }
    
    @DeleteMapping("/deletecourse/{id}")
    public void deleteCourse (@PathVariable Integer id){
        courseServ.deleteCourse(id);
    }
    
    @PutMapping("/edit/course")
    public void editCourse (@RequestBody Course course){
        courseServ.editCourse(course);
    }
    
    @PutMapping("/editcourse/{id}")
    public void editCourse(@PathVariable Integer id) {
        Course course= findCourse(id);
        courseServ.editCourse(course);
    }  

}
