package com.tutorial.spring.security.formlogin.repository; 

import java.util.Optional; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import com.tutorial.spring.security.formlogin.model.User; 

@Repository 
public interface UserRepository extends JpaRepository<User, String> { 
   Optional<User> findUserByUsername(String username); 
}