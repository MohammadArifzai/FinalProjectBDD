package bdd.finalProject.steps;

import bdd.finalProject.pages.UserProfilePage;
import bdd.finalProject.utility.SeleniumUtilities;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class UserProfileSteps extends SeleniumUtilities {



    @Then("validate STATUS is (.*)$")
    public void validate_STATUS_is(String expectedStatus) {

        String actualStatus = getElementText(UserProfilePage.STATUS);
        assert actualStatus.equals(expectedStatus) : "STATUS is not as expected. Actual: " + actualStatus + ", Expected: " + expectedStatus;


    }

    @Then("validate USER TYPE is (.*)$")
    public void validate_USER_TYPE_is(String expectedUserType) {

        String actualUserType = getElementText(UserProfilePage.USER_TYPE);
        assert actualUserType.equals(expectedUserType) : "USER TYPE is not as expected. Actual: " + actualUserType + ", Expected: " + expectedUserType;

    }

    @Then("validate FULL NAME is (.*)$")
    public void validate_FULL_NAME_is(String expectedFullName) {

        String actualFullName = getElementText(UserProfilePage.FULL_NAME);
        assert actualFullName.equals(expectedFullName) : "FULL NAME is not as expected. Actual: " + actualFullName + ", Expected: " + expectedFullName;

    }

    @Then("validate USER NAME is (.*)$")
    public void validate_USER_NAME_is(String expectedUsername) {

        String actualUsername = getElementText(UserProfilePage.USER_NAME);
        assert actualUsername.equals(expectedUsername) : "USER NAME is not as expected. Actual: " + actualUsername + ", Expected: " + expectedUsername;



    }

    @Then("validate AUTHORITIES include (.*)$")
    public void validate_AUTHORITIES_include(String expectedAuthority) {

        List<WebElement> authorityElements = getDriver().findElements(UserProfilePage.AUTHORITIES);
        List<String> actualAuthorities = new ArrayList<>();
        for (WebElement element : authorityElements) {
            actualAuthorities.add(element.getText());


        }
        assert actualAuthorities.contains(expectedAuthority) : "AUTHORITIES do not include " + expectedAuthority + ". Actual: " + actualAuthorities;
    }

    @Then("user clicks on the Logout button")
    public void user_clicks_on_logout(){
        clickOnElement(UserProfilePage.LOGOUT_BUTTON);

    }


}





