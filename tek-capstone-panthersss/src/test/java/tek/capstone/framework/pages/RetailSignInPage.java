package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetupp;

public class RetailSignInPage extends BaseSetupp {

    public RetailSignInPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "newAccountBtn")
    public WebElement newAccountButton;

    @FindBy(id = "nameInput")
    public WebElement nameInput;

    @FindBy(id = "emailInput")
    public WebElement emailInput;

    @FindBy(id = "passwordInput")
    public WebElement passwordInput;

    @FindBy(id = "confirmPasswordInput")
    public WebElement confirmPasswordInput;

    @FindBy(id = "signupBtn")
    public WebElement signUpButton;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

}
