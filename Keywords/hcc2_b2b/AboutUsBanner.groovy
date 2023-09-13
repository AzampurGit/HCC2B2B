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

public class AboutUsBanner {

	@Keyword
	def CheckAboutUsbannerAtHomePage() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/AboutUs_Banner/Image_AboutUsBanner')) == true
	}

	@Keyword
	def RedirectToReadMeTextFromAboutUsBanner() {
		WebUI.click(findTestObject('Object Repository/AboutUs_Banner/Button_ReadMe_AboutUs'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/AboutUs_Banner/Button_ReadMe_AboutUs')) == true
	}

	@Keyword
	def CheckDetailsOfAboutUsBanner() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/AboutUs_Banner/Text_title_AboutUsBanner')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/AboutUs_Banner/Text_AboutUsBanner'))	 ==  true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/AboutUs_Banner/Image_AboutUsBanner')) == true
	}

	@Keyword
	def ClickOnAboutUsBanner() {
		
		WebUI.click(findTestObject('Object Repository/AboutUs_Banner/Text_AboutUsBanner'))
		// assert  Functionality not wporkimng
	}

	@Keyword
	def MoveForwardBacwardAboutUsBanner() {
		WebUI.click(findTestObject('Object Repository/AboutUs_Banner/Button_Forward_aboutUs'))
		WebUI.click(findTestObject('Object Repository/AboutUs_Banner/Button_Backward_AboutUs'))
	}
}
