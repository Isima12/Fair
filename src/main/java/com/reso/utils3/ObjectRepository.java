package com.reso.utils3;

public class ObjectRepository {
	String filePath = "/src/main/resources/ObjectRepository.properties";
	PropertiesFiles prop = new PropertiesFiles();
        public String AssignmentLocator() {
        	
        	return prop.getValue(filePath, "assignments");
		}
		public String SimpleAlertLocator() {
			return prop.getValue(filePath, "simple_alert");
		}
}
