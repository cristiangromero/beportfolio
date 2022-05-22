package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.SMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SMedia, Integer>{
    
}
