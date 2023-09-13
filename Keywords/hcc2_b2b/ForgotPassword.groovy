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
	def ValidateForgotPassword() {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

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

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_Login_SignIn'))

		WebUI.click(findTestObject('Object Repository/SignIn/Link_ForgotPassword'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ForgotPassword/Text_ForgotPass_PageName')) == true :"assert passed."
	}
}
