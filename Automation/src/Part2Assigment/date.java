package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class date {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://jqueryui.com/datepicker/");
		d.switchTo().frame(0);
		d.findElement(By.cssSelector("[class='hasDatepicker']")).click();
		for(int i=1;i<=281;i++)
		{
		d.findElement(By.xpath("//span[text()='Prev']")).click();
		}
		d.findElement(By.xpath("//a[text()='11']")).click();
		}

}
