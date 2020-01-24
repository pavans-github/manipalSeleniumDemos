package CommandsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/Login");
		driver.manage().window().maximize();
		List<WebElement>LinkList=driver.findElements(By.tagName("a"));
		System.out.println("no.of links"+LinkList.size());
		for(int i=0;i<LinkList.size();i++){
			System.out.println("name of link"+LinkList.get(i).getText());
			
			
			
			
		}

		driver.close();
	}

}
