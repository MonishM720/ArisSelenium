import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Softwares//Selenium//ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("Website Tite :"+ driver.getTitle());
		
		/*WebElement dropDownElement = driver.findElement(By.cssSelector("[title='Search in']"));
		Select dropDown = new Select(dropDownElement);
		
		dropDown.selectByIndex(4);
		String variable = dropDown.getFirstSelectedOption().getText();
		System.out.println(variable);*/
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

	}

}
