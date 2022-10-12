package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
public static void main(String[]args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Hynal");
	driver.findElement(By.name("lastname")).sendKeys("Livins");
	
}
}
