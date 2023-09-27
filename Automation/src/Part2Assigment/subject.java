package Part2Assigment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class subject {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("file:///D:/Selenium/HTML/subject.html");
	WebElement w=d.findElement(By.id("subject"));
	
	HashSet<String>  h=new HashSet();
	Select s=new Select(w);
	List<WebElement> l=s.getOptions();
	ArrayList a=new ArrayList();
	
	for(WebElement al:l)
	{
		h.add(al.getText());
	}
	System.out.println(h);
		
	d.quit();
	
	
	
	
	}

}
