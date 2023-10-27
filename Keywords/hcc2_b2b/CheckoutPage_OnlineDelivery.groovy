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

import internal.GlobalVariable

public class CheckoutPage_OnlineDelivery {
	@Keyword
	def RedirectionToCheckoutPageWhenConditionMet() {
		//WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'), 5)
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/ValidationMessage_OnlineDelivery'), 2,FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'))
			assert WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Text_outofStock_productReview'),2) == true
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_productReview')) == true
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_TrolleySummary_ProductReview')) == true
		}
		else {
			WebUI.waitForElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'), 5)
			WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout'), 2)
			//assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) == true
		}
	}
	@Keyword
	def CheckDeliveryCustomerDetailsAndpaymentSectionAtCheckout() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_CustomerDetails_Checkout')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_DeliveryAddress_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_DeliveryOption_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Payment_checkout')) == true
	}
	@Keyword
	def CheckOneSectionIsOpenedAtATime() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_EmailAddress_Checkout')) ==  true
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Expand_address_Checkoout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Accordion_collapsed_checkout')) == true
	}
	@Keyword
	def CheckUserViewpreviousAddedDetailsAtCheckout() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails')) == true
	}
	@Keyword
	def CheckTrolleySummaryAtCheckoutPage()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_ApplyDiscountCoupon')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProfitOnRetuen_RevisedTrolley')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_por_TrolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Subtotal_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Vat_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_OrderTotal_Checkout')) == true
	}
	@Keyword
	def CheckDetailsOfAddedProductsIncart()
	{
		WebUI.scrollToPosition(80, 90)
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_ProductTitle_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Quantity_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_ItemsQuantity_checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Price_checkout')) == true
	}
	@Keyword
	def CheckDropdownAccordionForItemsAddedInCart()
	{
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'), 0)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Accordion_collapsed_checkout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Accordioncollpased')) == true
	}
	@Keyword
	def CheckPaymentMethodsAtCheckoutPage()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_PaymentMethods')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_visaPaymentMethods')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Image_Mastercard_paymentmethod')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Image_payPal_paymentMethod')) == true
	}

}