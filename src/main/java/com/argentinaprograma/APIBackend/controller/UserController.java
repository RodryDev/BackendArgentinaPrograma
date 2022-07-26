
package com.argentinaprograma.APIBackend.controller;

import com.argentinaprograma.APIBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserController extends JpaRepository<User,Integer>{
   User findByUsername(String username); 
    User findByUsernameAndPassword(String username,String password); 
     User findByEmailAndPassword(String email, String password);
}
