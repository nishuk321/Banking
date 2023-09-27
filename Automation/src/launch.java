import org.openqa.selenium.chrome.ChromeDriver;


public class launch {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		
		d.get("https://www.youtube.com/");
		
		
		
		
		
		
	}

}
