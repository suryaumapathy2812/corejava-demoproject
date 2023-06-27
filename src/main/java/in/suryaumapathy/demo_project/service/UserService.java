package in.suryaumapathy.demo_project.service;

import in.suryaumapathy.demo_project.dao.UserDAO;
import in.suryaumapathy.demo_project.model.User;

public class UserService {

	public User[] findAll() {
		UserDAO userDao = new UserDAO();
		User[] userList = userDao.findAll();
		this.printUsers(userList);
		return userList;
	}

	public User findById(int userId) {
		UserDAO userDao = new UserDAO();
		User user = userDao.findById(userId);
		this.printUser(user);
		return user;
	}

	public void create(User user) {
		UserDAO userDao = new UserDAO();
		userDao.create(user);
		System.out.println("Successfully created user");
	}
	
	
	public void update(User user) {
		UserDAO userDao = new UserDAO();
		userDao.update(user);
		System.out.println("Successfully updated user details");
	}
	
	
	public void delete(int userId) {
		UserDAO userDao = new UserDAO();
		userDao.delete(userId);
		System.out.println("Successfully Deleted user");
	}
	

	

	private void printUsers(User[] userList) {
		System.out.println(userList.length);
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			printUser(user);
		}
	}

	private void printUser(User user) {
		if (user == null)
			System.out.println(user);
		else
			System.out.println(user.toString());
	}

}
