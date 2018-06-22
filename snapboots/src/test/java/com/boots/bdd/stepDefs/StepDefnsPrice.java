package com.boots.bdd.stepDefs;

import com.boots.bdd.page_objects.HeaderPage;
import com.boots.bdd.page_objects.ResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefnsPrice {
    HeaderPage headerPage = new HeaderPage();
    ResultPage resultPage = new ResultPage();

    @Given("^when I am on the home page Boots$")
    public void when_I_am_on_the_home_page_of_Boots() {

    }

    @When("^I search for a specific product$")
    public void i_search_for_a_product(){
       headerPage.doSearch();
    }

    @When("^I select a filter called by \"([^\"]*)\"$")
    public void i_select_a_filter_by(String priceFilterValue){
        resultPage.filterProductByPrice(priceFilterValue);
    }

    @Then("^I should see results filtered by price$")
    public void i_should_see_results_filtered_by_price() {

    }

}
