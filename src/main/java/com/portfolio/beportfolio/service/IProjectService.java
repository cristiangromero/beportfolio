package com.portfolio.beportfolio.service;

import com.portfolio.beportfolio.model.Project;
import java.util.List;

public interface IProjectService {
    public List<Project> listProject();
    public void newProject(Project project);
    public void deleteProject(Project project);
    public Project findProject(Long id);
    public void editProject(Project project);
}
