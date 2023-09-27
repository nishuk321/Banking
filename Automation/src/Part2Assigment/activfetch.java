package Part2Assigment;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class activfetch {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.SPACE, Keys.ENTER);
		d.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
		WebElement w = d.findElement(By.xpath("//div[contains (@class,'popup_menu_button popup_menu_button_settings')]"));
		w.click();
		w.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
		WebElement w1 = d.findElement(By.id("userGroupNamingCodeSelect"));
		Select s = new Select(w1);
		List<WebElement> a = s.getOptions();
		ArrayList  all=new ArrayList<>();
		for(WebElement al:a)
		{
			all.add(al.getText());
		}
		Collections.sort(all);
		System.out.println(all);

	}
}
