package com.stepdefiniton;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	/**
	 * @see lunch browser
	 */
	@Before
	public void browserLaunch() {
		// TODO Auto-generated method stub
		launchBrowser();
		loadUrl(propertyFileConfig("url"));
	}

	/**
	 * @see take screenshot for report
	 * @param sc
	 */
	@After
	public void close(Scenario sc) {
		// TODO Auto-generated method stub

		if (sc.isFailed()) {
			TakesScreenshot sk = (TakesScreenshot) driver;
			byte[] sch = sk.getScreenshotAs(OutputType.BYTES);
			System.out.println(sch[0]);
			sc.embed(sch, "fail/png");
		} else {
			TakesScreenshot sk = (TakesScreenshot) driver;
			byte[] sch = sk.getScreenshotAs(OutputType.BYTES);
			System.out.println(sch[0]);
			sc.embed(sch, "pass/png");
		}
		quitBrowser();

	}

}
