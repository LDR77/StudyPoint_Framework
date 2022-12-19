package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider() throws Exception {
		
		String filePath="F:\\Software testing\\Automation testing\\Day 3\\program\\Laksh_Framework\\Config\\config.Properties";
		FileInputStream fis = new FileInputStream(filePath);
		
		pro = new Properties();
		pro.load(fis);
	}


	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
	
	public String getBrowserChrome() {
		return pro.getProperty("BrowserChrome");
	}
	
	public String getBrowserEdge() {
		return pro.getProperty("BrowserEdge");
		
	}
	
	public String getExcelPath() {
		return pro.getProperty("ExcelPath");
	}
}

