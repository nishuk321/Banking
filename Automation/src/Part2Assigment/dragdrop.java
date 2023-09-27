package Part2Assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement w=d.findElement(By.id("draggable"));
		WebElement w1=d.findElement(By.id("droppable"));
		Actions a=new Actions(d);
		a.dragAndDrop(w, w1).perform();
	}

}
