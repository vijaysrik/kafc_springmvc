package com.marketplace.dao.user;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marketplace.model.user.User;
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	private  SessionFactory sessionFactory;
	//private Session session;
	@Autowired
	public UserDAOImpl(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public UserDAOImpl() {
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUsers() {
		List<User> users = null;
		Session session=this.sessionFactory.getCurrentSession();
		users=session.createQuery("from user").list();
		return users;
	}
	@SuppressWarnings("unchecked")
	@Override
	public User getUserByLoginDetails(String emailId, String password) {
		User user = null;
	//	this.session=this.sessionFactory.getCurrentSession();
		String hql = "from User u where u.emailid = '"+ emailId + "' and u.password='" + password +"'";
		Session session=this.sessionFactory.getCurrentSession();
		List<User> users=session.createQuery(hql).list();
		if(!(users.isEmpty()) && users.size()==1) {
			user = users.get(0);
		}
		return user;
	}

	@Override
	public void save(User user) {
		Session session=this.sessionFactory.getCurrentSession();
		session.save(user);
		
	}

}
