package Part3;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wood {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.woodenstreet.com/");
		try
		{
			driver.findElement(By.id("loginclose1")).click();
		}
		catch(Exception e)
		{
			
		}
		WebElement dining=driver.findElement(By.linkText("Dining & Kitchen"));
		Actions act=new Actions(driver);
		act.moveToElement(dining).perform();
		driver.findElement(By.linkText("2 Seater Dining Sets")).click();
		driver.findElement(By.xpath("//a[text()='Benz Wall Mount 2 Seater Foldable Dining Set (Walnut Finish)']/../../div//p[text()=' Add to Cart']")).click();
		driver.findElement(By.xpath("//a[text()='Benz Wall Mount 2 Seater Foldable Dining Set (Honey Finish)']/../..//p[text()=' Add to Cart']")).click();
		driver.findElement(By.xpath("//a[text()='Orson 2 Seater Dining Set (Honey Finish)']/../..//p[text()=' Add to Cart']")).click();

		driver.findElement(By.className("cart")).click();
		List<WebElement> allproduct=driver.findElements(By.xpath("//*[@class='shopping-info']/div/div[2]/a"));
//		
//		
		List<WebElement> pname=driver.findElements(By.xpath("//div[@class='shopping-info']//a[@class='product-name']"));
		for(WebElement name:pname)
		{
			String productName=name.getText();
			String price=driver.findElement(By.xpath("//a[contains(text(),'"+productName+"')]/..//strong")).getText();
			System.out.println(productName+"----------------->"+price);
			
		}
		
		
		
		
		
		
	}

}