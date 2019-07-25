package com.marketplace.dao.user;

import java.util.List;

import com.marketplace.model.user.User;

public interface UserDAO {
    public List<User> listUsers();
    
    public User getUserByLoginDetails(String emailId, String password);

	public void save(User user);
}
