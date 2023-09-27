package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ebaycam {
	public static void main(String[] args) {
		WebDriver d=new EdgeDriver();
		d.manage().window().maximize();
		d.get("https://www.ebay.com/");
		d.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("camera");
		d.findElement(By.cssSelector("[class='btn btn-prim gh-spr']")).click();
		String d1=d.findElement(By.cssSelector("[class='srp-controls__count-heading']")).getText();
		System.out.println(d1);
		d.close();
				
	}

}
