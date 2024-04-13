package stepDefinition;

import org.testng.Assert;

import Selenium.FinalAssignment.OEP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class main {
    private int number;
    private String result;

    @Given("Create a OEP Game Play object")
    public void create_oep_game_play_object() {
        // No action needed for this step
        System.out.println("created");
    }

    @When("I Play the Game with number {int}")
    public void play_game_with_number(int number) {
        this.number = number;
        this.result = OEP.play(number);
    }

    @Then("The result is ODD")
    public void verify_odd_result() {
        Assert.assertEquals("ODD", result);
    }
    
    @Then("The result is EVEN")
    public void verify_even_result() {
        Assert.assertEquals("EVEN", result);
    }
    
    @Then("The result is PRIME")
    public void verify_prime_result() {
        Assert.assertEquals("PRIME", result);
    }
}
