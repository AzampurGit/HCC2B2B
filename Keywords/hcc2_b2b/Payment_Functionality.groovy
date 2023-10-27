package hcc2_b2b

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

public class Payment_Functionality {

	@Keyword
	def AddEmailIDInCustomerDetailsAtCheckout(String Email) {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), Email)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
	}
	@Keyword
	def AddAddressAtCheckoutForClickNCollect() {
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.scrollToPosition(210, 890)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
	}
	@Keyword
	def CheckRedirectionToBrainTreeFromCheckout() {
		WebUI.scrollToPosition(112, 70)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Payment_Functionality/Radio_BrainTree_Checkout'), 3)
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Radio_BrainTree_Checkout'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Payment_Functionality/Radio_BrainTree_Checkout'), 7)
		//WebUI.scrollToElement(findTestObject('Object Repository/Payment_Functionality/Button_Paypal_Checkout'), 5)
		WebUI.scrollToPosition(150, 200)
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_Paypal_Checkout'))
		WebUI.switchToWindowIndex(1)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_Paypal_Checkout'), 5)
	}
	@Keyword
	def AddBillingAddressAtCheckoutUnderPayment() {
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Link_AddNewAddress_Checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), Keys.chord(Keys.TAB))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostCode)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.scrollToElement(findTestObject('Object Repository/Payment_Functionality/Button_Save_AddBillingAdd'), 3)
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_Save_AddBillingAdd'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Button_Change_CustomerDetails_Checkout'), 0)
	}
	@Keyword
	def AddCardDetailsUnderPaymentSection(String CardNumber,String CardExpiryDate, String CVVNumber, String CardHolderName) {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_CardNumber_Checkout'), CardNumber)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/TextBox_ExpiryDate'), CardExpiryDate)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Cvv_number'), CVVNumber)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_CardHolderName'), CardHolderName)
	}
	@Keyword
	def EditBillingAddressAtCheckout() {
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Link_Edit_BillingAdd_Checkout'))
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostcodeBristol)
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_Save_AddBillingAdd'))
	}
	@Keyword
	def CheckMandatoryValidationsWhileAddingBillingAddressAtCheckout() {
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Link_AddNewAddress_Checkout'))
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_Save_AddBillingAdd'))
	}
	@Keyword
	def VerifyAddedBillingAddressUnderBIllingAtCheckoutAndUnderAddressBookForLoggedIN() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_postcode_BillingAdd_Checkout'), 3)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_AddressBook_Checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_postcode_BillingAdd_Checkout'), 3)
	}
	@Keyword
	def AddBillingAddressUnderPaymentForLoggedInUser() {
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Link_AddNewAddress_Checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), Keys.chord(Keys.TAB))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.AddPostCodeBillingAdd)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.scrollToElement(findTestObject('Object Repository/DeliveryAddress/Checkbox_SaveAddress'), 3)
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Checkbox_SaveAddress'))
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_Save_Checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_postcode_BillingAdd_Checkout'), 4)
	}
	@Keyword
	def CheckPrefilledDataWhileEditingBusinessAddress() {
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Link_Edit_BillingAdd_Checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Prefilled_EDitAddress_FirstName'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Prefilled_Lastname_EditAddres'), 2)
	}
	@Keyword
	def RedirectToOrderConfirmationPageFromCheckout(String CheckoutComPassword) {
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Disabled_PlaceOrder_Checkout'))
		WebUI.waitForPageLoad(15, FailureHandling.STOP_ON_FAILURE)
		WebUI.switchToWindowTitle(GlobalVariable.CheckoutComWindowName, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Textbox_Checkout.com_pass'),3)
		WebUI.sendKeys(findTestObject('Object Repository/Payment_Functionality/Textbox_Checkout.com_pass'), CheckoutComPassword)
		WebUI.click(findTestObject('Object Repository/Payment_Functionality/Button_continue_CheckoutCom'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_Order_ConfirmationPage'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Payment_Functionality/Text_Order_ConfirmationPage'), 2)
	}
	@Keyword
	def CheckValidationsForPaymentwithInvalidCardDetails(String Card) {
	}
}
