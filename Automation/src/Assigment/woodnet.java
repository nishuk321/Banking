package Assigment;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class woodnet {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		d.findElement(By.linkText("Lamps & Lighting")).click();
		Thread.sleep(1000);
		d.findElement(By.cssSelector("[alt='lighting lamp - buy Lamp Shades online in India']")).click();
		TakesScreenshot ts=(TakesScreenshot) d;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File f=new File("./screenshot/lamp.png");
        FileHandler.copy(src, f);
     
		
		
		      
		}

	}

