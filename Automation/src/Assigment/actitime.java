package Assigment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitime {
	public static void main(String[] args) {
		String customer="Nitesh";
		Random r=new Random();
		int num=r.nextInt(10000);
		customer =customer+num;
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		d.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		//Thread.sleep(2000);
		d.findElement(By.cssSelector("[id='container_tasks']")).click();
	//	Thread .sleep(1000);
		d.findElement(By.cssSelector("[class='title ellipsis']")).click();
		
		d.findElement(By.className("createNewCustomer")).click();
		//Thread .sleep(1000);
		d.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(customer);
		d.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("Nitesh kumar ");
		d.findElement(By.xpath("//div[text()='Create Customer']")).click();
		//Thread .sleep(2000);
	    
	    WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
         wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer > .title"), customer));
     String s=    d.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
	    System.out.println(s);
	    if(customer.equals(s))
	    {
	    	System.out.println("Test case pass");
	    }
	    else
	    {
	    	System.out.println("Test case fail");
	    }
	
		d.close();
		
		
	}

}
