package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetupp;

public class RetailOrderPage extends BaseSetupp {

    public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
        }
        
        @FindBy(id = "orderLink")
        public WebElement orderLink;
        
        //make sure what order you have then find the xpath for that item to be cancel.
        
        @FindBy(xpath = "//*[@alt='Apex Legends - 1,000 Apex Coins']")
        public WebElement firstItem;
        
        @FindBy(xpath="//*[@class='order__content-actions']//button[text()='Cancel The Order']")
        public WebElement cancelBtn;
        
//        @FindBy(id="reasonInput")
//        public WebElement reasonOption;                other way locater to locate the element
//        
//        @FindBy(xpath="//button[@id='orderSubmitBtn']")
//        public WebElement orderSubmitBtn;
        
     @FindBy(id = "reasonInput") 
     public WebElement cancelReasonChoice;
        
        @FindBy(xpath="//button[@id='orderSubmitBtn']")
        public WebElement cancelOrder;
        
        @FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
        public WebElement cancelOrderMessage;
        
        
        
        @FindBy(id = "returnBtn") 
        public WebElement returnBtn;
        
        @FindBy(id = "dropOffInput")
        public WebElement dropOffInput;
        

        @FindBy(xpath = "//button[@id = 'orderSubmitBtn']") 
        public WebElement cancelOrderButton;
        
        @FindBy(xpath = "//div[@class = 'return__confirm-message']//descendant::p") 
        public WebElement returnConfirm;
        
        
        
        @FindBy(id = "reviewBtn") 
        public WebElement reviewBtn;
        
        @FindBy(id = "headlineInput")
        public WebElement headlineInput;
        
        @FindBy(id = "descriptionInput")
        public WebElement descriptionInput;
        
        @FindBy(id = "reviewSubmitBtn") 
        public WebElement reviewSubmitBtn;
        
        @FindBy(xpath="//div[text()='Your review was added successfully']")
        public WebElement reviewPopup;
    }


