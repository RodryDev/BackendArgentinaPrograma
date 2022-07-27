
package com.argentinaprograma.APIBackend.rest;

import com.argentinaprograma.APIBackend.controller.UserController;
import com.argentinaprograma.APIBackend.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@CrossOrigin (origins = "https://frontargentinaprograma.web.app/")
@RequestMapping("api/user/")
public class UserRest {
    
    @Autowired
    private UserController userController;
    
    
    //agregar (funciona)
    @PostMapping("agregar")
    public void newUser(@RequestBody User u){
        userController.save(u);
    }
    
    //buscar todos (funciona)
      @GetMapping("listar")
    public List<User> listar(){
        return userController.findAll();
    } 
    
    
    //buscar usuario por id (funciona)
    @GetMapping("buscar/{id}")
    @ResponseBody
    public User usuario(@PathVariable Integer id){
        return(userController.findById(id).get());
    }
    
    //buscar por nombre de usuario (funciona)
    @GetMapping("buscar/username")
    @ResponseBody
    public User usuario(){
        return(userController.findByUsername("rodry"));
    }
    
    
    
    
    //login
    //@PostMapping("login")
    //@ResponseBody
   //// public User login(@RequestBody User u){
   //     return(UserApi.findByUsernameAndPassword(u.getUsername(),u.getPassword()));
   // }
    
    @PostMapping("login")
    @ResponseBody
    public User login(@RequestBody User u){
    return(userController.findByEmailAndPassword(u.getEmail(), u.getPassword()));
}
    
    
    
    
    //editar
    @PutMapping("editar")
    public void editUser(@RequestBody User u){
        userController.save(u);
    }
    
    
    //borrar por id (funciona)
    @DeleteMapping("borrar/{id}")
    public void deleteUser(@PathVariable Integer id){
        userController.deleteById(id);
    }

   
    
    
}
