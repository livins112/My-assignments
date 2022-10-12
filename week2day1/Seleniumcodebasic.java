package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumcodebasic {
	public static void main(String[]args)
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementUsername=driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword=driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin=driver.findElement(By.xpath("//input[@value='Login']"));
		elementLogin.click();
		WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLinktext1=driver.findElement(By.linkText("Leads"));
		elementLinktext1.click();
		WebElement elementLinktext2=driver.findElement(By.linkText("Create Lead"));
		elementLinktext2.click();
		WebElement elementCompanyname=driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyname.sendKeys("KefiTech");
		WebElement elementName1=driver.findElement(By.id("createLeadForm_firstName"));
		elementName1.sendKeys("Livins");
		WebElement elementName2=driver.findElement(By.id("createLeadForm_lastName"));
		elementName2.sendKeys("LV");
		driver.findElement(By.name("dataSourceId")).click();
		WebElement eleDrop=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(eleDrop);
		drop.selectByVisibleText("Employee");
		WebElement eleDrop1=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drop1=new Select(eleDrop1);
		drop1.selectByValue("5");
		WebElement eleDrop2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop2=new Select(eleDrop2);
		drop2.selectByIndex(4);
		//WebElement elementSubmit=driver.findElement(By.name("submitButton"));
		//elementSubmit.click();
		//WebElement elementClose=driver.findElement(By.linkText("Logout"));
		//elementClose.click();
	}

}
