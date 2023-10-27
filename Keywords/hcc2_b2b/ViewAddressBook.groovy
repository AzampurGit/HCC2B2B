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

public class ViewAddressBook {

	@Keyword
	def ViewExistingAddressOfRegisteredUser() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_ManageAddress_MyAccount'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewAddressBook/Text_AddrresBook'), 2) == true
	}

	@Keyword
	def ViewDefaultAddress_MyAccount() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_ManageAddress_MyAccount'))

		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewAddressBook/Text_DefaultAddress'), 2) == true
	}

	@Keyword

	def AddAddressFromMyAccount() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_AddAddress'))

		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'), GlobalVariable.LastName)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_AddrressLine1'), GlobalVariable.StreetAddress)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_Town'), GlobalVariable.Town)
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_postcode'), GlobalVariable.postcodeSW)
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
	}

	@Keyword

	def SetAdditionalAddressAsDefaultAddress() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Checkbox_SetDefaultAddress'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
	}

	@Keyword
	def DeleteAdditionalAddressFromAddressBook() {
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_DeleteAdditionalAddress'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_Yes_RemovePopUp'))
	}
}


