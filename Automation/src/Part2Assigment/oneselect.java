package Part2Assigment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oneselect {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("file:///D:/Selenium/HTML/drop.html");
	    WebElement w=d.findElement(By.id("Game"));
	    Select s=new Select(w);
	    s.selectByIndex(0);
	    s.selectByIndex(2);
	    s.selectByIndex(1);
	    
	    List<WebElement> selected=s.getAllSelectedOptions();
	    List<WebElement> allselected=s.getOptions();
	    List<WebElement> unselected= new ArrayList(allselected);
	    ArrayList all=new ArrayList();
	    unselected.removeAll(selected);
	    for(WebElement remove:unselected)
	    {
	    	all.add(remove.getText());
	    }
	    Collections.sort(all);
	    System.out.println(all);
	}

}
