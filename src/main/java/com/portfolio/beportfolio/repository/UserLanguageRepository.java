package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserLanguageKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLanguageRepository extends JpaRepository<UserLanguage, UserLanguageKey>{
    
}
