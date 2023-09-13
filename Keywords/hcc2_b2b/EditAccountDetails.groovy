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

public class EditAccountDetails {
	@Keyword
	def EditAccountDetailsOfUser()
	{
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Link_EditAcountInformation'))
		WebUI.clearText(findTestObject('Object Repository/EditAccountDetails/Edit_Account_FirstName'))
		WebUI.sendKeys(findTestObject('Object Repository/EditAccountDetails/Edit_Account_FirstName'), GlobalVariable.FirstName)
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/EditAccount_BusinessType'))
		WebUI.selectOptionByIndex(findTestObject('Object Repository/EditAccountDetails/EditAccount_BusinessType'), 2)
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/EditAccount_Button_Update'))
	}
	@Keyword
	def CheckCancelButtonFunctionality()
	{
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Button_MyAccount_login_mousehover'))
		WebUI.click(findTestObject('Object Repository/ViewAddressBook/Link_MyAccount_LoggedINUser'))
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Link_EditAcountInformation'))
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/EditAccount_Button_cancel'))
	}
	@Keyword
	def SearchStore() {
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_FindAStore'))
		WebUI.sendKeys(findTestObject('Object Repository/EditAccountDetails/TextBox_FindAstore'), GlobalVariable.PostcodeBristol )
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Button_Search_FindAStore'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/EditAccountDetails/Text_Bristol_FindAStore'), 5)
	}
	@Keyword
	def SearchStorethroughStoreLocator()
	{
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Link_StoreLocater'))
		WebUI.sendKeys(findTestObject('Object Repository/EditAccountDetails/TextBox_FindAstore'), GlobalVariable.PostcodeBristol )
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Button_Search_FindAStore'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/EditAccountDetails/Text_Bristol_FindAStore'), 5)
	}
	@Keyword
	def CheckUseCurrentLocationFunctionality()
	{
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_FindAStore'))
		WebUI.click(findTestObject('Object Repository/EditAccountDetails/Link_UseCurrentLocation_FindAStore'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/EditAccountDetails/Map_currentLocation')) ==  true
	}
}
