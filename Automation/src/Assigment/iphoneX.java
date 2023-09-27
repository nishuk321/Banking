package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneX {
	WebDriver d;

	public static void main(String[] args) throws InterruptedException {
		iphoneX i = new iphoneX();
		i.launchbrowser();
	//String m=
				i.flipkart();
		//System.out.println(m);
		i.close();

	}

	public void launchbrowser() {
		d = new ChromeDriver();
		d.manage().window().maximize();
	}

	public void flipkart() throws InterruptedException {
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("[placeholder='Search for products, brands and more']")).sendKeys("IphoneX");
		d.findElement(By.cssSelector(".L0Z3Pu")).click();
		Thread.sleep(2000);
	//	d.findElement(By.xpath("//div[contains(@data-id,'MOBEXRGVF')]")).click();
		//Thread.sleep(3000);
		String s1=d.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div/div/div[text()='₹91,900']")).getText();

		System.out.println(s1);
		//return s1;
		d.quit();
	}
	public void close()
	{
		d.quit();
	}

}
