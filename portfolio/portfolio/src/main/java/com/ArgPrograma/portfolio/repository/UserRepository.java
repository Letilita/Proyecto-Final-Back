
package com.ArgPrograma.portfolio.repository;

import com.ArgPrograma.portfolio.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findByEmail(String email);
    
    
}
