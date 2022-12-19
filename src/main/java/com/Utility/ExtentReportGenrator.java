package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportGenrator {

	public static ExtentReports getReports() {
		
		String filepath ="F:\\Software testing\\Automation testing\\Day 3\\program\\Laksh_Framework\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("Automarion Test Report");
		reporter.config().setReportName("Laksh Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "Batch 15 Project");
		extent.setSystemInfo("Module Name", "Facebook login");
		extent.setSystemInfo("Automation", "Selenium WebDriver");
		extent.setSystemInfo("QA", "L.D.R");
		return extent;
	}

}
