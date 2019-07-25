package com.marketplace.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.marketplace.model.user.User;

@Service
public interface UserService {

	public List<User> listUsers();
	
	public User getUserByLoginDetails(String emailId, String password);

	public void save(User user);
}
