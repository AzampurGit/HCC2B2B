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

public class OurBestSeller {

	@Keyword
	def VerifyOurBestSellerLabelsAtHomePage() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_OurBestSeller_Homepage')) == true
	}

	@Keyword
	def CheckProductDetailsUnderOurBestSeller() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Image_ProoductImage_OurBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_ProductDetails_OurBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_Packsize_ourBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_StockLevel_ourBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_POR_Section_OurBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_Amount_ButtonsOfProduct_OurBestSeller')) == true
	}
	@Keyword
	def ClickOnForwardBackwardButtons() {
		WebUI.click(findTestObject('Object Repository/OurBestSeller/Button_Forward_OurBestSeller'))
		WebUI.click(findTestObject('Object Repository/OurBestSeller/Button_Backward_OurBestSeller'))
	}
}
