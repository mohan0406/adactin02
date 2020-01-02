package com.adactinrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @see Runner for failed test
 * @author user
 * @Creadted by Mohanraj
 * @Creadted date 12/29/2019
 */
public class FailedRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = {
			"@src\\\\test\\\\resources\\\\feature\\\\failed.txt" }, glue = "com.stepdefiniton", tags = "@Sanity", dryRun = false, plugin = {
					"json:src\\test\\resources\\report\\report.json" }, strict = true)
	public static class Runner {

		@AfterClass
		public static void afteclass() {
			JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\report\\report.json");
		}
	}

}
