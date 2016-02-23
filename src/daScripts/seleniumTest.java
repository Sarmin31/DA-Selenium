package daScripts;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


@SuppressWarnings("unused")
public class seleniumTest {
	
	
	public static String domain = "www";
	public static String homeURL = "https://" + domain + ".disasterassistance.gov/";
	public static void main(String[] args) throws InterruptedException, MessagingException, IOException {
		
		PrintStream out = new PrintStream(new FileOutputStream("output.html"));
		System.setOut(out);
		
		// Chrome set up 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\581772\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
//	WebDriver driver = new FirefoxDriver();
//		Dimension d = new Dimension(1200,900);
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		if(domain.equals("staging")){
			driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/?mobile=unL9HuS");
		}
		
		driver.get(homeURL);

		GenerateHTML.beginning();
		
		//----------HOMEPAGE--------------
//		Go to the home page
		//Homepage.Run(driver);
		
//		Go to the landing pages
		
		//--------LANDING PAGES-----------
		
		
//		GetAssistanceLanding.run(driver);
//		InformationLanding.run(driver);
//		AboutUsLanding.run(driver);
//		HelpLanding.run(driver);
		
		
		
//		
		//--------GET ASSISTANCE----------
		
//		Go to the get assistance
		
//		AddressLookUp.run(driver);
//		ApplyOnline.run(driver);
//		CheckStatus.run(driver);
//		CategoryAssistance.run(driver);
//		FederalAgencyAssistance.run(driver);
//		ApplicationChecklist.run(driver);
//		Forms.run(driver);
		
		//---------INFORMATION------------
		
//		 Go to the information page
		
//		NewsFeeds.run(driver);
//		ImmediateNeeds.run(driver);
//		MovingForward.run(driver);
//		CommunityResources.run(driver);
//		OlderAmericans.run(driver);
//		ChildrenFamilies.run(driver);
//		DisasterTypes.run(driver);
//		ForeignDisasters.run(driver);
//		FactSheets.run(driver);
		
// ----------ABOUT US--------------
//		Go to the about us page
		
//	Overview.run(driver);
//	Partners.run(driver);
		
		
//			
//		//----------CONTACT US------------
		
//		Go to the contact us page
//		FAQ.run(driver);
//		ContactUs.run(driver);
//		PrivacyPolicy.run(driver);
//		Accessibility.run(driver);
//		DLPlugins.run(driver);
		SendEmail.run(driver);
		
		
//		RunTest.emailTest();
		
		GenerateHTML.end();
		
		driver.close();
		
		
		
				
	}
	
	
	
}