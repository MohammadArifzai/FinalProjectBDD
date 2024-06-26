package bdd.finalProject.pages;

import org.openqa.selenium.By;

public class LogInPage {

    public static final By USER_NAME_INPUT_FIELD
            = By.xpath("//*[@id='username']");
    public static final By PASSWORD_INPUT_FIELD
            = By.xpath("//*[@id='password']");
    public static final By SIGN_IN_BUTTON
            = By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/form/div/div[3]/button[1]");
    public static final By ERROR_MESSAGE
            = By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div");


}
