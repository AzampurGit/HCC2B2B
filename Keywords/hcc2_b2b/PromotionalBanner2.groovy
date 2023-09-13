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

public class PromotionalBanner2 {
	
	@Keyword
	def CheckPromotionalBanner2OnHomePage()
	{
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner2/Image_promotionalBanner2_Second'), 2) == true
		
	}
	
	@Keyword
	def ClickOnPromotionalBanner2AtHomePage()
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner2/Image_PromotionalBanner2'), 3)
		WebUI.click(findTestObject('Object Repository/PromotionalBanner2/Image_PromotionalBanner2'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/PromotionalBanner/Button_HomePage')) == true
	}
}
