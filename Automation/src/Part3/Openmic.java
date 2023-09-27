package Part3;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Openmic {
	
    public static void main(String[] args) {
    	EdgeOptions opt=new EdgeOptions();
    	opt.addArguments("use-fake-ui-for-media-stream");
	
		WebDriver d=new EdgeDriver(opt);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://webcamtests.com/");
		d.findElement(By.xpath("//a[contains(text(),'Mic Test')]")).click();
		
		String mainid=d.getWindowHandle();
		Set<String> allid=d.getWindowHandles();
		
		for(String id:allid)
		{
			if(id !=mainid)
			{
				d.switchTo(). window(id);
			}
		}
		System.out.println(d.getTitle());
		d.findElement(By.id("mic-launcher")).click();
	//	Alert alt=d.switchTo().alert();
		//alt.accept();
		

		
	}

}
