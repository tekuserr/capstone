package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetupp;

public class RetailHomePage extends BaseSetupp {

    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(id = "signinLink")
    public WebElement signIn;

    @FindBy(id = "accountLink")
    public WebElement account;

    
    
    @FindBy(xpath="//span[text()='All']")
    public WebElement AllButton;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//child::span[text()='Electronics']")
    public WebElement electronics;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//child::span[text()='Computers']")
    public WebElement computers;
    
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//child::span[text()='Smart Home']")
    public WebElement smartHome;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//child::span[text()='Sports']")
    public WebElement sports;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//child::span[text()='Automative']")
    public WebElement automative;
    
 
    //@FindBy(xpath="//span[text() = '" + optionsToDisplay.get(0).get(i) + "']")
//    @FindBy(xpath="//select[@id='search']//option[text()='Electronics']")
//    public WebElement electronicsAllDepartment;
//    
//    @FindBy(xpath="//select[@id='search']//option[text()='Computers']")
//    public WebElement computersAllDepartment;
    
  
   
    @FindBy(xpath="//select[@id='search']")
    public WebElement smartHomeAllDepartment;
    
    @FindBy(xpath="//select/option[@value='3']")
    public WebElement smartHomeDropdown;
   
   @FindBy(id="searchInput")
   public WebElement searchField;
//    
//    
//    @FindBy(xpath="//select[@id='search']option[text()='Sports']")
//    public WebElement sportsAllDepartment;
//    
//    @FindBy(xpath="//select[@id='search']//option[text()='Automative']")
//    public WebElement automativeAllDepartment;
   @FindBy(id="contentHeader")
   public WebElement shopByDepartment;
   
   @FindBy(xpath="//span[text()='TV & Video']")
   public WebElement tvAndVideo;
   
   @FindBy(xpath="//span[text()='Video Games']")
   public WebElement VideoGames;
   
   
   @FindBy(xpath="//span[text()='Accessories']")
   public WebElement accessoories;
   
   @FindBy(xpath="//span[text()='Networking']")
   public WebElement Networking;
   
   
   @FindBy(xpath="//span[text()='Smart Home Lightning']")
   public WebElement smartHomeLighting;
   
   @FindBy(xpath="//span[text()='Plugs and Outlets']")
   public WebElement plugsAndOutlets;
   
   
   @FindBy(xpath="//span[text()='Athletic Clothing']")
   public WebElement athleticClothing;
   
   @FindBy(xpath="//span[text()='Exercise & Fitness']")
   public WebElement exerciseAndFitness;
   
   
   
   @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
   public WebElement automativePartsAccessories;
   
   @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
   public WebElement motorCycleAndPowersports;
    
   @FindBy(id="searchBtn")
   public WebElement searchButton;
   
   @FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
   public WebElement productClick;
   
   //@FindBy(xpath="//select[@class='product__select']//option[@value='2']")
   
   @FindBy(xpath="//select[@class='product__select']")
   public WebElement quantitySelect;
   @FindBy(xpath="//select[@class='product__select']/option[2]")
   public WebElement selectQuantityDropdown;
   
   // both upper works together on one option drop down
   
   @FindBy(xpath="//*[text()='Add to Cart']")
   public WebElement addToCart;
   
   @FindBy(id="cartQuantity")
   public WebElement cartQuant;
   
  
   
   
   @FindBy(id="proceedBtn")
   public WebElement proceedCheckOutBtn;
   @FindBy(id="addAddressBtn")
   public WebElement addAddressBtn;
   @FindBy(xpath="//div[@class='account__address-new']")
   public WebElement addressAddedIcon;
   @FindBy(id="countryDropdown")
   public WebElement countrySelection;
   @FindBy(id="fullNameInput")
   public WebElement fullNameInputForAddress;
   @FindBy(id="streetInput")
   public WebElement streetInput;
   
   
   @FindBy(id="phoneNumberInput")
   public WebElement shippingPhoneNumberInput;
   
   @FindBy(id="apartmentInput")
   public WebElement apartmentInput;
   @FindBy(id="cityInput")
   public WebElement cityInput;
   @FindBy(xpath="//select[@name='state']")
   public WebElement State;
   @FindBy(id="zipCodeInput")
   public WebElement zipCodeInput;
   @FindBy(id="addressBtn")
  public WebElement addedAddressbutton;
   
   
//   @FindBy(xpath = "//div[text()='Address Added Successfully']")
//   public WebElement addressAddedSuccessfully;
//   
//   
//   @FindBy(xpath = "//div[text()='Address Updated Successfully']")
//  public WebElement addressUpdatedSuccessfully;
  
   
//   @FindBy(xpath="//img[@alt='master card']")
   //public WebElement addPaymentMethodLink;
   
   
   @FindBy(xpath="//button[@id='addPaymentBtn']")
   public WebElement addCreditOrDebitCardBtn;
   @FindBy(id="cardNumberInput")
   public WebElement cardNumberInput;
   @FindBy(id="nameOnCardInput")
   public WebElement nameOnCardInput;
   @FindBy(id="securityCodeInput")
   public WebElement securityCodeInput;
   @FindBy(id="paymentSubmitBtn")
   public WebElement paymentSubmitBtn;
  
   
   
   
   
   @FindBy(id="expirationMonthInput")
   public WebElement expirationMonthInput;
   @FindBy(id="expirationYearInput")
   public WebElement expirationYearInput;
   @FindBy(id="placeOrderBtn")
   public WebElement placeOrderBtn;
   
   
   
   @FindBy(xpath = "//*[@alt='Apex Legends - 1,000 Apex Coins']")
   public WebElement apexLegends;
   
 @FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
 public WebElement apexCoin;
 @FindBy(xpath = "//*[text()='5']")
 public WebElement quantity5;
 @FindBy(xpath = "//*[@class='cart__item-detail']")
 public  WebElement addedQty;
 
 @FindBy(xpath = "//*[text()='Cart ']")
 public WebElement cartOption;
 
 @FindBy(id = "cartBtn")
 public WebElement cartBtn;
 
 
 @FindBy(id ="addToCartBtn")
 public WebElement addToCartBtn;
   
 
 @FindBy(xpath="//p[text()='Order Placed, Thanks']")
 public WebElement orderPlacedMessage;
}
