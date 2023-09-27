package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class copy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		String title=d.getTitle();
		System.out.println(title);
	}

}
