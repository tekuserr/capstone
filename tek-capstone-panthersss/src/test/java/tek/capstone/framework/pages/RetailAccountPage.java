package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetupp;

public class RetailAccountPage extends BaseSetupp {

    public RetailAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "accountLink")
    public WebElement accountButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;

    //@FindBy(id = "phoneNumberInput")
    @FindBy(xpath="//input[@class = 'account__input'][@id = 'personalPhoneInput']")
    public WebElement phoneNumberInput;

    @FindBy(id = "personalUpdateBtn")
    public WebElement updateButton;

    @FindBy(xpath = "//h1[text()='Your Profile']")
    public WebElement profileInformationUpdated;

    @FindBy(id = "previousPasswordInput")
    public WebElement previousPasswordInput;

    @FindBy(id = "newPasswordInput")
    public WebElement newPasswordInput;

    @FindBy(id = "confirmPasswordInput")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[text()='Change Password']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//p[text()='Add a payment method']")
    public WebElement addPaymentMethodLink;

    @FindBy(id = "cardNumberInput")
    public WebElement cardNumberInput;

    @FindBy(id = "nameOnCardInput")
    public WebElement nameOnCardInput;

    @FindBy(id = "expirationMonthInput")
    public WebElement expirationMonthInput;

    @FindBy(id = "expirationYearInput")
    public WebElement expirationYearInput;

    @FindBy(id = "securityCodeInput")
    public WebElement securityCodeInput;

    @FindBy(xpath = "//button[text()='Add Your card']")
    public WebElement addYourCard;
    
    @FindBy(xpath="//div[text()='Payment Method added sucessfully']")
    public WebElement cardAddedSuccessfully;
    

    @FindBy(xpath = "(//img[@alt='Master Card'])[1]")
    public WebElement clickOnMasterCardLink;

    @FindBy(xpath = "//button[text()='Edit']")
    public WebElement editCardButton;

    @FindBy(xpath = "//button[text()='Update Your Card']")
    public WebElement updateYourCard;
    
    @FindBy(xpath="//div[text()='Payment Method updated Successfully']")
    public WebElement paymentUpdatedSuccessfully;

    @FindBy(xpath = "//button[text()='remove']")
    public WebElement removeButton;

    @FindBy(xpath = "//p[text()='Add Address']")
    public WebElement addAddresss;

    @FindBy(id = "countryDropdown")
    public WebElement countryDropDown;

    @FindBy(name = "fullName")
    public WebElement fullName;

    @FindBy(id = "phoneNumberInput")
    public WebElement phoneNumberInputs;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(id = "apartmentInput")
    public WebElement apartmentInput;

    @FindBy(id = "cityInput")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@name='state']")
    public WebElement state;

    @FindBy(id = "zipCodeInput")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//button[text()='Add Your Address']")
    public WebElement addYourAddress;

    @FindBy(xpath = "//div[text()='Address Added Successfully']")
    public WebElement addressAddedSuccessfully;

    @FindBy(xpath = "//button[text()='Edit']")
    public WebElement editAddress;

    @FindBy(xpath = "//button[text()='Update Your Address']")
    public WebElement updateYourAddressButton;

    @FindBy(xpath = " //*[text()='Address Updated Successfully']")
    public WebElement addressUpdatedSuccessfully;
 
    @FindBy(xpath = "//button[text()='Remove']")
    public WebElement removeAddress;
    
    @FindBy(xpath = "//div[@class = 'account__address-single']") 
    public WebElement addressSign;

}
