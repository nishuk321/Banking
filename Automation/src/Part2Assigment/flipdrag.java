package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipdrag {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.flipkart.com/");
		try {
			WebElement close = d.findElement(By.cssSelector("//button[text()='✕']"));
			close.click();

		} catch (Exception e) {

		}

		WebElement w1 = d.findElement(By.cssSelector("[name='q']"));
		w1.sendKeys("mobiles");
		w1.submit();
		WebElement w = d.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));

		Actions act = new Actions(d);

		act.dragAndDropBy(w, 60, 0).perform();
		Thread.sleep(5000);
		WebElement w2 = d.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));
		act.dragAndDropBy(w2, -60, 0).perform();

	}

}
