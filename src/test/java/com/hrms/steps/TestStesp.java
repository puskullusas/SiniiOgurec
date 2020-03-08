package com.hrms.steps;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

//ctrl+shft+O, to import packages

public class TestStesp {

	@When("I do some step")
	public void i_do_some_step() {
		System.out.println("I do some step");
	}

	@When("I do another step")
	public void i_do_another_step(DataTable dataTable) {
		System.out.println(dataTable);
		System.out.println("return as List: " + dataTable.asList());
		System.out.println("************");
		System.out.println("return as List of Lists: " + dataTable.asLists());
		
		// we can iterate
		for(List<String> row: dataTable.asLists()) {
			//every row is a List
			//System.out.println("Row " +row);
			for (String cell : row) {
				System.out.print(cell);
			}
			System.out.println();
			
			//another method .asMaps, retrieve key-value, the first row will always be the header
			
			System.out.println(dataTable.asMaps());
			List<Map<String,String>> mapList = dataTable.asMaps();
			for (Map<String, String> map: mapList) {
				System.out.println(map);
				//to get the keys
				map.keySet();
				Set<String> keys = map.keySet();
				System.out.println("keys : " + keys);
				
				Collection<String> values = map.values();
				System.out.println("values: " + values);
				
				//get the keys for every map
				for(String key: keys) {
					System.out.println(key + " ->>" + map.get(key)); //keys for one map
				}
			}
			System.out.println("2 rows" +dataTable.rows(0,2)); //returns data table
			System.out.println("1 row " +dataTable.row(1)); //returns list of strings, which can be iterated
		}
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes(DataTable dataTable1) {

		System.out.println(dataTable1);
		
	}
	
	//scenario outline
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer value) {
	   System.out.println("I check for the {int} in step");
	   System.out.println(value);
	}

	@Then("I verify the {int}  and {string} in step")
	public void i_verify_the_and_in_step_if_we_use_quotes_it_will_see_it_as_a_string(Integer value, String status) {
	   System.out.println("I verify value "  + value + " result " + status);
	   String expected = "Success";
	   Assert.assertEquals(expected, status);
	}
}
