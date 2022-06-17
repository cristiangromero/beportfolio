package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long>, CrudRepository<Language, Long>{
    Language findByIdLanguage(Long idLanguage);
}
