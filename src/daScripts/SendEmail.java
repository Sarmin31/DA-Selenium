package daScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendEmail  {

	
	public static void run(WebDriver driver) throws InterruptedException{
		
		driver.get("http://" + seleniumTest.domain + ".disasterassistance.gov/");
		try{
		String icon = "email-icon";
		String emailTo = "edit-email-to";
		String nameField = "edit-senders-name";
		String Addpersonalmessage ="edit-personal-message";
		String sendButton = "edit-send";
		String returnButton = "//*[@id=\"validate\"]/a";
		
		driver.findElement(By.id(icon)).click();
		driver.findElement(By.id(emailTo)).sendKeys("da.test2016@gmail.com");
		driver.findElement(By.id(nameField)).sendKeys("Test");
		driver.findElement(By.id(Addpersonalmessage)).sendKeys("Testing disasterassistance.gov email");
		driver.findElement(By.id(sendButton)).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(returnButton)).click();
		}
		catch(Exception e){
			
		}
		
	}	
}