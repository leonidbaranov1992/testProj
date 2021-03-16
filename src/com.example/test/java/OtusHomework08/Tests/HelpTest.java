package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.HelpPage;
import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.И;
import org.springframework.beans.factory.annotation.Autowired;

public class HelpTest extends BaseTests {

    @Autowired
    private HelpPage helpPage;
    @Autowired
    private MainPage mainPage;

//    @Given("I'm on main page")
//    public void openMainPage() {
//        mainPage.init();
//        mainPage.openMainPage();
//    }

    @Then("I check open help page")
    public void checkSliderBlock() {
        helpPage.checkHelpCategoryBlock();
    }


    @When("I click help menu button")
    public void openPayMenu() {
        mainPage.clickHelpMenuButton();
        helpPage.init();
    }

}
