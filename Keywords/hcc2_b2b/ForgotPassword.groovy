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

public class ForgotPassword {


	@Keyword
	def OpenBrowserAndRedirectToAppUrl() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)
	}

	@Keyword
	def ValidateForgotPassword() {

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_Login_SignIn'))

		WebUI.click(findTestObject('Object Repository/SignIn/Link_ForgotPassword'))

		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_ResetPassword_ForgotPass'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ForgotPassword/Text_RequiredField_ForgotPass')) == true : "Assert passed."

		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Textbox_EmailID_ForgotPassword'), GlobalVariable.InvalidEmail)

		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_ResetPassword_ForgotPass'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ForgotPassword/Text_ForgotpassInvalidEmail')) == true : "Assert passed."
	}

	@Keyword

	def RedirectToForgotPasswordPage() {

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_Login_SignIn'))

		WebUI.click(findTestObject('Object Repository/SignIn/Link_ForgotPassword'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ForgotPassword/Text_ForgotPass_PageName')) == true :"assert passed."
	}

	@Keyword
	def CheckResetPasswordValidationMessage(String Email) {
		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Textbox_EmailID_ForgotPassword'), Email)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_ResetPassword_ForgotPass'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/ForgotPassword/Text_resetMailSent_Forgot'), 5)
	}
	@Keyword
	def LoginToEmailAccountForResetPassword(String Email , String MailinatorUrl) {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(MailinatorUrl)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Link_Mailinator_inbox'))
		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Mailinator_Email'), Email)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_Go_Mailinator'))
	}
	@Keyword
	def CheckResetPasswordValidationsResetPass( String Password,String ConfirmPassForgot) {

		WebUI.click(findTestObject('Object Repository/ForgotPassword/Text_Open_ResetPass_Mail'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/ForgotPassword/Link_maillinatr'), 5)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Link_maillinatr'))
		WebUI.click(findTestObject('Object Repository/ForgotPassword/ForgotUrl_Mailinator'))
		WebUI.switchToWindowIndex((1))
		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Textbox_NewPass_Forgot'), Password)
		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Textbox_ConfirmPass_Forgot'), ConfirmPassForgot)
		// check validations for confirm password using new password data.
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_ChangePass_Forgot'))
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Link_Back_inbox_Mailinator'))
	}
	@Keyword
	def DeleteMailsFromMailinator() {

		for (int i=0;i<3;i++) {
			WebUI.click(findTestObject('Object Repository/ForgotPassword/Checkbox_Email_mailinator'))
			WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_delete_Mails'))
		}
	}
	@Keyword
	def VerifyResetPasswordInEncryptedForm() {
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Text_Open_ResetPass_Mail'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/ForgotPassword/Link_maillinatr'), 5)
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Link_maillinatr'))
		WebUI.click(findTestObject('Object Repository/ForgotPassword/ForgotUrl_Mailinator'))
		WebUI.switchToWindowIndex((1))
		WebUI.sendKeys(findTestObject('Object Repository/ForgotPassword/Textbox_NewPass_Forgot'), GlobalVariable.Password)
	}
	@Keyword
	def DeleteOneMailFromMailinator() {
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Checkbox_Email_mailinator'))
		WebUI.click(findTestObject('Object Repository/ForgotPassword/Button_delete_Mails'))
	}
}
