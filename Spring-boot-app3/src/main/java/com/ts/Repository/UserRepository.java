package com.ts.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public List<User> findByPanOrAdharOrEmail(String pan , String adhar , String email);
}
