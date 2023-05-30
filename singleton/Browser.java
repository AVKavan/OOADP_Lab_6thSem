package singleton;
import java.util.*;
public class Browser {

	private static Browser instance;
	private static ArrayList<String> history = new ArrayList<>();
	
	private Browser() {}
	
	public static Browser getInstance()
	{
		      if(instance == null)
		    	  instance = new Browser();
		      else
		    	  System.out.println("Instance created already! ");
		      return instance;
	}
	
	public static void addUrl(String url)
	{
		history.add(url);
	}
	
	public static void viewHistory()
	{
		for(String url: history)
		{
			System.out.println(url);
		}
	}
	
	
	
	
	
}
