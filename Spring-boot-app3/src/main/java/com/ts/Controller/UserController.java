package com.ts.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ts.Model.User;
import com.ts.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
	
	    @Autowired
        UserService userServ;
	    
	    @PostMapping("/create-data")
	     public User createData( @RequestBody  User user) {
	    	 return userServ.saveData(user);
	    	 
	     }
	    
	   
	   @GetMapping("/get-data") 
	   public List<User> getDataByPanorAdharorEmail(@RequestParam("pan") String pan , @RequestParam("adhar")String adhar ,@RequestParam("email")  String email){
		   
		   return userServ.getData(pan , adhar , email);
		   
	   }
		   
		   @GetMapping("/get-data-id")
		   public Optional<User> getDataById(@RequestParam("id")  long id) {
		           return userServ.getDataById(id);
	   }
	    
	    
        
}
