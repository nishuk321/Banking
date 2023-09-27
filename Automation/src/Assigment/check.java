package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
	WebElement w=	d.findElement(By.id("keepLoggedInCheckBox"));
	String s= w.getAttribute("title");
	System.out.println(s);
		
		
	}

}
