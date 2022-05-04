package com.revature.pixott.handler;

import com.revature.pixott.app.App;

public class MainMenuHandler {
	public static void display() {
		System.out.println("***********");
		System.out.println(" ");
		System.out.println("~ Pixott App Menu ~");
		System.out.println(" ");
		System.out.println("***********");
		System.out.println("[1] Signup");
		System.out.println("[2] Login");
		System.out.println("[3] Display MovieList");
		System.out.println("[4] ExitApp");
		System.out.println(" ");
		System.out.println("Enter option: ");
		//Scanner scanner = new Scanner(System.in);
		int option = Integer.parseInt(App.scanner.nextLine());
		if(option == 1) {
			SignupHandler.display();
			MainMenuHandler.display();
			
		}
		else if(option == 2) {
			LoginHandler.display();
			MainMenuHandler.display();
		}
		else if(option == 3) {
			MovieHandler.display();
			MainMenuHandler.display();
		}
		else if(option == 4) {
			System.out.println("Exit");
		}
	}

}
