package com.example.stepdefinitions;

import com.example.domain.Dog;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class Steps {

    private Dog dog;

    @Given("^I have a dog$")
    public void iHaveADog() throws Throwable {
        dog = new Dog();
    }

    @Given("^the dog is rested$")
    public void theDogIsRested() throws Throwable {
        dog.setRested(true);
    }

    @When("^I throw the frisbee$")
    public void iThrowTheFrisbee() throws Throwable {
        //throw new PendingException();
    }

    @Then("^the dog catches the frisbee$")
    public void theDogCatchesTheFrisbee() throws Throwable {
        assertTrue(dog.catchesFrisbee());
    }

    @Given("^the dog is not rested$")
    public void theDogIsNotRested() throws Throwable {
        dog.setRested(false);
    }

    @Then("^the dog naps$")
    public void theDogNaps() throws Throwable {
        assertTrue(dog.isNapping());
    }

}
