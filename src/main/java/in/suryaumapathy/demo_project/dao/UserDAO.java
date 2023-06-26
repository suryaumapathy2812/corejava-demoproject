package in.suryaumapathy.demo_project.dao;

import in.suryaumapathy.demo_project.model.User;
import in.suryaumapathy.demo_project.model.UserList;

public class UserDAO {

	public User[] findAll() {
		User[] userList = UserList.userList;
		return userList;
	}

	public void create(User newUser) {
		User[] userList = UserList.userList;
		int index = -1;

		for (int i = 0; i < userList.length; i++) {
			if (userList[i] == null) {
				index = i;
				break;
			}
		}

		if (index > -1) {
			System.out.println(index);
			UserList.userList[index] = newUser;
			System.out.println("Successfully created new User");
		} else {
			System.out.println("Failed to create new User");
		}
	}

}
