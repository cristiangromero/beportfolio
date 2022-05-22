package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.SLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyLevelRepository extends JpaRepository<SLevel, Integer>{
    
}
