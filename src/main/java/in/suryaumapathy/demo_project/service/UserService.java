package in.suryaumapathy.demo_project.service;

import in.suryaumapathy.demo_project.dao.UserDAO;
import in.suryaumapathy.demo_project.model.User;

public class UserService {

	
	public User[] findAll() {
		UserDAO userDao = new UserDAO();
		User[] userList = userDao.findAll();
		System.out.println(userList.length);
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			System.out.println(user);
		}
		return userList;
	}

}
