package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

    POMFactory factory = new POMFactory();
    
    @And("User click on Orders section")
    public void userClickOnOrdersSection() {
        click(factory.orderPage().orderLink);
        logger.info("User click on Orders section");
        
    }
    @And("User click on first order in list")
    public void userClickOnFirstOrderInList() {
        click(factory.orderPage().firstItem);
        logger.info("User click on first order in list");
        slowDown();
        
    }
  
    
    @And("User click on Cancel The Order button")
    public void userCanClickOnCancelOrderBtn() {
        click(factory.orderPage().cancelBtn);
        logger.info("User click on Cancel Order button");
    }
    
    @And("User select the cancelation Reason {string}")
    public void userSelectTheCacelationReason(String reason) {
        selectByVisibleText(factory.orderPage().cancelReasonChoice, reason);
    }
    
    @And("User click on Cancel Order button")
    public void userClickOnCancelOrderButton() {
       click(factory.orderPage().cancelOrder);
       logger.info("User clicked on cancel order");
    }
    
    
    @Then("a cancelation message should be displayed {string}")
    public void ACancelationMessageShouldBeDisplayed(String message) {
        Assert.assertEquals(getElementText(factory.orderPage().cancelOrderMessage), message);
        logger.info("A cancelation message is displayed" + message);
    }
    
    @And("User click on Return Items button")
    public void userClickOnReturnItemsButton() {
        click(factory.orderPage().returnBtn);
        logger.info("user clicked on return items button");
    }
    
    @And("User select the Return Reason {string}")
    public void userSelectTheeturnReason(String reason) {
        selectByVisibleText(factory.orderPage().cancelReasonChoice, reason);
        logger.info("user selected the return reason" + reason);
    }
    
    @And("User select the drop off service {string}")
    public void userSelectTheDropOffService(String dropOffService) {
        selectByVisibleText(factory.orderPage().dropOffInput, dropOffService);
        logger.info("user selected the drop off service" + dropOffService);
    }
    
    // you have to have order placed before using returninf functionality
    @And("User click on Return Order button")
    public void userClickOnReturnOrderButton() {
        click(factory.orderPage().cancelOrderButton);
        logger.info("user clicked on return order button");
    }
    
    @Then("a return message should be displayed {string}")
    public void returnMessageShouldBeDisplayed(String returnMessage) {
        Assert.assertEquals(getElementText(factory.orderPage().returnConfirm), returnMessage);
        logger.info("A return message " + returnMessage + " is displayed");
    }
    
    
    
    
    @And("User click on Review button")
    public void userClickOnReviewButton() {
        click(factory.orderPage().reviewBtn);
        logger.info("user clicked on review button");
    }
    
    @And("User write Review headline {string} and {string}")
    public void userWriteReviewHeadlineAndText(String headline, String reviewText) {
        sendText(factory.orderPage().headlineInput, headline);
        sendText(factory.orderPage().descriptionInput, reviewText);
        logger.info("user wrote review headline" + headline + " and review text " + reviewText);
    }
    
    @And("User click Add your Review button")
    public void userClickAddYourReviewButton() {
        click(factory.orderPage().reviewSubmitBtn);
        logger.info("user clicked add your review button");
    
    }
    
    @Then("a review message should be displayed {string}")
    public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String review) {
        
        // this way or below way both are works
        //Assert.assertTrue(waitTillPresence(factory.accountPage().reviewPopup).getText().equals(review));
        
        String expect =review;
        String actual =getElementText(factory.orderPage().reviewPopup);
        Assert.assertEquals(actual, expect);
        logger.info("the message was displayed");
    }
    
    
    
    
}