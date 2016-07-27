package daScripts;

import org.openqa.selenium.WebDriver;


public class Homepage {
	private static String page = "Homepage";
	static WebDriver myDriver;
	public Homepage(){
		
	}
	
	public static void Run(WebDriver driver) throws InterruptedException{
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
		Header.run(driver, page);
		addressLookup_and_Buttons(driver, page);
		findLocalResources(driver, page);
		itemsofInterest(driver,page);
		disasterMap(driver,page);
		twitter_DisasterNews(driver,page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		RunTest.backgroundImage(driver,page);
		
		RunTest.translate(driver);
		page = "Homepage - Spanish";
		
		Header.run(driver, page);
		addressLookup_and_Buttons(driver, page);
		findLocalResources(driver, page);
		itemsofInterest(driver,page);
		disasterMap(driver,page);
		twitter_DisasterNews(driver,page);
		RunTest.backgroundImage(driver,page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		driver.get(seleniumTest.homeURL);
	}
	
	public static void addressLookup_and_Buttons(WebDriver driver, String page) throws InterruptedException{
		String section = "Address Lookup and Buttons";
		String[] mapContainer = {
				"xpath",
				"//*[@id=\"block-daip-location-services-daip-address-lookup-block\"]",
				"Map Image and Container"};
		String[] lookupIntroText = {
				"xpath",
				"//*[@id=\"address-lookup-instructions-desktop\"]",
				"Address lookup Intro Text"};
		String[] lookupField = {
				"id",
				"address-text-field",
				"Address lookup Field"};
		String[] lookupSubmit = {
				"id",
				"address-lookup-submit",
				"Address lookup Submit Button"};
		String[] largeButtonFindAssistance = {
				"xpath",
				"//*[@id=\"block-nodeblock-14948\"]/div[2]/div[2]/div/div[1]/article/a/span",
				"Find Assistance Large Button"};
		String[] largeButtonApplyOnline = {
				"xpath",
				"//*[@id=\"block-nodeblock-14948\"]/div[2]/div[2]/div/div[2]/article/a/span",
				"Apply Online Large Button"};
		String[] largeButtonCheckStatus = {
				"xpath",
				"//*[@id=\"block-nodeblock-14948\"]/div[2]/div[2]/div/div[3]/article/a/span",
				"Check Status Large Button"};
				
		String[][] myArray = {
				mapContainer,lookupField,lookupSubmit,lookupIntroText,largeButtonFindAssistance,largeButtonApplyOnline,
				largeButtonCheckStatus};
		
		RunTest.runTest(myArray,driver,page, section);
		
	}
	
//adding Find Local Resources	            SJ
	public static void findLocalResources(WebDriver driver, String page) throws InterruptedException{
		String section ="Find Local Resources";
		String[] findLocalResources = {
				"xpath",
				"//*[@id='block-daip-location-services-daip-local-resources-block']",
				"Find Local Resources" };
		String[] FEMADRClink = {
				"xpath",
				"//*[@id='local-resources-intro-container']/p/a[1]",
				"FEMA DRC link"};
		String[] redCrossLink = {
				"xpath",
				"//*[@id='local-resources-intro-container']/p/a[2]",
				"Red Cross link"};
		String[] emergencymanagementLink = {
				"xpath",
				"//*[@id='local-resources-intro-container']/p/a[3]",
				"Emergency Management Agency"};
		String[] hospitalFinderLink = {
				"xpath",
				"//*[@id='local-resources-intro-container']/p/a[4]",
				"US Hospital Finder"};
		String[] localResourcesInput = {
				"xpath",
				"//*[@id='local-resources-input']",
				"Local Resources Input Field"};
		String[] localResourcesSearch = {
				"xpath",
				"//*[@id='local-resources-button']",
				"Local Resources Search Button"};
		
		String[][] myArray = {
				findLocalResources,FEMADRClink, redCrossLink, emergencymanagementLink, hospitalFinderLink, localResourcesInput,localResourcesSearch};
		
		RunTest.runTest(myArray,driver,page, section);
	}
				
	//updated the Name field under Items of Interest            SJ
	public static void itemsofInterest(WebDriver driver,String page) throws InterruptedException{
		String section = "Items of Interest";
		String[] itemsOfInterestContainer = {
				"id",
				"block-nodeblock-14932",
				"Items of Interest Section"};
		String[] ItemsOfInterestImage = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[1]/div[1]",
				"Items of Interest Image"};
		String[] ItemsOfInterest1 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[1]/article/a/span",
				"Items of Interest -> Food, Housing & Other Immediate Needs"};
		String[] ItemsOfInterest2 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[2]/article/a/span",
				"Items of Interest -> Application Checklist"};
		String[] ItemsOfInterest3 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[3]/article/a/span",
				"Items of Interest -> FEMA’s Public Assistance Program"};
		String[] ItemsOfInterest4 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[4]/article/a/span",
				"Items of Interest -> FEMA Disaster Recovery Center (DRC)"};
		String[] ItemsOfInterest5 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[5]/article/a/span",
				"Items of Interest -> Assistance by Category"};
		String[] ItemsOfInterest6 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[6]/article/a/span",
				"Items of Interest -> FAQs"};
		String[] ItemsOfInterest7 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[7]/article/a/span",
				"Items of Interest -> Transitional Sheltering Assistance (TSA) Program - Participating Hotel List"};
		String[] ItemsOfInterest8 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[8]/article/a/span",
				"Items of Interest -> Assistance by Fed"};
		String[] ItemsOfInterest9 = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[2]/div[2]/div/div[9]/article/a/span",
				"Items of Interest -> Contact Us"};
		
				
		String[][] myArray = {
				itemsOfInterestContainer,ItemsOfInterestImage,ItemsOfInterest1,ItemsOfInterest2, ItemsOfInterest3,ItemsOfInterest4,
				ItemsOfInterest5, ItemsOfInterest6,ItemsOfInterest7,ItemsOfInterest8,ItemsOfInterest9};

		RunTest.runTest(myArray,driver,page, section);
		
	}
	public static void disasterMap(WebDriver driver,String page) throws InterruptedException{
		String section = "Disaster Map";
		String[] DisasterMapContainer = {
				"xpath",
				"//*[@id=\"block-daip-location-services-daip-disaster-map-block\"]",
				"Disaster Map Section"};
		String[] DisasterMapSectionImage = {
				"xpath",
				"//*[@id=\"block-nodeblock-14932\"]/div[1]/div[1]",
				"Disaster Map Section Image"};
		String[] DisasterMapIntroText = {
				"xpath",
//				"//*[@id=\"block-daip-location-services-daip-disaster-map-block\"]/p",
				"//*[@id='block-daip-location-services-daip-disaster-map-block']/div[1]/div[2]/h2",
				"Disaster Map Intro Text"};
		String[] map = {
				"xpath",
				"//*[@id=\"svg2\"]",
				"Disaster Map"};		
		String[][] myArray = {
				DisasterMapContainer,DisasterMapSectionImage,DisasterMapIntroText,map};
		
		RunTest.runTest(myArray,driver,page, section);		
	}
	public static void twitter_DisasterNews(WebDriver driver,String page) throws InterruptedException{
		String section = "Twitter and Disaster News";
		String[] twitter_RDN_container = {
				"xpath",
				"//*[@id=\"mid-content\"]",
				"Twitter and Recent Disaster News Section"};
		String[] TwitterSection = {
				"xpath",
				"//*[@id=\"block-twitter-block-1\"]",
				"Twitter Section"};
		String[] introText = {
				"xpath",	
				"//*[@id='block-twitter-block-1']/div/div[3]/p" ,       
				
				// in prod     
//				"//*[@id=\"block-nodeblock-14993\"]/div",
				"Twitter RDN intro text"};
		
		
		String[][] myArray = {
				twitter_RDN_container,TwitterSection,introText};
		//
	
		RunTest.runTest(myArray,driver,page, section);		
	}
	
}
