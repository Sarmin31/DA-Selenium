package daScripts;

import org.openqa.selenium.WebDriver;

public class NewsFeeds {
	static String page = "Information::News Feeds";
	public NewsFeeds(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for News Feeds");
		driver.get("http://"+seleniumTest.domain +".disasterassistance.gov/information/news-feeds");
		Header.run(driver, page);
		newsFeeds(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		newsFeeds(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void newsFeeds(WebDriver driver, String page) throws InterruptedException{
		String section = "News Feeds";
		String[] newsFeedContainer = {
				"xpath",
				"//*[@id=\"news-feed-container\"]/p",
				"News Feed Information"};
		
		String[] declaredDisasters ={
				"id",
				"disasters",
				"Declared Disasters Lastest Info"};
		
		String[] severeStorms ={
				"id",
				"storms",
				"Severe Storms Lastest Info"};
		
		String[] hurricanes ={
				"id",
				"hurricanes",
				"Hurricanes Lastest Info"};
		
		String[] wildfire ={
				"id",
				"wildfire",
				"Wildfire Lastest Info"};
		
		String[] earthquakes ={
				"id",
				"earthquakes",
				"Earthquakes Lastest Info"};
		
		String[] drought ={
				"id",
				"drought",
				"Drought Lastest Info"};
		
		String[][] myArray = {
				newsFeedContainer,declaredDisasters,severeStorms,hurricanes,wildfire,earthquakes,drought};
		RunTest.runTest(myArray,driver,section,page);
	}
}
