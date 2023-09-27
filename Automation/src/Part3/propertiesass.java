package Part3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class propertiesass {
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:\\Selenium\\HTML\\key value.properties");
		Properties p=new Properties();
		p.load(file);
		String s=p.getProperty("username");
		System.out.println(s);
		String s1 =p.getProperty("password");
		System.out.println(s1);
		String s2=p.getProperty("url");
		System.out.println(s2);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(s2);
		d.findElement(By.name("username")).sendKeys(s);
		d.findElement(By.name("pwd")).sendKeys(s1);
		


		
		
		
	}

}
