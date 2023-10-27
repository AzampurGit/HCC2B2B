package hcc2_b2b

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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

public class Checkout_ClickNCollect {

	@Keyword
	def RedirectToCheckOutForClickNCollect() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/ValidationMessage_OnlineDelivery'), 2,FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_ViewDetails_DeliveryOPtions'))
			assert WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOption_Page/Text_outofStock_productReview'),2) == true
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_productReview')) == true
		}
		else {
			WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
			assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout')) == true
		}
	}
	@Keyword
	def AddProductInCartForClickNCollect() {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.SKUInStock)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Add_Search'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.clearText(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewTrolleyPage/Textbox_Quantity_minicart'), GlobalVariable.MiniCartQty)
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_IncreaseQty_Minicart'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_GoToTRolley_MiniCart'))
	}
	@Keyword
	def RedirectToCheckoutPageUsingClickNCollect() {
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Radio_ClickNCollect_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Continue_DeliveryOptionPage'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_Checkout'), 3) == true
	}
	@Keyword
	def CheckCustomerDetailsClickNCollectAndPaymentSectionAtCheckOut() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_CustomerDetails_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CheckOut_ClickNCollect/Text_ClickNCollect_CheckOut')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Payment_checkout')) == true
	}
	@Keyword
	def CheckOneSectionIsOpenedAtATimeClickNCollect() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_EmailAddress_Checkout')) ==  true
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Expand_address_Checkoout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Accordion_collapsed_checkout')) == true
	}
	@Keyword
	def CheckNewSectionOpenedAfterFillingPreviousSection() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CheckOut_ClickNCollect/Expand_ClickNCollect_Checkout')) == true
	}
	@Keyword
	def CheckMandatoryValidationsAtCheckout() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CheckOut_ClickNCollect/Text_mandatoryValidations_checkout')) == true
	}
	@Keyword
	def ChangeDetailsOfPreviousAddedSection() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.clearText(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails')) == true
	}
	@Keyword
	def CheckPlaceNowOrderFunctionalityAtCheckoutForClickNCollectForNonLoggedIN() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Image_Mastercard_paymentmethod'), 2)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))

		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_CardNumber_Checkout'), GlobalVariable.CardNumber)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/TextBox_ExpiryDate'),GlobalVariable.CardExpiry)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Cvv_number'),GlobalVariable.CVVNumber)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_CardHolderName'), GlobalVariable.CardHolderName)
		WebUI.scrollToPosition(169, 899)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Link_AddNewAddress_Checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Dissmiss_googleApi'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostCode)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_SaveAddress_BillingAddress'))
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_PLaceOrder_Checkout'))
	}

	@Keyword
	def CheckDisabledStateOfPlaceOrderButtonWhenRequieddataNotFilled() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Image_Mastercard_paymentmethod'), 2)
		//WebUI.scrollToElement(findTestObject, 0)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
		WebUI.scrollToPosition(300, 350)
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Disabled_PlaceOrder_Checkout')) == true
	}
	@Keyword
	def ViewTrolleySummaryDetailsAtCheckout() {
		// WebUI.verifyElementpresent
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_ApplyDiscountCoupon')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProfitOnRetuen_RevisedTrolley')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_Por_ReviewPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_youMake_productReview')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_CashReturn_Review'))  == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_Subtotal_RevisedTrolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/TrolleySummary/Text_vat_trolleySummary')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_OrderTotal_RevisedTrolley')) == true
	}
	@Keyword
	def CheckAddedProductsinCartAtCheckout() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CheckOut_ClickNCollect/Text_AddedItemsLabelC_ClickNCollect_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProductTitle_ProductReview')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Quantity_Checkout')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Text_Price_checkout')) == true
	}
	@Keyword
	def CheckAccordioncollapseExpandFunctionalityToviewAddeProducts() {

		WebUI.scrollToElement(findTestObject('Object Repository/TrolleySummary/Text_ApplyDiscountCoupon'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Link_Accordion_collapsed_checkout'))
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_CollapssedAccordion_checkout'))
	}
}