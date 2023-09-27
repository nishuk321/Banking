package Part2Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeclick {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		
	}

}
