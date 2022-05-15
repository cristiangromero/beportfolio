
package com.portfolio.beportfolio.repository;
import com.portfolio.beportfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{
    
}
