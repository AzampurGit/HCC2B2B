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

public class ClickNCollect_CheckOutPage {
	
	@Keyword
	def CheckClickNCollectOptionOpenedAfterFillingCustomerDetails()
	{
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.click(findTestObject('Object Repository/ProductRewview_ClickNCollect/radio_ClickNCollect'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Link_SelectStore_DeliveryOPtions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_SelectStore_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOption_Page/Button_Continue_TrolleyPage'))
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Button_Next_Checkout_ClickNCollect'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ClickNCollect_CheckOutPage/Accordion_clickNcollect_Expand'), 2)
	}
	@Keyword
	def CheckMandatoryValidationsForClickNCollectSection()
	{
		WebUI.scrollToPosition(250, 300)
		//WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ManageAddAddress/Text_MandatoryFields_Mesage'), 2)
	}
	 
	
}
