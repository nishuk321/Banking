package Part3;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class wooden {

	@Test
	public void wood() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.woodenstreet.com/");
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup_form")));
		d.findElement(By.id("loginclose1")).click();

		WebElement w = d.findElement(By.xpath("//a[contains(text(),'Dining & Kitchen')]"));

		Actions a = new Actions(d);
		a.moveToElement(w).perform();
		d.findElement(By.xpath("//a[contains(text(),'Kitchen Furniture')]/..//a[contains(text(),'Kitchen Cabinets ')]"))
				.click();
		a.scrollByAmount(0, 1000).perform();
		ArrayList al = new ArrayList();
		al.add(20478);
		al.add(20480);
		al.add(11063);

		for (Object o : al) {
			d.findElement(By.xpath("//div[@id='article_" + o + "']//div[@class='cart-hover']")).click();
		}
		WebElement w1 = d.findElement(By.className("cart"));
		a.scrollToElement(w1).perform();
		w1.click();
		ArrayList<String> all=new <String>ArrayList();
		all.add("//a[contains(@title,'Monarch Kitchen Cabinet (Honey Finish)')]");
		all.add("//a[contains(@title,'Monarch Kitchen Cabinet (Honey Finish)')]/..//div[@class='price']//strong");
		all.add("//a[contains(text(),'Bago Kitchen Cabinet')]");
		all.add("//a[contains(text(),'Bago Kitchen Cabinet')]/..//div[@class='price']//strong");
		all.add("//a[contains(text(),'Pryce Kitchen Cabinet')]");
		all.add("//a[contains(text(),'Pryce Kitchen Cabinet')]/..//div[@class='price']//strong");
		for(String o:all)
		{
		String s = d.findElement(By.xpath(o)).getText();
		System.out.println(s);
		System.out.println("=================================================================================");
		
		}
		d.quit();
	
	}
	
}
