package Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redtape {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.flipkart.com/");
		try {
			WebElement close = d.findElement(By.cssSelector("//button[text()='✕']"));
			close.click();

		} catch (Exception e) {

		}

		WebElement w1 = d.findElement(By.cssSelector("[name='q']"));
		w1.sendKeys("redtape slipper");
		w1.submit();
		Actions act=new Actions(d);
				act.scrollByAmount(0, 500).perform();
				d.findElement(By.xpath("//div[text()='Black, Grey 7']")).click();
	}

}
