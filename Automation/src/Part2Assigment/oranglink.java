package Part2Assigment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class oranglink {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		d.findElement(By.cssSelector("[href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
	    String mainid=d.getWindowHandle();
	    Set<String> allid=d.getWindowHandles();
	    for(String id:allid)
	    {
	    	if(!(mainid.equals(id)))
                {d.switchTo().window(id);} }
	   System.out.println( d.getTitle());
	   d.close();
	   d.switchTo().window(mainid);
	   System.out.println(d.getTitle());
	   d.quit();
	}

}
