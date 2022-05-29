package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.UserSocialMedia;
import com.portfolio.beportfolio.model.UserSocialMediaKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSocialMediaRepository extends JpaRepository<UserSocialMedia, UserSocialMediaKey>{
    
}
