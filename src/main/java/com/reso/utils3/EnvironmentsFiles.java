
  //In this program we handle only environment files  (here only we get data from environment properties file


package com.reso.utils3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentsFiles {
	/**
	 * This method returns the app url present in environment.properties file
	 * @throws FileNotFoundException 
	 */
      public String getAppUrl4() throws FileNotFoundException {
    	  String baseDir = System.getProperty("user.dir");  //this is used for get current working directory(means environment.properties) and file handling in framework
    	  System.out.println("Base DIR: "+baseDir);
    	  FileInputStream fis = new FileInputStream(baseDir+"/src/main/resources/enviornment1.properties");
          Properties prop = new Properties();
          
          //Interview Question: How to read properties  file?by using java Properties class we can read
          
          String value = "";
          
          try {
			prop.load(fis);
			value = prop.getProperty("app_url");
		} catch (IOException e) {
			e.printStackTrace();
		}
          return value;
          
	}
      //public static void main(String[] args) throws FileNotFoundException {
		 //new EnvironmentsFiles().getAppUrl4();
	//}
}


