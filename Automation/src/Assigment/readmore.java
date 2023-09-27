package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class readmore {
	WebDriver d;
	public static void main(String[] args) throws InterruptedException {
		readmore r=new readmore();
		r.launchbrowser();
		r.selinium();
	}
	public void launchbrowser() {
		d = new ChromeDriver();
		d.manage().window().maximize();
	}
	public  void selinium() throws InterruptedException
	{
		d.get("https://www.selenium.dev/blog/2023/selenium-4-10-0-released/");
		//d.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		d.findElement(By.xpath("//code[text()='Options']")).click();
	   // d.findElement(By.xpath("//p[text()='Today we’re happy to announce that Selenium 4.10.0 has been released!']/../a/i")).click();
	}
	

}
