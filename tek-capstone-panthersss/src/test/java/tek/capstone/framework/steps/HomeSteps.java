package tek.capstone.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

    POMFactory factory = new POMFactory();
    
    @When("User click on All section")
    public void userClickOnAllSection() {
        click(factory.homepage().AllButton);
        logger.info("User click on All button");
        slowDown();
    }
    
    @Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable home) {
        
        List<List<String>> a= home.asLists(String.class);
     
        if(a.get(0).get(0).equals(getElementText(factory.homepage().electronics)) && 
                a.get(0).get(1).equals(getElementText(factory.homepage().computers)) &&
                a.get(0).get(2).equals(getElementText(factory.homepage().smartHome)) && 
                a.get(0).get(3).equals(getElementText(factory.homepage().sports)) &&
                a.get(0).get(4).equals(getElementText(factory.homepage().automative))){ 
        
             Assert.assertTrue(true);
        } else {
             Assert.assertTrue(false);
        }
        logger.info("Options are present"); 
        
    }
    
    @And("User on {string}")
    public void userOnDEpartment(String department) {
        Assert.assertTrue(isElementDisplayed(factory.homepage().shopByDepartment));
        logger.info("User is on "+department); 
       
        
    }
    
    @Then("below options are present in department")
    public void belowOptionsArePresentInDepartment(DataTable dataTable) {
      
List<List<String>> list = dataTable.asLists(String.class);
        
        String electronic ="Electronics";
        String computer = "Computers";
        String smartHome = "Smart Home";
        String sports="Sports";
        String automative="Automotive";
        
            if(electronic.equals(getElementText(factory.homepage().electronics))) {
                click(factory.homepage().electronics);
            if(list.get(0).get(0).equals(getElementText(factory.homepage().tvAndVideo))
            && list.get(0).get(1).equals(getElementText(factory.homepage().VideoGames))) {
             Assert.assertTrue(true);
                }
            }
        
            else if(computer.equals(getElementText(factory.homepage().computers))) {
            click(factory.homepage().computers);
                if(list.get(1).get(0).equals(getElementText(factory.homepage().accessoories))
                 && list.get(1).get(1).equals(getElementText(factory.homepage().Networking))) {
                 Assert.assertTrue(true);
            }
        } 
            
            else if(smartHome.equals(getElementText(factory.homepage().smartHome))) {
            click(factory.homepage().smartHome);
            if(list.get(2).get(0).equals(getElementText(factory.homepage().smartHomeLighting))
            && list.get(2).get(1).equals(getElementText(factory.homepage().plugsAndOutlets))) {
                Assert.assertTrue(true);
            }
        } 
            
            else if(sports.equals(getElementText(factory.homepage().sports))) {
            click(factory.homepage().sports);
            if(list.get(3).get(0).equals(getElementText(factory.homepage().athleticClothing))
            && list.get(3).get(1).equals(getElementText(factory.homepage().exerciseAndFitness))) {
                Assert.assertTrue(true);
            }
        } 
            
        else if(automative.equals(getElementText(factory.homepage().automative))) {
            click(factory.homepage().automative);
            if(list.get(4).get(0).equals(getElementText(factory.homepage().automativePartsAccessories))
                      && list.get(4).get(1).equals(getElementText(factory.homepage().motorCycleAndPowersports))) {
                 Assert.assertTrue(true);
            }
        } else {
            Assert.assertTrue(false);
            
        }
            logger.info("below options are present in department");
            
        
    }
    
    
   
    
    @And("User change the category to {string}")
    public void userChangeTheCategoryTo(String smarttHome) {
       
        selectByVisibleText(factory.homepage().smartHomeAllDepartment, smarttHome);
        logger.info("User change the Category to smartHome option");
    }
      
    @And("User search for an item {string}")
    public void userSearchForAnItem(String smarttPlug) {
        sendText(factory.homepage().searchField,smarttPlug);
        logger.info("User search for kasa outdoor smart plug item");
    }
      
        
    @And("User click on Search icon")
    public void userClickOnSearchIcon() {
        click(factory.homepage().searchButton);
        logger.info("user click on search button");
    }
      
    @And("User click on item")
    public void userClickOnItem() {
        click(factory.homepage().productClick);
        logger.info("user click on Product");
    }
      
    @And("User select quantity {string}")
    public void userSelectQuantity(String quantity) {
        selectByVisibleText(factory.homepage().quantitySelect, quantity);
        logger.info("User selected "+ quantity +"from smartHome");
      
    }
    @And("User click add to Cart button")
    public void userclickAddToCartButton() {
        click(factory.homepage().addToCart);
        logger.info("user clicked on cart icon at the top of page");
        
        
    }
    @Then("the cart icon quantity should change to {string}")
    public void theCartIconQuantityShouldChangeTo(String cart) {
        Assert.assertTrue(cart, isElementDisplayed(factory.homepage().cartQuant));
        logger.info("Cart button displays " + cart);
    logger.info("The quantity in the cart changed to 2");
    slowDown();
        
    }
    
    @Then("User click on Cart option")
    public void userClickOnCartOption() {
       click(factory.homepage().cartQuant);
       logger.info("Order");
    }
    
    @Then("User click on Proceed to Checkout button")
    public void userClickOnProceedToCheckoutButton() {
        click(factory.homepage().proceedCheckOutBtn);
        logger.info("User clicked on proceddChechoutButtn");
    }
    
    @Then("User click Add a new address link for shipping address")
    public void userClickAddANewAddressLinkForShippingAddress() {
       click(factory.homepage().addAddressBtn);
       logger.info("User clicked on addAddressbtn");
       slowDown();
    }
    
    
    @Then("User click Add a credit card or Debit Card for Payment method")
    public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
        click(factory.homepage().addCreditOrDebitCardBtn);
        logger.info("User clicked on addPaymentMethod");
        slowDown();
    }
    
    @Then("User click on Place Your Order")
    public void userClickOnPlaceYourOrder() {
       click(factory.homepage().placeOrderBtn);
       logger.info("User clicked on placed ordered button");
    }
    
    
    //only one step extra for clicking on item on practice 4 tag. the rest are same as practice 3, unless  something changes.
    
    @And("user click on item")
    public void userClickOnItemm() {
        click(factory.homepage().apexLegends);
        logger.info("User clicked on item");
        
    }
    
    
    
    @Then("a message should be displayed â€˜Order Placed, Thanksâ€™")
    public void aMessageShouldBeDisplayedOrderPlacedThanks() {
        Assert.assertTrue(isElementDisplayed(factory.homepage().orderPlacedMessage));
        logger.info("Messaged appears!");    
    
    
       
    }

  
        
    }
    
    
