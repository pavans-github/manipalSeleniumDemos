package CommandsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		System.out.println("Title of window"+driver.getTitle());
		/*WebElement tabwindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
		tabwindow.click();*/
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
		
		Set<String>windowids=driver.getWindowHandles();
		Iterator<String>iter=windowids.iterator();
		String mainwindow=iter.next();
		String childwindow=iter.next();
		driver.switchTo().window(childwindow);
		System.out.println("title of child :"+driver.getTitle());
		driver.close();
		driver.switchTo().window(mainwindow);
		/*String parentWindowHandle = driver.getWindowHandle();
		 System.out.println("Parent window's handle -> " + parentWindowHandle);
		 WebElement clickElement = driver.findElement(By.id("")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 }
		 
		 Set<String> n = driver.getWindowHandles();
		 
		 for(String windows :n)
		 {
		 System.out.println("Window handle - > " + windows);*/
		 }
		 }

