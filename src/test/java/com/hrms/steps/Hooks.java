package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonMethods {

	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting scenario " + scenario.getName());
		setUp();//in base class
		
	}

	@After
	public void end(Scenario scenario) {
		System.out.println("Ending scenario " + scenario.getName());
		// taking a pic
		if (scenario.isFailed()) {
			byte[] pic = takeScreenshoti("/FAIL/" + scenario.getName());
			scenario.embed(pic, "image/pgn");

		} else {
			byte[] pic = takeScreenshoti("/PASS/" + scenario.getName());
			scenario.embed(pic, "image/pgn");
		}
		System.out.println("Ending scenario " +scenario.getName());
		//tearDown();
	}
}
