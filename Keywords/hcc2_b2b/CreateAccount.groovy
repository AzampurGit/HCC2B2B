package hcc2_b2b

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.eclipse.persistence.jpa.jpql.Assert.AssertException

import com.kms.katalon.core.annotation.Keyword

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class CreateAccount {

	@Keyword
	def RedirectToSignUpPage() {

		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignUp/Link_CreateAccountFromMyAccount'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_CreateAccount_Text')) == true : "Assertion passed."
	}


	@Keyword

	def CheckFirstLastNameValidationsofMin1Characters() {
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_FirstName'), GlobalVariable.firstNameMin1Char)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_LastName'), GlobalVariable.lastNamemMin1Char)
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))

		//assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_Mandatory')) == true : "Assertion passed."
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/SignUp/Text_Mandatory'), 5) == true : "Assertion paseed."
	}


	@Keyword

	def CheckFirstLastNameValidationsMax50Characters() {
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_FirstName'), GlobalVariable.firstNameMax50Char)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_LastName'), GlobalVariable.lastNameMax50Char)
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_Mandatory')) == true : "Assertion passed."
	}


	@Keyword

	def CheckMandatoryValidationsForBlankFirstLastName() {
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_EmailId'), GlobalVariable.Email)
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_Mandatory')) == true : "Assertion passed."
	}


	@Keyword

	def CreateAccountFromSignupSignInPopUp() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)

		WebUI.mouseOver(findTestObject('Object Repository/SignUp/My_Account'))

		WebUI.click(findTestObject('Object Repository/SignIn/Button_SignIn_From_MyAccount'))

		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAccountFromLoginPopUp'))
	}




	@Keyword

	def RandomNumber() {
		Random randomGenerator = new Random()
		def rndNumber ="user"+ randomGenerator.nextInt(1000) + "yopmail.com"
		println(rndNumber)
	}



	@Keyword

	def CreateAccountWithValidData() {


		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_FirstName'),GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_LastName'), GlobalVariable.LastName)
		Random randomGenerator = new Random()
		def randomEmail="user"+ randomGenerator.nextInt(1000) + "@yopmail.com"
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_EmailId'),randomEmail )
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_Password'), GlobalVariable.Password)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_ConfirmPassword'), GlobalVariable.Password)
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_AccountCreated')) == true : "Assert Passed."
	}

	@Keyword

	def CreateAccountWithoutMandatoryFields() {
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_Mandatory')) == true
	}

	@Keyword

	def CreateAccountWithExistingEmail() {

		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_FirstName'),GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_LastName'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_EmailId'), GlobalVariable.Email)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_Password'), GlobalVariable.Password)
		WebUI.sendKeys(findTestObject('Object Repository/SignUp/TextBox_ConfirmPassword'), GlobalVariable.Password)
		WebUI.click(findTestObject('Object Repository/SignUp/Button_CreateAnAccount_accountPage'))


		assert WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp/Text_EmailAlreadyExist_SignUP')) == true : "Assert passed."
	}
}
