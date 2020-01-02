package com.adactinrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JvmReport;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/feature/adactin.feature" }, glue = "com.stepdefiniton", tags = "@Sanity", dryRun = false, plugin = {
				"json:src\\test\\resources\\report\\report.json", "rerun:src\\test\\resources\\feature\\failed.txt" })
/**
 * @see Runner class
 * @author user
 * @created by Mohanraj
 * @created date 12/29/2019
 */
public class Runner {

	@AfterClass
	public static void afterclass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\report\\report.json");
	}
}
