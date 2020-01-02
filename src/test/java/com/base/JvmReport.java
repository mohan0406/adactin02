package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	/**
	 * @see creating custom report
	 * @param json
	 */
	public static void generateJvmReport(String json) {
		// TODO Auto-generated method stub
File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\reporting" );
		Configuration con = new Configuration(f,"Adactin project");
				
		con.addClassifications("broser: ", "chrome");
		con.addClassifications("Browser version", "v79");
		con.addClassifications("sprint", "56");

		List<String> lstfile = new ArrayList<String>();
		lstfile.add(json);
		ReportBuilder builder = new ReportBuilder(lstfile, con);
		builder.generateReports();
	}
}
