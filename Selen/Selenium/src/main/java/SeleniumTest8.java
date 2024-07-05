import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://jqueryui.com/slider/#colorpicker");

		// maximizes the window size
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement element = driver.findElement(By.id("green"));

		Actions action = new Actions(driver);
		Thread.sleep(6000);
		action.dragAndDropBy(element, -20, 50).perform();
		Thread.sleep(4000);
		
		//closes current window
		driver.close();
		
		//driver.quit => quits all the windows
	}
}
