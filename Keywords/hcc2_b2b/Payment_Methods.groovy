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

public class Payment_Methods {
	@Keyword
	def OpenCustomerAccountInformationinAdminconsole(String CustomerEmail_Admin) {
		WebUI.waitForElementPresent(findTestObject('Object Repository/Admin_Repos/Button_Customer_Menu_Admin'), 3)
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_Customer_Menu_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Link_AllCustomer_Customer'))
		WebUI.clearText(findTestObject('Object Repository/Admin_Repos/Search_Customer_Admin'))
		WebUI.sendKeys(findTestObject('Object Repository/Admin_Repos/Search_Customer_Admin'), CustomerEmail_Admin)
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Search_button_Customer_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Edit_Customer_Search_admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Link_AccountInfo_Customer_Admin'))
		//WebUI.waitForElementPresent(findTestObject('Object Repository/Admin_Repos/Button_bacs_On_Admin'), 4)
	}
	@Keyword
	def EnableOnAccounAndBACSForRegisteredUser() {
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_bacs_On_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/button_onaccount_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_SaveCustomer_Admin'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Repos/Message_Sucess_Customer_Admin'), 5)
	}
	@Keyword
	def DisableOnAccounAndBACSForRegisteredUser() {
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_bacs_On_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/button_onaccount_Admin'))
		WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_SaveCustomer_Admin'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Repos/Message_Sucess_Customer_Admin'), 5)
	}
	

	@Keyword
	def CheckBACSAndOnAccountOptionsUnderPaymentSectionAtcheckout() {
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'), 5)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'),2)
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOptions/Textbox_DeliveryInstructions'), GlobalVariable.Lax50Char_DeliveryInstruction)
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'), 2)
		WebUI.scrollToElement(findTestObject('Object Repository/DeliveryOptions/Textbox_DeliveryInstructions'),3)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Payment_Methods/Text_onAccountoption_Payment'), 5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Payment_Methods/Text_bacsOption_payment'), 3)
	}

	@Keyword
	def RemoveProductFromCartforPaymentsection() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_deleteFromMiniTrolley'))
		WebUI.click(findTestObject('Object Repository/Payment_Methods/Button_RemoveProduct_Cart_popup'))
	}
	@Keyword
	def CheckCardAndPaypalOptionnotShownWhenBacsOnaccountEnabled() {
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'),2)
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOptions/Textbox_DeliveryInstructions'), GlobalVariable.Lax50Char_DeliveryInstruction)
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
	}

	@Keyword
	def CheckCreditrDebitANDPaypalOptionForNonloggedinUser() {
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'),2)
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOptions/Textbox_DeliveryInstructions'), GlobalVariable.Lax50Char_DeliveryInstruction)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
	}
	@Keyword
	def CheckProductDetailsAtOrderConfirmationPage()
	{
		WebUI.verifyElementVisible(findTestObject('Object Repository/ViewTrolleyPage/Image_AddedProduct_TrolleyPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductRewview_ClickNCollect/Text_ProductTitle_productReview'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/OnAccount_payment/ProductCode_ConfirmationPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Price_ConfirmationPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Quanity_ConfirmationPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Subtotal_ConfirmationPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Vat_ConfirmationPage'))
	}
	
	@Keyword
	def VerifyOrderDetailsForClickNCollectAtConfirmationPage()
	{
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Summary_OrderId_ConfirmationPage'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Summary_OrderDate_Confirmation'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Summary_pickUpStore_Confimrtaion'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Order_ConfirmationPage/Summary_Expectedpickup'))
	}
}

