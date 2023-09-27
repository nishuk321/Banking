import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathass1 {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/Selenium/HTML/fake%20registration.html");
		d.findElement(By.xpath("/html/body/input[1]")).sendKeys("Nitesh kumar");
		d.findElement(By.xpath("html/body/input[2]")).sendKeys("Shiv");
		d.findElement(By.xpath("/html/body/input[3]")).sendKeys("nishantksingh625@gmail.com");
		d.findElement(By.xpath("/html/body/input[4]")).click();
		d.findElement(By.xpath("/html/body/input[7]")).click();
		d.findElement(By.xpath("/html/body/input[8]")).click();
	}

}
