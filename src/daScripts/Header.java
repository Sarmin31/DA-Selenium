

package daScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Header  {
	public static void run(WebDriver driver, String page) throws InterruptedException{
		headerGetAssistance(driver, page);
		headerInformation(driver, page);
		headerAboutUsHelp(driver, page);
		headerLogoButtons(driver, page);
		}
	public static void headerGetAssistance (WebDriver driver, String page) throws InterruptedException{
		
		/*
		 * Enter Xpath of the header category, xpath of the sub item, and a description. 
		 */
		String[] home = {
				"xpath",
				"//*[@id=\"nav\"]/ul/li[1]/a",
				"Home"};
		String[][] myHomeArray = {home};
		String[] getAssistance = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]",
				"Get assistance -> Landing page"};
		String[] getAssistance1 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[1]",
				"Get assistance -> Address lookup"};
		String[] getAssistance2 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[2]",
				"Get assistance -> Find Assistance"};
		String[] getAssistance3 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[3]",
				"Get assistance -> Apply online"};
		String[] getAssistance4 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[4]",
				"Get assistance -> Check your status"};
		String[] getAssistance5 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[5]",
				"Get assistance -> Assistance By Category"};
		String[] getAssistance6 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[6]",
				"Get assistance -> Assistance by Federal Agency"};
		String[] getAssistance7 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[7]",
				"Get assistance -> Other Recovery Help"};		
		String[] getAssistance8 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[8]",
				"Get assistance -> Application Checklist"};
		String[] getAssistance9 = {
				"//*[@id=\"nav\"]/ul/li[2]",
				"//*[@id=\"nav\"]/ul/li[2]/ul/li[9]",
				"Get assistance -> Forms"};		
		//removed landing page
		String[][] myArray = {getAssistance,
				getAssistance1, getAssistance2, getAssistance3, getAssistance4, 
				getAssistance5, getAssistance6, getAssistance7, getAssistance8,getAssistance9};
		//System.out.println("---Running test for the Header(Home and Get Assistance)");
		RunTest.runTest(myHomeArray, driver, page, "Header");
		runHeaderTest(myArray, driver, page);
		
	}
	
	public static void headerInformation (WebDriver driver, String page) throws InterruptedException{
		
		/*
		 * Enter Xpath of the header category, xpath of the sub item, and a description. 
		 */
		String[] information = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]",
				"Information"};
		String[] information1 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[1]",
				"Information -> News Feed"};
		String[] information2 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[2]",
				"Information -> Immediate needs"};
		String[] information3 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[3]",
				"Information -> Moving Forward"};
//		String[] information4 = {
//				"//*[@id=\"nav\"]/ul/li[3]",
//				"//*[@id=\"nav\"]/ul/li[3]/ul/li[4]",
//				"Information -> Community Resources"};
		String[] information4 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[4]",
				"Information -> Disabilities or Acceses and Functional Needs"};
		String[] information5 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[5]",
				"Information -> Older Americans"};
		String[] information6 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[6]",
				"Information -> Children and Families"};
		String[] information7 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[7]",
				"Information -> Disaster Types"};
		String[] information8 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[8]",
				"Information -> Foreign Disasters"};
		String[] information9 = {
				"//*[@id=\"nav\"]/ul/li[3]",
				"//*[@id=\"nav\"]/ul/li[3]/ul/li[9]",
				"Information -> Fact Sheets"};		
		//removed landing page
		String[][] myArray = {information,
				 information1, information2, information3, information4, information5, //information6,
				information6, information7, information8,information9};
		//System.out.println("---Running test for the Header(information)");
		runHeaderTest(myArray, driver, page);
		
	}
	
	public static void headerAboutUsHelp(WebDriver driver, String page) throws InterruptedException{
		String[] AboutUs = {
				"//*[@id=\"nav\"]/ul/li[4]",
				"//*[@id=\"nav\"]/ul/li[4]",
				"About us -> Landing Page"};
		String[] AboutUs1 = {
				"//*[@id=\"nav\"]/ul/li[4]",
				"//*[@id=\"nav\"]/ul/li[4]/ul/li[1]",
				"About us -> Overview"};
		String[] AboutUs2 = {
				"//*[@id=\"nav\"]/ul/li[4]",
				"//*[@id=\"nav\"]/ul/li[4]/ul/li[2]",
				"About us -> Partners"};
		String[] help = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]",
				"Help -> Landing Page"};
		String[] help1 = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]/ul/li[1]",
				"Help -> FAQs"};
		String[] help2 = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]/ul/li[2]",
				"Help -> Contact Us"};
		String[] help3 = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]/ul/li[3]",
				"Help -> Privacy Policy"};
		String[] help4 = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]/ul/li[4]",
				"Help -> Accessibility"};
		String[] help5 = {
				"//*[@id=\"nav\"]/ul/li[5]",
				"//*[@id=\"nav\"]/ul/li[5]/ul/li[5]",
				"Help -> Download Plug-Ins"};
	
		//removed about us landing pages (2)
		String[][] myArray = {AboutUs, help,
				 AboutUs1, AboutUs2,help1, help2, help3, help4, help5};
		//System.out.println("---Running test for the Header(About Us and Help)");
		runHeaderTest(myArray, driver, page);
		}
	
	public static void headerLogoButtons(WebDriver driver, String page) throws InterruptedException{
		String section = "Header";
		String[] logo= {"id","logo","Logo in the header"};
		String[] button1= {"id","find_assistance_icon","Find Assistance Icon"};
		String[] button2= {"id","apply_online_icon","Apply Online Icon"};
		String[] button3= {"id","check_status_icon","Check Status Icon"};
		String[] button4= {"id","email-icon","Email Icon"};
		String[] button5= {"id","print-icon","Print Icon"};
		String[] button6= {"id","search-icon","Search Icon"};
				
		
		String[][] myArray = {logo, button1, button2, button3, button4, button5, button6};	
		RunTest.runTest(myArray, driver, page, section);
				
		}
	
	
	public static void runHeaderTest(String [][] myArray, WebDriver driver, String page) throws InterruptedException	
	{
		
		String [][] currentArray = myArray;
		
		for(int i = 0; i < currentArray.length;i++)
		{
			try
			{
				//This will take the Xpath of Header item 1, header sub item, named like so: Information -> Immediate Needs
				Actions action = new Actions(driver);
				WebElement we = driver.findElement(By.xpath(currentArray[i][0]));
				//action.moveToElement(we).moveToElement(driver1.findElement(By.xpath(currentArray[i][1]))).click().build().perform();
				action.moveToElement(we).moveToElement(driver.findElement(By.xpath(currentArray[i][1]))).build().perform();
				//Thread.sleep(500);
				//driver1.navigate().back();
				System.out.println("<tr><td>"+page+"</td><td>Header</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
			}
			
			catch(Exception e)
			{
				System.out.println("<tr><td>"+page+"</td><td>Header</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
				
			}
			
		}
	}
	
}
