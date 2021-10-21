import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		
		WebDriver driver; 
		
		Scanner driverObj = new Scanner(System.in);
		System.out.println("Enter the Browser");
		String browserName = driverObj.nextLine();
		
		if(browserName.contains("Chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C://Softwares//Selenium//ChromeDriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
		else if(browserName.contains("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Softwares\\Selenium\\EdgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			System.out.println(driver.getTitle());
			System.out.println("Curr URL : "+driver.getCurrentUrl());
			driver.close();
		}
		
		else {
			System.out.println("Invalid Browser opened");
		}

	}

}
