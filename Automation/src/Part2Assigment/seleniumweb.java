package Part2Assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumweb {
public static void main(String[] args) throws InterruptedException {
	WebDriver  d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.selenium.dev/");
	//Thread.sleep(1000);
	List<WebElement> sel=d.findElements(By.xpath("//img"));
	for(WebElement image:sel)
	{
		System.out.println(image.getAttribute("src"));
	}
}
}
