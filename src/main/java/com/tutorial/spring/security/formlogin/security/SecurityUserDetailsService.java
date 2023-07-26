package com.tutorial.spring.security.formlogin.security; 

import java.util.Optional; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.core.userdetails.UsernameNotFoundException; 
import org.springframework.security.provisioning.UserDetailsManager; 
import org.springframework.stereotype.Service; 
import com.tutorial.spring.security.formlogin.model.User; 
import com.tutorial.spring.security.formlogin.repository.UserRepository; 

@Service
@Configuration
public class SecurityUserDetailsService implements UserDetailsService { 
  
   @Autowired(required=false) 
   private UserRepository userRepository; 
   
   @Override 
   public UserDetails loadUserByUsername(String username) 
   throws UsernameNotFoundException { 
      User user = userRepository.findUserByUsername(username) 
         .orElseThrow(() -> new UsernameNotFoundException("User not present")); 
         return user; 
   } 
   public void createUser(UserDetails user) { 
      userRepository.save((User) user); 
   } 
}