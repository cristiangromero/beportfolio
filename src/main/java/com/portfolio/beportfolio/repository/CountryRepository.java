package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{
    
}
