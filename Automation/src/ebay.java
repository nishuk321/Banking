

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ebay {
	public static void main(String[] args) throws Exception {
		WebDriver d= new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.ebay.com/");
		Thread. sleep(3000);
		d.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		d.navigate().back();
		
		String title=d.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		d.navigate().forward();
		
		Thread.sleep(3000);
		d.manage().window().setPosition(new Point(200,400));
		d.quit();
	}

}
