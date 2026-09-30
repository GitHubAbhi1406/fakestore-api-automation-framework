package com.fakestore.api.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fakestore.api.constants.FrameworkConstants;

public class ConfigReader{
	
	private static Properties properties;
	
	static {
		
		properties = new Properties();
		
		try {
			
			FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);
			properties.load(fis);
			fis.close();
			
		}catch(IOException e) {
			throw new RuntimeException("Unable to load config.properties", e);
		}
	}
	
	public static String getBaseUrl() {
		
		return properties.getProperty("baseUrl");
	}
}