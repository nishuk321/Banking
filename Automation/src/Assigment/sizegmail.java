package Assigment;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizegmail {
	WebDriver d;
public static void main(String[] args) {
	sizegmail s=new sizegmail();
	s.launchbrowser();
	s.gmail();
	
}

public void launchbrowser()
{
	d=new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
}
public void gmail()
{
	WebElement   w=    d.findElement(By.xpath("//a[text()='Gmail']"));
	org.openqa.selenium.Dimension d1=w.getSize();
	System.out.println("Size of Gmail"+d1);
	Point p=w.getLocation();
	System.out.println("Position of Gmail"+p);
	d.close();
	
}}
