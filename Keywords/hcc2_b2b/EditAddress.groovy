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

public class EditAddress {
	
	@Keyword
	def EditAdditionalAddressPhoneNumber()
	{
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.EditPhoneNumber)
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_PhoneNumnber'), GlobalVariable.PhoneNumber)
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
	}
	
	@Keyword
	def EditFirstLastNameFromAdditionalAddress()
	{
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.EditFirstName)
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'), GlobalVariable.EditLastName)
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'), GlobalVariable.FirstName)
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'))
		
		WebUI.sendKeys(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'), GlobalVariable.LastName)
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
		
		
	}
	
	@Keyword
	
	def UserCannotUnselectBillingANDShippingAdress()
	{
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Checkbox_SetDefaultAddress'))
		
		// functionality is not working.
		
		
	}
	
	@Keyword
	def CheckMandatoryValidationForEditingAdditionalAddress()
	{
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
	    WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_FirstName'))
		
		WebUI.clearText(findTestObject('Object Repository/ViewAddressBook/TextBox_LastName'))
		
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_SaveAddress_Address'))
		
		
	}
	
	@Keyword
	
	def RedirectToAddressBookClickingOnCancelButton()
	{
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_EditAddress_AdditionalAddress'))
		
		WebUI.click(findTestObject('Object Repository/ManageAddAddress/Button_Cancel_AddAddress'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ViewAddressBook/Text_AddrresBook')) == true 
	}
	
}
