package com.reson.configuration;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.reso.utils3.EnvironmentsFiles;
import com.reso.utils3.ObjectRepository;
import com.resonance.keywords12.UIkeywords12;

public class BasesTests {
	public static EnvironmentsFiles env = new EnvironmentsFiles();
	public static ObjectRepository repos = new ObjectRepository(); 
	@BeforeMethod
    public void setUps() throws FileNotFoundException {
		UIkeywords12.openBrowser("chrome");
		UIkeywords12.launchUrl(env.getAppUrl4());

	}
	@AfterMethod
	public void tearDown() {
        UIkeywords12.quiteBrowser();
	}
}
