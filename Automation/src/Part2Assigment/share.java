package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class share {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		WebElement w = d.findElement(By.xpath("//span[text()='Sign in with Google']"));
		Actions a = new Actions(d);
		//a.scrollToElement(w).perform();
		a.doubleClick(w).perform();
		

}}
