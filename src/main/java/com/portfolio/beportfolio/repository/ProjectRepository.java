package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
    
}
