package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Project;
import com.portfolio.beportfolio.service.IProjectService;
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
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private IProjectService projectServ;    
    
    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public void addProject (@RequestBody Project project){
        projectServ.newProject(project);
    }
    @GetMapping
    @ResponseBody
    public List<Project> listProject(){
        return projectServ.listProject();
    }
   
    @GetMapping("/{id}")
    @ResponseBody
    public Project findProject(@PathVariable Long id){
        return projectServ.findProject(id);
    }
    
    @PreAuthorize("isAuthenticated()")
    @DeleteMapping("/{id}")
    public void deleteProject (@PathVariable Long id){
        Project project= findProject(id);
        projectServ.deleteProject(project);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping
    public void editProject (@RequestBody Project project){
        projectServ.editProject(project);
    }
    
    @PreAuthorize("isAuthenticated()")
    @PutMapping("/{id}")
    public void editProject(@PathVariable Long id) {
        Project project= findProject(id);
        projectServ.editProject(project);
    }
}
