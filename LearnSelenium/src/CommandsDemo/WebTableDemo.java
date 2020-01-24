package CommandsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/IBM/Desktop/MY%20NOTES/IBM.html");
		
		String act=driver.findElement(By.xpath("//html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(act);
		Thread.sleep(3000);
	    driver.close(); 
	
	}
}
