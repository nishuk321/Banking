package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebaycol2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver  d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.ebay.com/");
		Thread.sleep(1000);
	    d.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']")).sendKeys("clock");
	    d.findElement(By.cssSelector("[type='submit']")).click();
	   // Thread.sleep(2000);
	    d.findElement(By.cssSelector("[aria-label='Save this search clock search']")).click();
	  //  Thread.sleep(2000);
	    WebElement w=d.findElement(By.cssSelector("[class='captcha-not-rendered-msg-div']"));
	    String s=w.getCssValue("color");
	    String s1=w.getCssValue("font");
	    System.out.println(s);
	    d.quit();
	    System.out.println(s1);
	    
	    
	    
		
		
	}

}
