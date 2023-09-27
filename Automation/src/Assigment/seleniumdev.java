package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdev {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.selenium.dev/");
	    WebElement w=	d.findElement(By.xpath("//h4[text()='Selenium IDE']"));
	 System.out.println(w.getCssValue("font"));   
	 System.out.println(w.getCssValue("color"));
	 Dimension d1=w.getSize();
	 System.out.println("Width  and Height"+d1);
	 Point p=w.getLocation();
	 System.out.println("X and Y of Web Element"+p);
	 d.close();
	 
		
	}

}
