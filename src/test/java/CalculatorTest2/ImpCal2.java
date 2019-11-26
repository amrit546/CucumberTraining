package CalculatorTest2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImpCal2 {
      @Given("I enter 50 in calculator.")
      public void i_press_50() {
    	  System.out.println("I enter 50 in the calculator");
      }
      
      @And("I press add.")
      public void i_press_add() {
    	  System.out.println("I press add");
      }
      
      @And("I have entered 50 in the calculator.")
      public void i_enter_50() {
    	  System.out.println("I have entered 50");
      }
      
      @When("I press equal in the calculator.")
      public void i_press_equal() {
    	  System.out.println("I press equal");
      }
      
      @Then("I get the result as 100.")
      public void i_get_result() {
    	  System.out.println("I get result as 100");
      }
}
