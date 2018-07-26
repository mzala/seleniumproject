package stepDefinition;

import Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ebaySearchStepDefinition extends BaseClass{
	
	@Given("^I am on google homepage$")
	public void i_am_on_google_homepage() throws Throwable {	
		
		initialisation();
	}
	
	@When("^I Search for 'cars in london' and result dislayed$")
	public void i_Search_for_cars_in_london_and_result_dislayed() throws Throwable {
		searchcars();
	}
	
	@Then("^validate how many gumtree links available on first page$")
	public void validate_how_many_gumtree_links_available_on_first_page() throws Throwable {
		validatelinks();
	}
	
	@Then("^go on first link to confirm the title$")
	public void go_on_first_link_to_confrim_the_title() throws Throwable {
		varifytitle1();
	}
		
	@Then("^go on second link to confirm the title$")
	public void go_on_second_link_to_confrim_the_title() throws Throwable {
		varifytitle2(); 
	}

}


