package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {
    @Given("user is on Etsy landing page")
    public void user_is_on_etsy_landing_page() {
        String url = ConfigurationReader.getProperty("etsyUrl");
        Driver.getDriver().get(url);
    }

    @Then("user should see the Etsy title as expected")
    public void user_should_see_the_etsy_title_as_expected() {
       String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
       String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not as expected!", actualTitle.equals(expectedTitle));
    }

    @When("user types Wooden Spoon")
    public void user_types_wooden_spoon() {

        EtsyPage etsyPage = new EtsyPage();
        etsyPage.searchBar.sendKeys("Wooden spoon");
    }

    @When("user clicks to search button")
    public void user_clicks_to_search_button() {

        EtsyPage etsyPage = new EtsyPage();
        etsyPage.submitButton.click();
    }


    @Then("user sees title is Wooden Spoon | Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Wooden spoon";

        Assert.assertTrue("Title is not correct", actualTitle.contains(expectedTitle));
    }
}
