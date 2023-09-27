import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class googleselinium {
public static void main(String[] args) {
	WebDriver d=new EdgeDriver();
	d.manage().window().maximize();
	d.get("https://www.google.com/");
	By uselocation=By.id("APjFqb");
	WebElement search=d.findElement(uselocation);
	search.sendKeys("https://www.selenium.dev/");
	
	
	
	
	
	
}
}
