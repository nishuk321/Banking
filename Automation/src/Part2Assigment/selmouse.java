package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class selmouse {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.selenium.dev/");
		d.findElement(By.xpath("//span[text()='Documentation']")).click();
		d.findElement(By.xpath("(//span[text()='WebDriver'])[1]")).click();
		d.findElement(By.xpath("//span[text()='Actions API']")).click();
		Actions act = new Actions(d);
		act.scrollByAmount(0, 1500).perform();
		d.findElement(By.xpath("//a[text()='Mouse actions']")).click();
		act.scrollByAmount(0, 500).perform();
		WebElement w = d.findElement(By.xpath("(//div[@class='tab-body tab-pane fade show active'])[1]"));
		ScrollOrigin sc = ScrollOrigin.fromElement(w);
		act.scrollFromOrigin(sc, 400, 0).perform();
		

	}

}
