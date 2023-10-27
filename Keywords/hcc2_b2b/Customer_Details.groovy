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

public class Customer_Details {
	
	@Keyword
	def CheckPrefilledDataOfLoggedInUser()
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Text_LoggedINas'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Accordion_CustomerDetail_Expanded'), 2)
		WebUI.click(findTestObject('Object Repository/Customer_Details/Link_ContinueShoping_Checkout'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		}
			
	@Keyword
	def CheckCustomerDetailsSectionOpenedForLoggedinOrGuestUser()
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Accordion_CustomerDetails'), 0)
        WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Text_LoggedINas'), 0)
		WebUI.click(findTestObject('Object Repository/Customer_Details/Link_ContinueShoping_Checkout'))
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
	}
	@Keyword
	def AddEmailunderCustomerDetailsAtCheckout()
	{
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
        WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Customer_Details/Sucess_Mesage_Email_CustomerDetails'))
					}
	@Keyword
	def CheckRegisteredORGuestUserByEnteringEmailIdAtCheckout()
	{
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.Email)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Customer_Details/Text_AlreadyAccountWithUs'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Customer_Details/Text_Password_checkout'))
	}
	@Keyword
	def CheckRedirectionOfForgotPasswordAtCheckout()
	{
		WebUI.click(findTestObject('Object Repository/Customer_Details/Link_ForgotPass_Checkout'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Details/Text_ResetPassword'), 2)
	}
	@Keyword
	def ChangeEmailAtCheckout()
	{
		WebUI.sendKeys(findTestObject('Object Repository/Checkoutpage_onlineDelivery/TextBox_Email_Checkout'), GlobalVariable.CheckooutEmail)
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Next_checkout'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
		WebUI.click(findTestObject('Object Repository/Checkoutpage_onlineDelivery/Button_Change_CustomerDetails'))
	}

}
