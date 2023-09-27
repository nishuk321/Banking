package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.ajio.com/");
		d.findElement(By.cssSelector("[autocomplete='off']")).sendKeys("Shirt");
		d.findElement(By.cssSelector("[class='ic-search']")).click();
		Thread.sleep(2000);
		String title=d.getTitle();
		System.out.println(title);
		d.close();
		
		
				
	}
}
