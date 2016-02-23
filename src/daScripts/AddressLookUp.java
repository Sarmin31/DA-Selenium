package daScripts;

import org.openqa.selenium.WebDriver;

public class AddressLookUp {
	static String page = "Get Assistance::Address Look-up";
	public AddressLookUp(){
		
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for the Address Look-up");
		driver.get("http://www.disasterassistance.gov/address-lookup");
		Header.run(driver, page);
		addressLookup(driver, page);
		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + " - Spanish";
		
		Header.run(driver, spanishPage);
		addressLookup(driver, spanishPage);
		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://www.disasterassistance.gov/");
	}
	
	public static void addressLookup(WebDriver driver, String page) throws InterruptedException{
		String section = "Address Lookup";
		String[] lookupContainer={
				"xpath",
				"//*[@id=\"address_lookup_form_container\"]",
				"lookupContainer"};
		
		
		String[] lookupField={
				"id",
				"address-text-field",
				"Address Lookup Field"};
		
		String[] lookupSubmit={
				"id",
				"address-lookup-submit",
				"Address Lookup Submit"};
		
		String[] resultsHeader={
				"xpath",
				"//*[@id=\"disaster-lookup-results-table\"]/thead/tr",
				"Disaster Results Header"};
		
		String[] buttonDisasterName={
				"id",
				"table-header-disaster-title",
				"Disaster Name Button"};
		
		String[] buttonDisasterType={
				"id",
				"table-header-disaster-type",
				"Disaster Type Button"};
		
		String[] buttonDeclaredDate={
				"id",
				"table-header-disaster-date",
				"Declared Date Button"};
		
		String[] buttonCountyEquivalent={
				"id",
				"table-header-disaster-county",
				"County Equivalent Button"};
		
		String[] resultsMessage={
				"xpath",
				"//*[@id=\"no-results-message\"]",
				"Disaster Results Message"};
		
				
		String[][] myArray ={
				lookupContainer,lookupField,lookupSubmit,resultsHeader,buttonDisasterName,buttonDisasterType,
				buttonDeclaredDate,buttonCountyEquivalent,resultsMessage};
		
		RunTest.runTest(myArray,driver,section,page);
	}
}
