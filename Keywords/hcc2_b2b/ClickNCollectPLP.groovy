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

public class ClickNCollectPLP {
	@Keyword
	def CheckClickNCollectToggleOPtiponAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Toggle_ClickANDCollect_PLp'))
	}
	@Keyword
	def CheckDeliveryANDClickCollectAvailableproductAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ClickNCollect_PLP/Text_DeliveryAvailable_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ClickNCollect_PLP/Text_ClickNCollect_PLP')) == true
	}
}
