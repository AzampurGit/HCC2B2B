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

public class Store_Listing {
	@Keyword
	def CheckListofExistingStores()
	{
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_FindAStore'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Store_Listing/Text_AllStore_StoreListing')) ==  true
	}
   @Keyword
   def CheckStoreNameAddressANDstatusOfStore()
   {
	   WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_FindAStore'))
	   assert WebUI.verifyElementPresent(findTestObject('Object Repository/Store_Listing/Text_StoreName'), 3) ==  true
	   assert WebUI.verifyElementPresent(findTestObject('Object Repository/Store_Listing/Text_StoreAddress'), 2) ==  true
	   assert WebUI.verifyElementVisible(findTestObject('Object Repository/Store_Listing/Text_StoreStatus')) == true
	   
   }
   @Keyword
   def CheckDetailsOfStore()
   {
	   WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_FindAStore'))
	   WebUI.click(findTestObject('Object Repository/Store_Listing/Link_ViewDetails'))
	   assert WebUI.verifyElementPresent(findTestObject('Object Repository/Store_Listing/Breadcrumbs_StoreDetails'), 2) ==  true
	}
	@Keyword
	def ViewFullStoreDetails()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Store_Listing/Text_OpeningHours')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Store_Listing/Text_ManagerDetails')) == true
	}
}