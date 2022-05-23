
// This program of general things we use

package com.resonancetest;

import com.resonance.keywords12.UIkeywords12;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.BaseClass21;
import com.reso.utils3.EnvironmentsFiles;
import com.reso.utils3.PropertiesFiles;
import com.reson.configuration.BasesTests;
import com.resona0.pageobjmodl.HomesPages;

public class RegressionTests12 extends BasesTests{  //before BaseClass21 is present
	
	//EnvironmentsFiles env = new EnvironmentsFiles();
	
	UIkeywords12 keyword = new UIkeywords12();
	@Test
	public void verifyTitleOfHomePage() throws FileNotFoundException {
		// WebDriverManager.chromedriver().setup();
		// RemoteWebDriver driver = new ChromeDriver();

		//openBrowser("chrome");
		// UIkeywords.driver.get("");
		
		//launchUrl("https://testingshastra.com/assignments");
		
	    //launchUrl(env.getAppUrl4()); // we don't need to hard code by using envo object we tkae it anything from here
		
		// driver.get("");
		
		// String actualTitle = driver.getTitle();
		String actualTitle =UIkeywords12.getTitle();
		WebElement element = null;
		// By by = By.xpath("");
		
		//enterText("input#user", "Hello");
	    //UIkeywords.click("cssl","");
		//driver.findElement(By.cssSelector("button.alert-btn")).click();
	    // UIkeywords.enterText(by, "Hello");
		// WebElement element =UIkeywords.driver.findElement(By.xpath(""));
		// UIkeywords.enterText("//input[@id='123']", "Hello");
		//Assert.assertEquals("Home Page", actualTitle);
	}
    @Test
	public void verifySimpleAlertIsOpened() {
    	PropertiesFiles prop = new PropertiesFiles();
    	
    	//String assignments = prop.getValue("/src/main/resources/ObjectRepository.properties", "assignments");1
        //UIkeywords12.click(repos.AssignmentLocator());//This is another way of reading properties file  2
        //String confmAlert = prop.getValue("/src/main/resources/ObjectRepository.properties", "confirmation_alert");1
	    
    	//This is the one way of initialization of page factory class 
    	//HomesPages homes = PageFactory.initElements(keyword.driver, HomesPages.class);
    	HomesPages homes = new HomesPages();
    	homes.clickOnAssignments();
    	
        UIkeywords12.click(repos.SimpleAlertLocator());              //2
	    
    }
}
