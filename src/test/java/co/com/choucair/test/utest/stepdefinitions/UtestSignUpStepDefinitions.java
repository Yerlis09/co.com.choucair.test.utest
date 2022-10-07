package co.com.choucair.test.utest.stepdefinitions;

import co.com.choucair.test.utest.model.UTestSignUpData;
import co.com.choucair.test.utest.questions.Answer;
import co.com.choucair.test.utest.taks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestSignUpStepDefinitions {
    @Before

    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Yerlys wants to sign up at the uTest page$")
    public void thanYerlysWantsToSignUpAtTheUTestPage() {

        OnStage.theActorCalled("Yerlys").wasAbleTo(OpenUp.thePage(), SignUp.signUpPage());
    }

    @When("^fill in the form for registration$")
    public void fillInTheFormForRegistration(List<UTestSignUpData> uTestSignUpData) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormOne.the(uTestSignUpData.get(0)), FormTwo.the(uTestSignUpData.get(0)), FormThree.the(uTestSignUpData.get(0)), FormFour.the(uTestSignUpData.get(0)));
    }

    @Then("^see the welcome page to the uTest portal$")
    public void seeTheWelcomePageToTheUTestPortal(List<UTestSignUpData> uTestSignUpData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestSignUpData.get(0).getStrTextToWelcome())));
    }
}
