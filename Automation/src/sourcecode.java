import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sourcecode {
public static void main(String[] args) {
	
	WebDriver d=new EdgeDriver();
	d.get("https://www.cowin.gov.in/");
	String code=d.getPageSource();
	
	System.out.println(code);
}
}
