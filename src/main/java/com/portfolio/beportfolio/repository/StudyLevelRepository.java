package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.StudyLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyLevelRepository extends JpaRepository<StudyLevel, Long>{
    
}
