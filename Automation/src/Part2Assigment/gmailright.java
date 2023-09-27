package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gmailright {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.google.com/");
		WebElement w=d.findElement(By.linkText("Gmail"));
		Actions a=new Actions(d);
		a.moveToElement(w).perform();
		a.contextClick(w).perform();
		
		
		
		
		
	}

}
