package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class bike {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.id("APjFqb")).sendKeys("bike");
		Thread.sleep(2000);
		d.findElement(By.name("btnK")).click();
		String t=d.findElement(By.cssSelector("[id='result-stats']")).getText();
		System.out.println(t);
		
		
		
	}

}
