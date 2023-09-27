package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dunzopet {
	WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		
		dunzopet d1=new dunzopet();
		d1.launch();
		d1.search();
		
	}
	public void launch()
	{d=new ChromeDriver();
	    d.manage().window().maximize();
		d.get("https://www.dunzo.com/bangalore");
		
	}
	public void search() throws InterruptedException
	{
		d.findElement(By.xpath("//p[text()='Search']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[placeholder='Search for item or a store']")).sendKeys("pet food");
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='HUFT Biodegradable Pet Wipes']/../following-sibling::div[2]//div/div")).click();
	}

}
