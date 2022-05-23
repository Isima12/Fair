package com.base;

import org.testng.annotations.BeforeMethod;

import com.resonance.keywords12.UIkeywords12;

public class BaseClass21 {
	  @BeforeMethod
      public void launchBrowser() {
          UIkeywords12.openBrowser("chrome");
	}
}
