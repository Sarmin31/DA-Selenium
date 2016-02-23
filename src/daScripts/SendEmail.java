package daScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class SendEmail  {
	public static void run(WebDriver driver) throws InterruptedException{
		try{
		String icon = "email-icon";
		String emailTo = "edit-email-to";
		String nameField = "edit-senders-name";
		String sendButton = "edit-send";
		String returnButton = "//*[@id=\"validate\"]/a";
		String emailBody = "//*[@id='edit-personal-message']";
		
		driver.findElement(By.id(icon)).click();
		driver.findElement(By.id(emailTo)).sendKeys("da.test2016@gmail.com");
		driver.findElement(By.id(nameField)).sendKeys("Test");
		driver.findElement(By.xpath(emailBody)).sendKeys("Test message");
		driver.findElement(By.id(sendButton)).click();
		
		driver.findElement(By.xpath(returnButton)).click();
		}
		catch(Exception e){
			
		}
	}	
}