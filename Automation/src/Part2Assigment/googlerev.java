package Part2Assigment;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlerev {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
	    d.findElement(By.id("APjFqb")).sendKeys("selenium");
	    Thread.sleep(2000);
        List<WebElement> rev=	d.findElements(By.xpath("//div[@class='mkHrUc']//li"));
        
        ListIterator<WebElement> l=rev.listIterator(rev.size());
        while(l.hasPrevious())
        {
        	WebElement w=l.previous();
        	System.out.println(w.getText());
        }
	

}
}