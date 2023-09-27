package Part3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider = "datasupp")
	public void amaz(String data) throws InterruptedException
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.amazon.in/");
		
		WebElement w=d.findElement(By.id("twotabsearchtextbox"));
				w.sendKeys(data);
				w.submit();
			String s=	d.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
			System.out.println(s);
			d.quit();}
	@DataProvider
	public Object[] datasupp()
	{
		Object [] arr=new Object[4];
		arr [0]="mobile";
		arr [1]="watch";
		arr [2]="tv";
		arr [3]="laptop";
		return arr;
	}
	
}
