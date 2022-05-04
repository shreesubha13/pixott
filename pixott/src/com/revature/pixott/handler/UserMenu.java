package com.revature.pixott.handler;




import UserOption.Top5movieHandler;

public class UserMenu {
	public static void menuDisplay() {
		System.out.println("----");
		System.out.println("Menu");
		System.out.println("----");
		System.out.println("1. View top5movies");
		System.out.println("2. Search Movies");
		System.out.println("3. Wish List");
		System.out.println("4. History");
		System.out.println("5. Logout");
		System.out.println("Enter option: ");
		int options = App.scanner.nextInt();
		
		if(options==1) {
			Top5movieHandler.display();
		}
		else if(options==2) {
			SearchMovieHandler.searchMovie();
		}
		
	}

}