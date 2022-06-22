package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Project;
import com.portfolio.beportfolio.model.User;
import com.portfolio.beportfolio.repository.ProjectRepository;
import com.portfolio.beportfolio.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService{
    
    @Autowired
    public ProjectRepository projectRepo;
    
    @Autowired
    public UserRepository userRepo;
    
    @Override
    public List<Project> listProject() {
        return projectRepo.findAll();
    }

    @Override
    public void newProject(Project project) {
        Optional<User> optionalUser = userRepo.findById(project.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        project.setUser(optionalUser.get());
        projectRepo.save(project);
    }
    
    @Override
    public void deleteProject(Project project) {
       projectRepo.delete(project);
    }

    @Override
    public Project findProject(Long id) {
       return projectRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editProject(Project project) {
        
        Optional<User> optionalUser = userRepo.findById(project.getUser().getIdUser());
        if (!optionalUser.isPresent()) {
            return;
        }
        Optional<Project> optionalProject = projectRepo.findById(project.getIdProject());
        if (!optionalProject.isPresent()) {
            return;
        }
        project.setUser(optionalUser.get());
        project.setIdProject(optionalProject.get().getIdProject());
        projectRepo.save(project);
        
    }
}
