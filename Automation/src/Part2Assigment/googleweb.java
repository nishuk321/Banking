package Part2Assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleweb {
	public static void main(String[] args) {
		WebDriver  d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
	List<WebElement> allgoogle=d.findElements(By.xpath("//*"));
	for(WebElement google:allgoogle)
	{
		System.out.println(google.getText());
	}
		
	}

}
