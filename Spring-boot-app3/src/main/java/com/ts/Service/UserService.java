package com.ts.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.Model.User;
import com.ts.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
	
	
	public User saveData(User user) {
		return userrepo.save(user);
	}
	
	public List <User> getData(String pan , String adhar , String email ){
		
		return userrepo.findByPanOrAdharOrEmail(pan, adhar, email);
	}
	
	public Optional<User> getDataById(Long id) {
		
		return userrepo.findById(id);
	}

}
