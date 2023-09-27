import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon {
	public static void main(String[] args)  {
		WebDriver d=new EdgeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		String title=d.getTitle();
		System.out.println("Title is "+title);
		d.manage().window().setSize (new Dimension(300,500));
		
		   d.close();
	}

}
