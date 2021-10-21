import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkdin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Softwares//Selenium//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.id("username")).sendKeys("monishmrampure@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Padma100@");
		driver.findElement(By.xpath("//button[@aria-label='Sign in' and @type='submit']")).click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		

	}

}
