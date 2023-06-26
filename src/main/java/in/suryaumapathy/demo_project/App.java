package in.suryaumapathy.demo_project;

import in.suryaumapathy.demo_project.service.UserService;

public class App {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.findAll();		
	}

}
