package daScripts;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

@SuppressWarnings("unused")

public class seleniumTest {
	//www= production, staging = staging
	public static String domain = "www";
	public static String homeURL = "https://" + domain + ".disasterassistance.gov/";
	public static void main(String[] args) throws InterruptedException,  IOException {
		
		PrintStream out = new PrintStream(new FileOutputStream("output.html"));
		System.setOut(out);
		
		// Chrome set up 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		if(domain.equals("staging")){
			driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/?mobile=unL9HuS");
		}
		
		driver.get(homeURL);
	

		GenerateHTML.beginning();
		
		//----------HOMEPAGE--------------
		Homepage.Run(driver);
		
		
		//--------LANDING PAGES-----------
		GetAssistanceLanding.run(driver);
		InformationLanding.run(driver);
		AboutUsLanding.run(driver);
		HelpLanding.run(driver);
		
		//--------GET ASSISTANCE----------
		AddressLookUp.run(driver);
		ApplyOnline.run(driver);
		CheckStatus.run(driver);
		CategoryAssistance.run(driver);
		FederalAgencyAssistance.run(driver);
		OtherRecovery.run(driver);
		ApplicationChecklist.run(driver);
		Forms.run(driver);
		
		//---------INFORMATION------------
		NewsFeeds.run(driver);
		ImmediateNeeds.run(driver);
		MovingForward.run(driver);
//		CommunityResources.run(driver);
		OlderAmericans.run(driver);
		ChildrenFamilies.run(driver);
		DisasterTypes.run(driver);
		ForeignDisasters.run(driver);
		FactSheets.run(driver);
		
//		//----------ABOUT US--------------
		Overview.run(driver);
		Partners.run(driver);
//			
//		//----------CONTACT US------------
		FAQ.run(driver);
		ContactUs.run(driver);
		PrivacyPolicy.run(driver);
		Accessibility.run(driver);
		DLPlugins.run(driver);
////adding Send Email SJ		
		SendEmail.run(driver);
//		RunTest.emailTest();
		
		GenerateHTML.end();
		
		driver.close();
		
		
		
				
	}
	
	
	
}