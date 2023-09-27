package Part2Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropmulti {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/Selenium/HTML/drop.html");
	WebElement w=	d.findElement(By.id("Game"));
	Select s=new Select(w);
	//Select 
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	
	//Deselect
	s.deselectByIndex(0);
	s.deselectAll();
	d.quit();
	
	}

}
