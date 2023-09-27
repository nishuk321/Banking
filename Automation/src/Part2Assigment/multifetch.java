package Part2Assigment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multifetch {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("file:///D:/Selenium/HTML/drop.html");
	    WebElement w=d.findElement(By.id("Game"));
	    //w.click();
	    Select s=new Select(w);
	 List<WebElement> b=s.getOptions();
	 for(WebElement al:b)
	 {
		 System.out.println(al.getText());
	 }
	 
	}

}
