package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertactiv {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE, Keys.ENTER);
		
		d.findElement(By.xpath("//div[contains (@class,'popup_menu_button popup_menu_button_settings')]")).click();
		d.findElement(By.xpath("//a[text()='Types of Work']")).click();
		d.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		d.findElement(By.xpath("//input[@onchange='nameChanged(this);']")).sendKeys("Shiva");
		d.findElement(By.cssSelector("[onclick='handleCancel();']")).click();
		Alert alt=d.switchTo().alert();
		String s=alt.getText();
		System.out.println(s);
		alt.dismiss();
		d.quit();
	}

}
