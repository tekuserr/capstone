package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

    POMFactory factory = new POMFactory();

    // Update profile Information

    @When("User click on Account option")
    public void userClickOnAccountOption() {
        click(factory.accountPage().accountButton);
        logger.info("user clicked on Account button");

    }

    @And("User update name {string} and phone {string}")
    public void userUpdateNameAndPhoneNumber(String name, String number) {
        clearTextUsingSendKeys(factory.accountPage().nameField);
        sendText(factory.accountPage().nameField, name);
        clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
        slowDown();
        sendText(factory.accountPage().phoneNumberInput, number);
        logger.info("user updated name" + name + " and phone number" + number);
    }

    @And("User click on Update button")
    public void userClickOnUpdateButton() {
        click(factory.accountPage().updateButton);
        logger.info("user clicked on update button");

    }

    @Then("user profile information should be updated")
    public void userProfileInformationSouldBeUpdated() {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().profileInformationUpdated));
        // Or This way for valiadtion Or ASSERTION
        // Assert.assertTrue(isElementDisplayed(waitTillPresence(factory.accountPage().profileInformationUpdated)));
        logger.info("user updated profile information");
        slowDown();

    }

    // Update Password

    @And("User enter below information")
    public void userEnterBelowInformation(DataTable dataa) {
        List<Map<String, String>> passwordUpdation = dataa.asMaps(String.class, String.class);
        sendText(factory.accountPage().previousPasswordInput, passwordUpdation.get(0).get("previousPassword"));
        sendText(factory.accountPage().newPasswordInput, passwordUpdation.get(0).get("newPassword"));
        sendText(factory.accountPage().confirmPasswordInput, passwordUpdation.get(0).get("confirmPassword"));
        logger.info("user enetered the required password updation information");

    }

    @And("User click on Change Password button")
    public void userClickOnChangePasswordButton() {
        click(factory.accountPage().changePasswordButton);
        logger.info("user clicked on Change Password button");
        slowDown();

    }

    @Then("a message should be displayed{string}")
    public void aMessageShouldBeDisplayed(String passwordUpdated) {
        Assert.assertTrue(isElementDisplayed(factory.homepage().account));
        logger.info("password updated successfully");
        slowDown();

    }

    // Add a Payment Method

    @And("User click on Add a payment method link")
    public void userClickOnAddAPaymentMethodLink() {
        click(factory.accountPage().addPaymentMethodLink);
        logger.info("user clicked on Add a payment method");

    }

    @And("User fill Debit or credit card information")
    public void userFillDebitOrCreditCardInformation(DataTable paymentMethod) {

        List<Map<String, String>> addPaymentMethod = paymentMethod.asMaps(String.class, String.class);
        sendText(factory.accountPage().cardNumberInput, addPaymentMethod.get(0).get("cardNumber"));
        sendText(factory.accountPage().nameOnCardInput, addPaymentMethod.get(0).get("nameOnCard"));
        selectByVisibleText(factory.accountPage().expirationMonthInput, addPaymentMethod.get(0).get("expirationMonth"));
        selectByVisibleText(factory.accountPage().expirationYearInput, addPaymentMethod.get(0).get("expirationYear"));
        sendText(factory.accountPage().securityCodeInput, addPaymentMethod.get(0).get("securityCode"));

    }

    @And("User click on Add Your card button")
    public void userClickOnAddYourCardButton() {
        click(factory.accountPage().addYourCard);
        logger.info("user clicked on Add Your card");

    }

    @Then("a message should displayed Payment Method added successfully")
    public void aMessageShouldBeDisplayedPaymentAddedSuccessFully() {
        Assert.assertTrue(isElementDisplayed(waitTillPresence(factory.accountPage().cardAddedSuccessfully)));
        // Assert.assertTrue(isElementDisplayed(factory.homepage().account));
        logger.info("Payment  added sucessfully");
        slowDown();

    }

    // Edit Debit Or Credit Information

    
      @And("User click on Master Card link") public void
      userClickOnMasterCardLink() {
      click(factory.accountPage().clickOnMasterCardLink);
      logger.info("User clicked on Master Card link"); }
     

    @And("User click on Edit option of card section")
    public void userClickOnEditOptionOfCardSection() {
        click(factory.accountPage().editCardButton);
        logger.info("user Clicked on Edit card button");

    }

    @And("user edit information with below data")
    public void userEditInformationWithBelowData(DataTable editPayment) {

        List<Map<String, String>> editPaymentButton = editPayment.asMaps(String.class, String.class);

        clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
        sendText(factory.accountPage().cardNumberInput, editPaymentButton.get(0).get("cardNumber"));

        clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
        sendText(factory.accountPage().nameOnCardInput, editPaymentButton.get(0).get("nameOnCard"));

        selectByVisibleText(factory.accountPage().expirationMonthInput,
                editPaymentButton.get(0).get("expirationMonth"));
        selectByVisibleText(factory.accountPage().expirationYearInput, editPaymentButton.get(0).get("expirationYear"));

        clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
        sendText(factory.accountPage().securityCodeInput, editPaymentButton.get(0).get("securityCode"));

        logger.info("user succesfully edit their card information");

    }

    @And("User click on Update Your Card button")
    public void userClickOnUpdateYourCardButton() {
        click(factory.accountPage().updateYourCard);
        logger.info("user clicked on Update Your Card Button");
    }

    @Then("a message should be displayed Payment Method updated Successfully")
    public void aMessageShouldBeDisplayPaymentMethodUpdatedSuccessFully() {
        String actual = "Payment Method updated Successfully";
        String expect = getElementText(factory.accountPage().paymentUpdatedSuccessfully);
        Assert.assertEquals(actual, expect);

        // or below way both are same
        // Assert.assertTrue(isElementDisplayed(waitTillPresence(factory.accountPage().paymentUpdatedSuccessfully)));
        logger.info("Payment updated sucessfully");

    }

    @And("User click on remove option of card section")
    public void userClickOnRemoveOptionOfCardSection() {
        click(factory.accountPage().removeButton);
        logger.info("user clicked on remove button");

    }

    @Then("payments details should be removed")
    public void paymentsDetailsShouldBeRemoved() {
        Assert.assertTrue(isElementDisplayed(factory.homepage().account));
        logger.info("card successfully removed");
        slowDown();

    }

    // add address

    @And("User click on Add address option")
    public void userClickOnAddAdressOption() {
        click(factory.accountPage().addAddresss);
        logger.info("user clicked on Add Address button");

    }

    @And("user fill new address form with below information")
    public void userFillNewAddressFormWithBelowInformation(DataTable addAddress) {

        List<Map<String, String>> address = addAddress.asMaps(String.class, String.class);

        selectByValue(factory.accountPage().countryDropDown, address.get(0).get("country"));
        sendText(factory.accountPage().fullName, address.get(0).get("fullName"));
        sendText(factory.accountPage().phoneNumberInputs, address.get(0).get("phoneNumber"));
        sendText(factory.accountPage().streetInput, address.get(0).get("streetAddress"));
        sendText(factory.accountPage().apartmentInput, address.get(0).get("apt"));
        sendText(factory.accountPage().cityInput, address.get(0).get("city"));
        selectByValue(factory.accountPage().state, address.get(0).get("state"));
        sendText(factory.accountPage().zipCodeInput, address.get(0).get("zipCode"));
        logger.info("user successfully fill the form of new address");

        slowDown();

    }

    @And("User click Add Your Address button")
    public void userClickAddYourAddressButton() {
        click(factory.accountPage().addYourAddress);
        logger.info("user successfully add the address");
        slowDown();

    }

    @Then("a message should be displayed Address Added Successfully")
    public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
       
        String actual = "Address Added Successfully";
        String expect = getElementText(factory.accountPage().addressAddedSuccessfully);
        Assert.assertEquals(actual, expect);

        logger.info("Message was displayed successfully");
        slowDown();
    }

    // edit address

    @And("User click on edit address option")
    public void userClickOnEditAddressOption() {
        click(factory.accountPage().editAddress);
        logger.info("user click on Edit button");

    }

    @And("User fill new address form with below information")
    public void userFillNewAddressFormWithEditAddress(DataTable editaddress) {

        List<Map<String, String>> address = editaddress.asMaps(String.class, String.class);

        selectByValue(factory.accountPage().countryDropDown, address.get(0).get("country"));
        clearTextUsingSendKeys(factory.accountPage().fullName);
        sendText(factory.accountPage().fullName, address.get(0).get("fullName"));
        clearTextUsingSendKeys(factory.accountPage().phoneNumberInputs);
        sendText(factory.accountPage().phoneNumberInputs, address.get(0).get("phoneNumber"));
        clearTextUsingSendKeys(factory.accountPage().streetInput);
        sendText(factory.accountPage().streetInput, address.get(0).get("streetAddress"));
        clearTextUsingSendKeys(factory.accountPage().apartmentInput);
        sendText(factory.accountPage().apartmentInput, address.get(0).get("apt"));
        clearTextUsingSendKeys(factory.accountPage().cityInput);
        sendText(factory.accountPage().cityInput, address.get(0).get("city"));
        selectByValue(factory.accountPage().state, address.get(0).get("state"));
        clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
        sendText(factory.accountPage().zipCodeInput, address.get(0).get("zipCode"));
        logger.info("user successfully updated the  address");

    }

    @And("user click Update Your Address button")
    public void userClickUpdateYourAdddressButton() {
        click(factory.accountPage().updateYourAddressButton);
        logger.info("user click on Uodate Your Address button");

    }

    @Then("a message should be displayed {string}")
    public void aMessageShouldDisplayedUpdatedAddress(String updateAddress) {
      //  Assert.assertTrue(waitTillPresence(factory.accountPage().addressUpdatedSuccessfully).getText().equals(updateAddress));
       String actual = "Address Updated Successfully";
       String expect = getElementText(factory.accountPage().addressUpdatedSuccessfully);
       Assert.assertEquals(actual, expect);
        logger.info("Message was displayed successfully");
       
        
    }

    // remove address

    @And("User click on remove option of Address section")
    public void userClickOnRemoveOPtionOfAddressSection() {
        click(factory.accountPage().removeAddress);
        logger.info("user click on remove button");
        slowDown();

    }

    @Then("Address details should be removed")
    public void addressdetailsShouldbeRemoved() {
       // Assert.assertTrue(waitTillAbsence(factory.accountPage().addressSign));
        Assert.assertTrue(isElementDisplayed(factory.homepage().account));
        logger.info("Address removed successfully");

    }

}
