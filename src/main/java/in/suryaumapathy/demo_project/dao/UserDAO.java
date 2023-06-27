package in.suryaumapathy.demo_project.dao;

import in.suryaumapathy.demo_project.model.User;

public class UserDAO {

	/**
	 * Returns all Users in the UserList.
	 *
	 * @return An array of all User objects in the UserList.
	 */
	public User[] findAll() {
		User[] userList = UserList.userList;
		return userList;
	}

	/**
	 * Adds a new User to the first available slot in UserList. Prints a success
	 * message if successful, or a failure message otherwise.
	 *
	 * @param newUser The User to be added to the UserList.
	 */
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

	/**
	 * Replaces a User in the UserList with updatedUser, matching by userId.
	 *
	 * @param updatedUser The User with updated information.
	 */
	public void update(User updatedUser) {
		User[] userList = UserList.userList;

		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == updatedUser.getId()) {
				userList[i] = updatedUser;
				break;
			}
		}
	}

	/**
	 * Deactivates a User in the UserList by setting its active status to false.
	 *
	 * @param userId The id of the User to be deactivated.
	 */
	public void delete(int userId) {
		User[] userList = UserList.userList;
		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == userId) {
				user.setActive(false);
				break;
			}
		}
	}

	/**
	 * Finds and returns a User from UserList matching the given userId.
	 *
	 * @param userId The id of the User to be found.
	 * @return The User with the matching id, or null if no match is found.
	 */
	public User findById(int userId) {
		User[] userList = UserList.userList;
		User userMatch = null;

		for (int i = 0; i < userList.length; i++) {
			User user = userList[i];
			if (user.getId() == userId) {
				userMatch = user;
				break;
			}
		}
		return userMatch;
	}

}
