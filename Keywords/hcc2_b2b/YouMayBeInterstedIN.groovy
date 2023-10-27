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

public class YouMayBeInterstedIN {
	
	@Keyword
	def CheckYouMayBeInteresetedInLabelAtHomePage()
	{
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Label_YouMayInteresetedAtHomePage')) == true
			}
	@Keyword
	def CheckProductDetailsUnderYouMayBeInteresetedIn()
	{
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Image_YouMayInteresetedProducts')) == true
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/ProductTitle_YouMayIntereseted'))  == true
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Packsize_StockLevel_YouMayIntereseted')) == true
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Por_youMayinteresetedIN')) == true
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/StockStatus_YouMayIntereseted')) ==true
	assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/ProductPrice_youMayintereseted')) == true
				
			}
	@Keyword
	def CheckFiveProductsUnderYouMayinterestedIn()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/FirstProduct_YouMayInterestedIn')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/SecondProduct_YouMayinterested')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/ThirdProduct_youMayInterested')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Fourth_youMaybeInterested')) == true
		//assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/FifthProduct_youMayInterested')) == true		
	}
	@Keyword
	def MoveForwardAndBackwardYouMayIntereseted()
		{
		WebUI.click(findTestObject('Object Repository/YouMayBeinteresetedIn/Forward_button_youmayinterested'))
		WebUI.click(findTestObject('Object Repository/YouMayBeinteresetedIn/Backward_button_youMayinterested'))		
			}
			
}


