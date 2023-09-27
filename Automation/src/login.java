

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.name("remember")).click();
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String  title=d.getTitle();
		System.out.println(title);
		
	}

}
