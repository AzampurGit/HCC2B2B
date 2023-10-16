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

public class Customer_Detail {
	@Keyword
	def ContinueButton() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Button_Continue'), 5)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Continue'))
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Continue'))
		Thread.sleep(5000)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Button_Continue'), 5)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Continue'))
		Thread.sleep(5000)
		String url = WebUI.getUrl()
		System.out.println(url)
		if(url==GlobalVariable.Checkoutpage) {
			System.out.println("Checkoutpage")
		}
		else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Link_RemoveAll'), 5)
			WebUI.click(findTestObject('Object Repository/Customer_Detail/Link_RemoveAll'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Button_YesRemove'), 5)
			WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_YesRemove'))
			WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Continue'))
		}
	}

	@Keyword
	def VerifyLoggedInEmailOnCheckOut() {
		ContinueButton()

		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/VerifyLoggedUser_Email'), 3)
		String LoggedIn_User = WebUI.getText(findTestObject('Object Repository/Customer_Detail/VerifyLoggedUser_Email'))
		WebUI.verifyEqual(LoggedIn_User, GlobalVariable.LoggedInUser)
		System.out.println("User email  "+ LoggedIn_User)
	}

	@Keyword
	def VerifyCustomerDetailSectionOpenedDefault() {
		ContinueButton()

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/CustomerDetailSection_Expanded'), 3) == true
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'))
	}

	@Keyword
	def EnterEmailOnCheckOut() {
		ContinueButton()

		WebUI.click(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'))
		WebUI.sendKeys(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'), GlobalVariable.Email)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Email_Next'))
	}

	@Keyword
	def VerifyGuestEmail() {
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'))
		WebUI.sendKeys(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'), GlobalVariable.GuestUser)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Email_Next'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/VerifyNewEmail'), 3)
		String GuestUser = WebUI.getText(findTestObject('Object Repository/Customer_Detail/VerifyNewEmail'))
		WebUI.verifyEqual(GuestUser, GlobalVariable.GuestUser)
		System.out.println("Guest user email  "+ GuestUser)
	}

	@Keyword
	def VerifyRegisteredEmail() {
		WebUI.sendKeys(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'), GlobalVariable.Email)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Email_Next'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Text_ForRegisteredUser'), 3)
		String RegisteredUser = WebUI.getText(findTestObject('Object Repository/Customer_Detail/Text_ForRegisteredUser'))
		WebUI.verifyEqual(RegisteredUser, GlobalVariable.RegisteredUser)
		System.out.println("If registered user email entered then message shows as  "+ RegisteredUser)
	}

	@Keyword
	def VerifyGuestOrRegisteredEnterEmail() {

		ContinueButton()

		VerifyGuestEmail()

		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Change'))
		WebUI.clearText(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'))

		VerifyRegisteredEmail()
	}

	@Keyword
	def VerifyPasswordfieldForRegisteredUser() {

		ContinueButton()

		VerifyRegisteredEmail()
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Textbox_Password'), 3) ==true
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Textbox_Password'))
	}

	@Keyword
	def VerifyForgotPasswordForRegisteredUser() {

		EnterEmailOnCheckOut()

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Text_ForgotPassword'), 3) ==true
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Text_ForgotPassword'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ForgotPassword/Text_ForgotPass_PageName'), 3) ==true
	}

	@Keyword
	def VerifyChangeEmail() {

		ContinueButton()

		VerifyGuestEmail()

		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Change'))
		WebUI.clearText(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'))
		WebUI.sendKeys(findTestObject('Object Repository/Customer_Detail/Textbox_EnterEmailCheckout'), "test@gmail.com")
	}

	@Keyword
	def CheckoutPageLoginWithValidUser() {

		ContinueButton()

		VerifyRegisteredEmail()
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Textbox_Password'), 3) ==true
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Textbox_Password'))
		WebUI.sendKeys(findTestObject('Object Repository/Customer_Detail/Textbox_Password'), GlobalVariable.SignInPassword)
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Customer_Detail/Textbox_Password'), 3) ==true
		WebUI.scrollToElement(findTestObject('Object Repository/Customer_Detail/Textbox_Password'), 3)
		WebUI.click(findTestObject('Object Repository/Customer_Detail/Button_Signin'))
	}
}


