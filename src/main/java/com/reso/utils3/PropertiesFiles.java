
     //We are just generalize we pass any properties file and je key havi ahe te pass karaych it gives all details
     // we can customize the data
package com.reso.utils3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFiles {
	  // We can generalize  
       public String getValue(String filePath, String key)  {
          String baseDir = System.getProperty("user.dir");
          String value = "";
           try {
			FileInputStream fis = new FileInputStream(baseDir+filePath);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
           return value;
	}
}
