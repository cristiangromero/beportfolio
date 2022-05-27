package com.portfolio.beportfolio.Controller;

import com.portfolio.beportfolio.model.Project;
import com.portfolio.beportfolio.service.IProjectService;
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
public class ProjectController {
    @Autowired
    private IProjectService projectServ;    
    
    @PostMapping("/new/project")
    public void addProject (@RequestBody Project project){
        projectServ.newProject(project);
    }
    @GetMapping("/list/project")
    @ResponseBody
    public List<Project> listProject(){
        return projectServ.listProject();
    }
   
    @GetMapping("/findproject/{id}")
    @ResponseBody
    public Project findProject(@PathVariable Integer id){
        return projectServ.findProject(id);
    }
    
    @DeleteMapping("/deleteproject/{id}")
    public void deleteProject (@PathVariable Integer id){
        projectServ.deleteProject(id);
    }
    
    @PutMapping("/edit/project")
    public void editProject (@RequestBody Project project){
        projectServ.editProject(project);
    }
    
    @PutMapping("/editproject/{id}")
    public void editProject(@PathVariable Integer id) {
        Project project= findProject(id);
        projectServ.editProject(project);
    }
}
