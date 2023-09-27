package Part3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.flipkart.com/");
		try {
			d.findElement(By.xpath("//button[text()='✕']")).click();
			
			
		} catch (Exception e) {
			
		}
		WebElement el=d.findElement(By.xpath("//div[text()='Electronics']"));
		//el.click();
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("arguments[0].click()", el);
	    Actions a=new Actions(d);
	   // Thread.sleep(5000);
	    a.moveToElement(el).perform();

}}
