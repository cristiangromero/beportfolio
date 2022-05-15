
package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
    
}
