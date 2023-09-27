import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazmob {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		WebElement w=d.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_mobiles']"));
		boolean b=w.isDisplayed();
		if(b==true)
		{
			System.out.println("It is displaying");
		}
		else
		{
			System.out.println("It is not showing");
		}
	}

}
