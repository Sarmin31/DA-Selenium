package daScripts;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

public class DLPlugins {
	static String page = "Help::Download Plug-ins";
	public DLPlugins(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException,  IOException{
		//System.out.println("Running test for Download Plug-ins");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/help/download-plug-ins");
		Header.run(driver,page);
		plugIns(driver,page);
//		SendEmail.run(driver);                                SJ
		Footer.run(driver,page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		plugIns(driver, spanishPage);
//		SendEmail.run(driver);                                   SJ
		Footer.run(driver, spanishPage);
		
		driver.get(seleniumTest.homeURL);
	}
	 
	public static void plugIns(WebDriver driver,String page) throws InterruptedException{
		String section = "Body";
		String[] plugInsHeader = {
				"xpath",
				"//*[@id=\"page-title\"]",
				"Download Plug-ins Header"};
		String[] content = {
				"xpath",
				"//*[@id=\"content-container\"]/article",
				"Download Plug-ins content"};
		String[] backgroundImage = {
				"id",
				"background-image-container",
				"Background Image"};
		
		String[][] myArray = {
				plugInsHeader,content, backgroundImage};
		RunTest.runTest(myArray,driver,page,section);
	}
}
