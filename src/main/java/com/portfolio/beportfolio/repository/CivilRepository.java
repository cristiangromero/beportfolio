
package com.portfolio.beportfolio.repository;

import com.portfolio.beportfolio.model.Civil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CivilRepository extends JpaRepository<Civil, Integer>{
    
}
