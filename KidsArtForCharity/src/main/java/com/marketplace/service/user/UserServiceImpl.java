package com.marketplace.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.marketplace.dao.user.UserDAO;
import com.marketplace.model.user.User;

public class UserServiceImpl implements UserService {
    @Autowired
	private UserDAO userDAO;
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> listUsers() {
		return userDAO.listUsers();
	}

	@Override
	public User getUserByLoginDetails(String emailId, String password) {
		return userDAO.getUserByLoginDetails(emailId, password);
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
		
	}

}
