package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Project;
import com.portfolio.beportfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{
    @Autowired
    public ProjectRepository projectRepo;
    
    @Override
    public List<Project> listProject() {
        return projectRepo.findAll();
    }

    @Override
    public void newProject(Project project) {
        projectRepo.save(project);
    }
    
    @Override
    public void deleteProject(int id) {
       projectRepo.deleteById(id);
    }

    @Override
    public Project findProject(int id) {
       return projectRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editProject(Project project) {
        projectRepo.save(project);
    }
}
