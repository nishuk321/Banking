package Part2Assigment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class acttimesitting {
	public static void main(String[] args) throws Exception   {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		WebElement w=d.findElement(By.xpath("//div[contains (@class,'popup_menu_button popup_menu_button_settings')]"));
		 w.click();
		 d.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
		 WebElement w1=d.findElement(By.id("firstHierarchyLevelCodeSelect"));
		 
		 Select s=new Select(w1);
		 s.selectByIndex(3);
		 WebElement w2=d.findElement(By.id("FormModifiedTextCell"));
		System.out.println(w2.getText()); 
		 File src=w2.getScreenshotAs(OutputType.FILE);
		 File t2=new File("./screenshot/save.png");
		 FileHandler .copy(src,t2);
				 
		
	}

}
