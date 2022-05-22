package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer>{
    
}