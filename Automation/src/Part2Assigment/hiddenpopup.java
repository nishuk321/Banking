package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddenpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demo.actitime.com/login.do");
	d.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
	d.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
	d.findElement(By.id("loginButton")).click();
	//Thread.sleep(2000);
	d.findElement(By.cssSelector("[id='container_tasks']")).click();
	d.findElement(By.xpath("//table[@class='headerRowTable']//tbody/tr/td")).click();
	d.findElement(By.cssSelector("[class='delete button']")).click();
	WebDriverWait wait =new WebDriverWait(d, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]")));
	WebElement w=d.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));
	System.out.println(w.getText());
	
}}
