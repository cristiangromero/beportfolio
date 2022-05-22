package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Integer>{
    
}
