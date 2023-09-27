package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertp {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		d.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
		Alert alt = d.switchTo().alert();
		String s = alt.getText();
		System.out.println(s);
		alt.sendKeys("Hello");
		alt.accept();
		WebElement w = d.findElement(By.id("result"));
		System.out.println(w.getText());

	}

}
