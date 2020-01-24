package CommandsDemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
		
		List<WebElement>Iframe =driver.findElements(By.tagName("iframe"));
		System.out.println("no.of Iframes are :"+ Iframe.size());
		/*driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
		List<WebElement>Iframe0=driver.findElements(By.tagName("iframe"));
		System.out.println("no.of Iframes are :"+Iframe0.size());
		*/
		driver.close();
		
	}

}
