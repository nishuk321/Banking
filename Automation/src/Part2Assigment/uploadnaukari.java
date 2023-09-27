package Part2Assigment;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadnaukari {
	public static void main(String[] args) throws Exception {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjwzo2mBhAUEiwAf7wjkoz8R7i55ZRu2cYlj484czcLWTlgBUD4o_Nx5U0R3keHB8FR6ZUeHxoCoSoQAvD_BwE&gclsrc=aw.ds");
		WebElement w=d.findElement(By.xpath("//button[text()='Upload Resume']"));
		 w.click();
		 Thread.sleep(2000);
		 StringSelection path=new StringSelection("file:///C:/Users/Nishant/OneDrive/Desktop/StudentHallticketinner%20(1).pdf");
		 Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
		 c.setContents(path, null);
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
	}

}
