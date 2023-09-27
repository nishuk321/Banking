import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Point;

import org.openqa.selenium.edge.EdgeDriver;

public class yatra {
	public static void main(String[] args) {
		WebDriver d=new EdgeDriver();
		d.get("https://www.yatra.com/");
		
		Point p=d.manage().window().getPosition();
		
		System.out.println(p);
		
		String url=d.getCurrentUrl();
		 
		System.out.println(url);
		d.manage().window().maximize();
		d.manage().window().fullscreen();
		d.quit();
		
	
	}

}
