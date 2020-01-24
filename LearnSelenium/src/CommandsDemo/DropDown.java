package CommandsDemo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Select p=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		List <WebElement>l=p.getOptions();
		System.out.println("size is: " +l.size());
		for(int i=0;i<l.size();i++){
			System.out.println("name of list are: "+l.get(i).getText());
	
		}
		/*Select p1=new Select(driver.findElement(By.xpath("select[@class='select2-selection select2-selection--single'")));
		List <WebElement>l1=p1.getOptions();
		System.out.println("size is:"+l1.size());
		for(int i=0;i<l1.size();i++){
			System.out.println("name of list are:"+l1.get(i).getText());
		}*/
		driver.close();
	}

}
