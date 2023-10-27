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

public class DeliveryOptions {
	@Keyword
	def CheckDeliveryOptionsAsPerPostcodeAdded() {
		for (int i=0;i<4; i++) {
			WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOptions/Text_DeliveryOptions_Checkout'), 2)
		}
			WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
			WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		
	}
	
		@Keyword
	def VerifyOpenOrCloseDeliveryOptionDropDown() {
		WebUI.scrollToPosition(50, 100)
		//WebUI.scrollToElement(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'), 2, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	
	@Keyword
	def VerifyoptionsByExpandingDeliveryOptions()
	{
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryOptions/Text_price_expand_DeliverOption'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def VerifySelectDeliveryOptionUnderitsOption() 
	{
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'),2)
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def CheckmaximumCharactersAddedIntoDeliveryInstruction()
	{
		WebUI.scrollToPosition(50, 100)
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Dropdown_DeliveryOptions'))
		WebUI.click(findTestObject('Object Repository/DeliveryOptions/Button_Select_DeliveryOptions'))
		WebUI.sendKeys(findTestObject('Object Repository/DeliveryOptions/Textbox_DeliveryInstructions'), GlobalVariable.Lax50Char_DeliveryInstruction)
        WebUI.scrollToElement(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'), 2)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DeliveryOptions/Text_PaymentType'), 3)
		WebUI.verifyElementVisible(findTestObject('Object Repository/DeliveryAddress/Button_Change_CustomerDetails_Checkout'))
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
			
}

