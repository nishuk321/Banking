import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	boolean b;
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/login.do");
		
		WebElement w=    d.findElement(By.cssSelector("[type='checkbox']"));
		
		    boolean b=w.isSelected();
		    if (b==true) {
		    	System.out.println("It is already selected");
				
			}
		    else
		    {
		    	d.findElement(By.cssSelector("[type='checkbox']")).click();
		    	System.out.println("Now it is selected");
		    }

		
	}

}
