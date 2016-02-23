package daScripts;

import java.io.IOException;
import java.util.ArrayList;

import javax.mail.MessagingException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RunTest {
	
	public RunTest(WebDriver driver){
		
	}	
	public static void emailTest() throws InterruptedException, MessagingException, IOException {
		String[] allEnglishPages = {
				"Welcome","Get Assistance","Information","About Us","Help",
				"Address Look-up","Assistance by Category", "Assistance by Federal Agency",
				"Application Checklist","Forms","News Feeds", "Immediate Needs","Moving Forward",
				"Community Resources","Disabilities of Access and Functional Needs", "Older Americans",
				"Children and Families", "Disaster Types", "Foreign Disasters", "Fact Sheets",
				"Overview", "Partners", "FAQ", "Contact Us","Privacy Policy","Accessibility","Download Plug-ins"
				};
		
		String[] allSpanishPages = {
				"Disaster Assistance","Obtener Asistencia","Información","Acerca De","Ayuda",
				"Buscar Dirección","Asistencia por Categoría", "Asistencia por Agencia Federal",
				"Lista de verificación para aplicarse","Formularios","Canales de Noticias", "Necesidades Inmediatas","Próximo Paso",
				"Recursos de la Comunidad","Discapacidades o Necesidades Funcionales y de Acceso", "Adultos Mayores Estadounidenses",
				"Niños y Familias", "Los Recursos del Desastre", "Desastres en el Extranjero", "Hojas de datos",
				"Descripción General", "Socios", "Preguntas Comunes", "Contáctenos","Política de Privacidad",
				"Accesibilidad","Descargar plug-ins"
				};
		
		for(int i = 0; i < allEnglishPages.length; i++) {
			EmailCheck.run(allEnglishPages[i]);
			EmailCheck.run(allSpanishPages[i]);}

	}
	public static void runTest(String [][] myArray, WebDriver driver, String page, String section) throws InterruptedException
	{
		String [][] currentArray = myArray;
		
		for(int i = 0; i<currentArray.length;i++)
		{
			if(currentArray[i][0].equals("id"))
			{
				findId(currentArray,i, driver, page, section);
				
			}
			if(currentArray[i][0].equals("name"))
			{
				findName(currentArray, i, driver, page,section);
			}
			if(currentArray[i][0].equals("xpath"))
			{
				findXpath(currentArray, i, driver, page, section);
			}
			if(currentArray[i][0].equals("class"))
			{
				findClass(currentArray, i, driver,page, section);
			}
			if(currentArray[i][0].equals("css"))
			{
				findCss(currentArray, i, driver,page, section);
			}
			
			Thread.sleep(500);
			
		}	
			
	}
	
	public static void findClass(String [][] myArray, int count, WebDriver driver, String page, String section)
	{
		String [][] currentArray = myArray;
		int i = count;
		
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.className(currentArray[i][1]))).build().perform();;
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
		}
		
		catch(Exception e)
		{
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
		}
	}
	
	public static void findId(String [][] myArray, int count, WebDriver driver, String page, String section)
	{
		String [][] currentArray = myArray;
		int i = count;
		
		try
		{
			driver.findElement(By.id(currentArray[i][1]));
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
		}
		
		catch(Exception e)
		{
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
		}
	}
	
	public static void findName(String [][] myArray, int count, WebDriver driver, String page,String section)
	{
		String [][] currentArray = myArray;
		int i = count;
		
		try
		{
			driver.findElement(By.name(currentArray[i][1]));
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
		}
		
		catch(Exception e)
		{
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
		}
	}
	public static void findXpath(String [][] myArray, int count, WebDriver driver, String page,String section)
	{
		
		String [][] currentArray = myArray;
		int i = count;
		
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath(currentArray[i][1]))).build().perform();;
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
		}
		
		catch(Exception e)
		{
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
			
		}
	}
	public static void findCss(String [][] myArray, int count, WebDriver driver, String page,String section)
	{
			
		String [][] currentArray = myArray;
		int i = count;
			
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.cssSelector(currentArray[i][1]))).build().perform();;
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Pass</td><td>"+currentArray[i][2]+"</td></tr>");
		}
			
		catch(Exception e)
		{
			System.out.println("<tr><td>"+page+"</td><td>"+section+"</td><td>Fail</td><td>"+currentArray[i][2]+"</td></tr>");
				
		}
	}
	public static void translate(WebDriver driver){
		driver.findElement(By.xpath("//*[@id=\"language-switcher-container\"]/ul/li[2]/a")).click();
		}
	public static void backgroundImage(WebDriver driver, String page){
		ArrayList<String> urls = new ArrayList<String>();
		urls.add("url("+ "http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize1.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize2.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize3.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize4.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize1_1.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize2_0.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize3_0.jpg)");
		urls.add("url("+"http://" + seleniumTest.domain +".disasterassistance.gov/sites/default/files/DAIP_resize4_0.jpg)");
		try
		{
		WebElement element = driver.findElement(By.cssSelector("#background-image-container"));
		String backgroundValue = element.getCssValue("background-image");
			if(urls.contains(backgroundValue))
				{
			System.out.println("<tr><td>"+page+"</td><td>Background Image</td><td>pass</td><td>"+backgroundValue+"</td></tr>");
				}
		}
		catch(Exception e){
			
			System.out.println("<tr><td>"+page+"</td><td>Background Image</td><td>Fail</td><td>No background Image Found</td></tr>");
		}
		
	}

}
