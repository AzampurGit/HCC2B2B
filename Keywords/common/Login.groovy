package common

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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {

	@Keyword
	def LoginWithValidData() {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_SignIn_From_MyAccount'))

		WebUI.sendKeys(findTestObject('Object Repository/SignIn/TextBox_SignIn_EmailId'), GlobalVariable.Email)

		WebUI.sendKeys(findTestObject('Object Repository/SignIn/Textbox_SignIn_Password'), GlobalVariable.SignInPassword)

		WebUI.click(findTestObject('Object Repository/SignIn/Button_Login_SignIn'))

		//assert WebUI.verifyElementPresent(findTestObject('Object Repository/SignIn/Text_Toast_SucessMsg'), 2) == true
		//assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignIn/Text_Toast_SucessMsg')) == true : "Assert passed"
	}

	@Keyword

	def RedirectToSignUpSignInPopUpFromMyAccount() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_SignIn_From_MyAccount'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignIn/Text_Login_popUp')) == true : "Assert passed."
	}


	@Keyword

	def SignUpSignInPopUpOpensAfter120SecForNonLoggedIn() {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)


		assert WebUI.waitForElementPresent(findTestObject('Object Repository/SignIn/Text_Login_popUp'), 120) ==  true
	}

	@Keyword

	def CheckValidationsForInvalidUserandPassword() {

		WebUI.sendKeys(findTestObject('Object Repository/SignIn/TextBox_SignIn_EmailId'), GlobalVariable.EmailInvalid)

		WebUI.sendKeys(findTestObject('Object Repository/SignIn/Textbox_SignIn_Password'), GlobalVariable.Password)

		WebUI.click(findTestObject('Object Repository/SignIn/Button_Login_SignIn'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignIn/Text_validationForInvalidEmailPassword')) == true :"Assert passed."
	}

	@Keyword

	def RedirectsToForgotPasswordPage() {

		WebUI.click(findTestObject('Object Repository/SignIn/Link_ForgotPassword'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignIn/Text_ForgotPassword')) == true :"Assert passed."
	}
}





