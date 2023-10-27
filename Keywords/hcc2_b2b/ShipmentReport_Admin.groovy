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

public class ShipmentReport_Admin {
	@Keyword
	def CheckShipmentReportFromAdmin()
	{
		WebUI.waitForElementVisible(findTestObject('Object Repository/Admin_Repos/DPD_Manager_Admin'), 2)
		WebUI.scrollToElement(findTestObject('Object Repository/Admin_Repos/DPD_Manager_Admin'), 3)
		WebUI.click(findTestObject('Object Repository/Admin_Repos/DPD_Manager_Admin'))
     	WebUI.click(findTestObject('Object Repository/Admin_Repos/Link_ShipmentReport_Admin'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Admin_Repos/Text_ShipmentReport_Admin'), 3) 
	    WebUI.verifyElementVisible(findTestObject('Object Repository/Admin_Repos/Grid_UserId_ShipmentReport'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Admin_Repos/Grid_Username_Shipment'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Admin_Repos/Grid_OrderId_Shipment'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Admin_Repos/Grid_CreatedAt_Shipment'))
		}
		@Keyword
		def VerifyDeleteRecordFromShipmentReportAdmin()
		{
			WebUI.click(findTestObject('Object Repository/Admin_Repos/Checkbox_ShipmentReport'))
			
			WebUI.click(findTestObject('Object Repository/Admin_Repos/Dropdown_Shipment'))
			
			WebUI.click(findTestObject('Object Repository/Admin_Repos/Text_delete_Shipment'))
			
			WebUI.click(findTestObject('Object Repository/Admin_Repos/Button_Alert_OK_Shipment'))
			
			WebUI.waitForElementVisible(findTestObject('Object Repository/Admin_Repos/SucessMessage_Delete_Shipment'), 2)
		}
		
}

