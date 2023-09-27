package Assigment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coronacount {
  WebDriver d;
	public static void main(String[] args) {
		coronacount c=new coronacount();
		c.launch();
		c.featch();
		c.closebrowser();
		
	}
	public void launch()
	{
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.worldometers.info/coronavirus/");
	}
	public void featch()
	{
		String s=d.findElement(By.cssSelector("[style='color:#aaa']")).getText();
		String s1=d.findElement(By.xpath("//h1[text()='Deaths:']/../div")).getText();
		String s2=d.findElement(By.xpath("//h1[text()='Recovered:']/../div")).getText();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
	public void closebrowser()
	{
		d.close();
	}
}
