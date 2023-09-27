package Part2Assigment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonsearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
	    d.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag");
	    Thread.sleep(2000);
	 List<WebElement> bag=  d.findElements(By.id("nav-flyout-searchAjax"));
	 ArrayList al=new ArrayList();
	 for(WebElement suggest:bag)
	 {
		 al.add(suggest.getText());
	 }
	 System.out.println(al);
	 d.quit();
	 
	    
	    

}}
