package com.resonancetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.resona0.pageobjmodl.HomesPages;

public class HomePagesTests {
	
	@Test
	
       public void verifyTitleOfTheHomePage() {
            HomesPages home = new HomesPages();
            String title = home.getTitle();
            Assert.assertEquals("Home Page", title,"Title didn't match");
	}
}
