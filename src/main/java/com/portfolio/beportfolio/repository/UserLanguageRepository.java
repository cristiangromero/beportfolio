package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.UserLanguage;
import com.portfolio.beportfolio.model.UserLanguageKey;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLanguageRepository extends JpaRepository<UserLanguage, UserLanguageKey>{
    List<UserLanguage> findByIdUser(Long idUser);
    List<UserLanguage> findByIdLanguage(Long idLanguage);
}
