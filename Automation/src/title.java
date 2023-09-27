import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class title {
	
	public static void main(String[] args) {
		
		WebDriver d=new EdgeDriver();
		
		d.get("https://www.naukri.com/");
		String url=d.getCurrentUrl();
		String  title=d.getTitle();
		System.out.println(title);
		System.out.println(url);
		
	}

}
