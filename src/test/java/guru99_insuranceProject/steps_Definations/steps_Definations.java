package guru99_insuranceProject.steps_Definations;

import guru99_insuranceProject.Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps_Definations{

    HomePage homePage = new HomePage();


    @When("The user wants to go to gutu99 insurance project")
    public void the_user_wants_to_go_to_gutu99_insurance_project() {
homePage.setRegister();
    }
    @Then("The user wants to verify that user is on the insurance page")
    public void the_user_wants_to_verify_that_user_is_on_the_insurance_page() {

    }

}
