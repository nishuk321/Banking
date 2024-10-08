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

public class orang {
	public static void main(String[] args) throws IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.orangehrm.com/en/contact-sales/");
		d.findElement(By.cssSelector("[name='FullName']")).sendKeys("Rakesh kumar",Keys.TAB,Keys.TAB,"7870566806",Keys.TAB,"Nish@123",Keys.TAB);
		WebElement w=d.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(w);
		s.selectByVisibleText("India");
		WebElement w1=d.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select s1=new Select(w1);
		s1.selectByIndex(3);
		d.findElement(By.id("Form_getForm_JobTitle")).sendKeys("QA",Keys.TAB,"Automation");
		TakesScreenshot ts=(TakesScreenshot)d;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./screenshot/page.png");
		FileHandler .copy(src, trg);
		d.quit();
		
	}

}
