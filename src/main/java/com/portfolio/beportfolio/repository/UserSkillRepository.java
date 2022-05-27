package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.UserSkill;
import com.portfolio.beportfolio.model.UserSkillKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSkillRepository extends JpaRepository<UserSkill, UserSkillKey>{
    
}
