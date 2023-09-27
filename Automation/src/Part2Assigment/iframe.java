package Part2Assigment;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class iframe {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//div[contains(@class,'td-a-rec td-a-rec-id-header')]//a[text()='Free Mock Tests']"))
				.click();
		String main = d.getWindowHandle();
		Set<String> allid = d.getWindowHandles();

		for (String id : allid) {
			if (!(main.equals(id))) {
				d.switchTo().window(id);
				System.out.println("Executed");
			}
		}
		Thread.sleep(2000);

		
		// w.click();
		Actions a = new Actions(d);
		a.scrollByAmount(0, 1500);

		WebElement w = d.findElement(
				By.xpath("//ul[contains(@class,'nav nav-pills cs-nav-pills text-center')]//a[text()='Banking']"));
		w.click();
		d.findElement(By.xpath("//a[text()='SBI Clerk Prelims']")).click();

		WebElement w1 = d.findElement(By.xpath("//ul[@class='cs-filter-bar clearfix']"));
		File f = w1.getScreenshotAs(OutputType.FILE);
		File f1 = new File("./screenshot/SBI.png");
		FileHandler.copy(f, f1);

	}

}
