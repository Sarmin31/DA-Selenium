package daScripts;

import org.openqa.selenium.WebDriver;

public class ImmediateNeeds {
	static String page = "Information::Immediate Needs";
	public ImmediateNeeds(){
	}
	
	public static void run(WebDriver driver) throws InterruptedException{
		//System.out.println("Running test for Immediate Needs");
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/information/immediate-needs");
		Header.run(driver, page);
		immediateNeedsContent(driver, page);
		immediateNeedsImagesEn(driver,page);
		RunTest.backgroundImage(driver, page);
//		SendEmail.run(driver);
		Footer.run(driver, page);
		
		RunTest.translate(driver);
		String spanishPage = page + "-Spanish";
		
		Header.run(driver, spanishPage);
		immediateNeedsContent(driver, spanishPage);
		immediateNeedsImagesES(driver,spanishPage);
		RunTest.backgroundImage(driver, spanishPage);
//		SendEmail.run(driver);
		Footer.run(driver, spanishPage);
		
		driver.get("http://" + seleniumTest.domain +".disasterassistance.gov/");
	}
	
	public static void immediateNeedsContent(WebDriver driver, String page) throws InterruptedException{
		String section = "Immediate Needs";
		String[] immediateNeedsContainer = {
				"xpath",
				"//*[@id=\"content-container\"][1]",
				"Immediate Needs Information"};
		String[] evacuate= {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[1]",
				"Evacuate or Stay Put"};
		String[] stayPut = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[2]",
				"Gathering Up Loved Ones"};
		String[] findingLostFamily = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[3]",
				"Emergency Food and Water"};
		String[] findingPets = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[4]",
				"Emergency Shelter"};
		String[] findingSafePlaces = {
				"xpath",
				"//*[@id=\"content-container\"]/article/div/div/div/div[5]",
				"Emergency Medical"};
		
		
		
		String[][] myArray = {
				immediateNeedsContainer,evacuate,stayPut,findingLostFamily,findingPets,
				findingSafePlaces };
		RunTest.runTest(myArray,driver,section,page);
	}
	public static void immediateNeedsImagesEn(WebDriver driver, String page) throws InterruptedException{
		String section = "Immediate Needs";
		
		String[] findImageOne={
				"css",
				"img[alt='Two men looking at a map to coordinate evacuations.']",
				"First Image EN"
		};
		String[] findImageTwo={
				"css",
				"img[alt='Moore, Okla., May 30, 2013 - Dustin Lasiter is reunited with his family bird Bam Bam. A variety of animals were displaced from their owners during the May 20th tornado.']",
				"Second Image EN"
		};
		String[] findImageThree={
				"css",
				"img[alt='Survivors gather food and water from a police station.']",
				"Third Image EN"
		};
		String[] findImageFour={
				"css",
				"img[alt='Red Cross shelter in an auditorium that is housing flood evacuees.']",
				"Fourth Image EN"
		};
		String[] findImageFive={
				"css",
				"img[alt=\"A Prince George's County Emergency Medical Services truck\"]",
				"Fifth Image EN"
		};
		
		String[][] myArray = {
				findImageOne, findImageTwo, findImageThree, findImageFour, findImageFive};
		RunTest.runTest(myArray,driver,section,page);
	}
	public static void immediateNeedsImagesES(WebDriver driver, String page) throws InterruptedException{
		String section = "Immediate Needs";
		
		String[] findImageOne={
				"css",
				"img[alt=\"Dos hombres ven un mapa para coordinar evacuaciones.\"]",
				"First Image ES"
		};
		String[] findImageTwo={
				"css",
				"img[alt=\"Moore, Okla., 30 de mayo de 2013 – Dustin Lasiter se reúne con su mascota familiar, Bam Bam. Muchos animales fueron separados de sus dueños durante el tornado del 20 de mayo. \"]",
				"Second Image ES"
		};
		String[] findImageThree={
				"css",
				"img[alt=\"Los sobrevivientes se reúnen alimentos y agua desde una estación de policía.\"]",
				"Third Image ES"
		};
		String[] findImageFour={
				"css",
				"img[alt=\"Red Cross shelter in an auditorium that is housing flood evacuees.\"]",
				"Fourth Image ES"
		};
		String[] findImageFive={
				"css",
				"img[alt=\"Un camión de servicios médicos de emergencia del condado de Prince George\"]",
				"Fifth Image ES"
		};
		
		String[][] myArray = {
				findImageOne, findImageTwo, findImageThree, findImageFour, findImageFive};
		RunTest.runTest(myArray,driver,section,page);
	}
	
}
