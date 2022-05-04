package UserOption;

import java.util.List;

import com.revature.pixott.dao.MovieDao;
import com.revature.pixott.dao.Top5moviesDao;
import com.revature.pixott.handler.UserMenu;
import com.revature.pixott.model.Top5movies;


public class Top5movieHandler{
	public static void display(){
    Top5moviesDao mov = new Top5moviesDao();
		
		List<Top5movies>top5movie = mov.findAll();
		System.out.println("------");
		System.out.println("Top5movies");
		System.out.println("------");
		System.out.println();
		System.out.printf("%4s %-40s\n", "id", "moviename");
		System.out.printf("%4s %-40s\n", "--", "---------");
		  
		
		
		top5movie.forEach(e->System.out.println(e));
		System.out.println();
		
		UserMenu.menuDisplay();
	}
	

}