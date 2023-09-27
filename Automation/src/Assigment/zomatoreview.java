package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatoreview {
	WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		zomatoreview z = new zomatoreview();
		z.lunchbrowser();
		z.search();
		z.click();
		String s =z.featchrating();
		String s1 = z.review();
	     System.out.println(s);
		System.out.println(s1);
		z.closebrowser();
	}

	public void lunchbrowser() {
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	public void search() throws InterruptedException {
		d.get("https://www.zomato.com/");
		Thread.sleep(2000);
	}

	public void click() throws InterruptedException {
		d.findElement(By.xpath("//img[@alt='Dining']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(text(),'Rating:')]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[text()='Outdoor Seating']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//h4[text()='Ironhill Bengaluru']")).click();
		Thread.sleep(1000);
	}

	public String featchrating() throws InterruptedException {
		
		Thread.sleep(2000);
		String s = d.findElement(By.xpath("//section[@class='sc-dxZgTM QvFZM']/div/div/div/div")).getText();
		//System.out.println(s);
		return s;
	}

   public String review() {
	String s2 = d.findElement(By.xpath("//div[text()='Dining Reviews']/..")).getText();
		return s2;
	}

	public void closebrowser() {
		d.close();
	}

}
