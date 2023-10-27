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
import com.kms.katalon.entity.global.GlobalVariableEntity
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable

public class DeliveryAddress {
	@Keyword
	def CheckDeliveryAddressSectionOpenedAfterFillingCustomerDetails() {
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'),GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Accordion_CustomerDetails'),2)
	}
	@Keyword
	def AddAddressForDeliveryAddressAtCheckout() {
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), Keys.chord(Keys.TAB))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostCode)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.scrollToElement(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'), 2)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Button_Change_CustomerDetails_Checkout'), 0)
	}

	@Keyword
	def CheckMandatoryValidationsForDeliveryAddress() {
		//WebUI.scrollToPosition(250, 890)
		WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Image_Mastercard_paymentmethod'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Message_validation_Mandatoy_CustoomerDetails'))
	}
	@Keyword
	def CheckUserProceedtoNetStepAfterFillCustomerDetails() {
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), Keys.chord(Keys.TAB))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostCode)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.scrollToElement(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'), 2)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Text_DeliveyOptions_Message'), 2)
	}
	@Keyword
	def CheckAddedDeliveryAddressInMyAccountForRegisteredUser() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.mouseOver(findTestObject('Object Repository/SignIn/Link_MyAccount'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Link_MyAccount_HomePage'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_ManageAddress_MyAccount'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Text_DefaultShppingAddress'), 2)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'), 4)
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def CheckThreeDeliveryAddressAtCheckoutPage() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Radio_CustomerDetails'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Radio2_CustomerDetails'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Radio3_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}

	@Keyword
	def AddDeliveryAddressAtCheckout() {
		WebUI.scrollToElement(findTestObject('Object Repository/TrolleySummary/Text_ApplyDiscountCoupon'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Link_AddNewAddress_CustomerDetails'))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_LastName_Checkout'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'),Keys.chord(Keys.TAB))
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.PostCode)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Checkbox_SaveAddress'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Button_DeliverHere'))
	}
	@Keyword
	def CheckAllAddressUnderCustomerDetailsAtCheckoutbyclickingDropdown() {
		WebUI.scrollToElement(findTestObject('Object Repository/Customer_Details/Accordion_CustomerDetails'), 0)
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Dropdown_ShowAddress'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Dropdown_ShowAddress'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def EditCustomerDetailAddress() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Link_Edit_Address'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryAddress/Popup_Text_Edit Addres'), 2)
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Button_Cross_popup_DeliveryAddres'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def CheckprefilledAddressInEditAddressSection() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Link_Edit_Address'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Prefilled_EDitAddress_FirstName'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Prefilled_Lastname_EditAddres'))
		WebUI.scrollToPosition(200, 300)
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/prefilled_postcode_editaddress'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Button_Cross_popup_DeliveryAddres'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def CheckDeliverHereOptionForEveryRadioButtonAddress() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Button_DeliverHere_RadioSelected'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Radio_CustomerDetails'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Button_DeliverHere_RadioSelected'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Radio2_CustomerDetails'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Button_DeliverHere_RadioSelected'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Radio3_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def SelectDeliverHereOptionunderCustomerDetails() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/DeliveryAddress/Button_DeliverHere_RadioSelected'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def CheckSelectedRadioOption() {
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.verifyElementChecked(findTestObject('Object Repository/DeliveryAddress/Radio3_CustomerDetails'), 2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
}
