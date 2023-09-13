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

public class MyAccount {

	@Keyword
	def ViewOPtionsOfMyAccount() {
		//WebUI.click(findTestObject('Object Repository/MyAccount/HancocksLogo'))
		// WebUI.verifyElementPresent(findTestObject('Object Repository/SignUp/My_Account'), 3)
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/MyAccount_Label')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/MyAccount_MyOrder')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/MyAccount_ReturnPolicy')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/MyAccount_Logout')) == true
	}

	@Keyword
	def RedirectionToMyAccountPage() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/MyAccount/Text_MyAccount'), 2) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/MyAccount/Text_Myaccount_MyOrder'), 2) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_MyAccount_MyFavourite')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_MyAccount_AddressBook')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_MyAccount_AccountInfo')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_MyAccount_GDPR')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_MyAccount_EmailSub')) ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_Myaccount_ProductCode')) == true
	}
	@Keyword
	def CheckRedirectionToReturnPolicyPage() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/MyAccount/MyAccount_ReturnPolicy'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Text_Return_policy')) ==  true
	}
	@Keyword
	def CheckLogoutFunctionalityUnderMyAccount() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/MyAccount/MyAccount_Logout'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MyAccount/Message_Logout')) == true
	}
	
	}

