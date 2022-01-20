package com.thinatech.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@CucumberContextConfiguration
@Import(MyService.class)
public class StepDefinitions {

    @Autowired
    MyService myService;

    private Integer first;
    private Integer second;

    @Given("Operation {string}")
    public void setOperation(String operation) {
    }

    @When("first number is {int}")
    public void setFirst(Integer arg0) {
        this.first = arg0;
    }

    @When("second number is {int}")
    public void setSecond(Integer arg0) {
        this.second = arg0;
    }

    @Then("result should be {int}")
    public void assertAddition(Integer arg0) {
        Assertions.assertEquals(myService.add(first, second).intValue(), arg0);
    }
}
