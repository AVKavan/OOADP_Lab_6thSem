package singleton;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Browser b = Browser.getInstance();
		while(true)
		{
			System.out.println("1.Create Instance\n2.add url\n3.view history\n4.exit");
			System.out.println("Enter the choice");
			int ch = sc.nextInt();
			
			if(ch == 1)
			{
				b = Browser.getInstance();			
			}
			else if(ch == 2)
			{
				System.out.println("Enter URL: ");
				String url = sc.next();
				b.addUrl(url);
			}
			else if(ch == 3)
			{
				b.viewHistory();
			}
			else
				System.exit(0);
		}

	}

}
