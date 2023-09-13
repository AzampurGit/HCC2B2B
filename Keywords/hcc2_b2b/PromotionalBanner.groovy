package hcc2_b2b

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.junit.Assert.assertArrayEquals

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

public class PromotionalBanner {

	@Keyword

	def CheckPromotionalBannerAtHomePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner/Image_PromotionalBanner1_First'), 5)
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner/Image_PromotionalBanner1_First'), 5) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner/Image_promotinalBanner2_First'),4) == true
	}

	@Keyword
	def CheckThreepromotionalBannerUnderYouMayIntereseted() {
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner/Image_PromotionalBanner1_First'), 4) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/PromotionalBanner/Image_promotionalBanner1_Third'), 2) == true
	}

	@Keyword
	def ClickOnBannerAtHomePage() {
		WebUI.click(findTestObject('Object Repository/PromotionalBanner/Image_PromotionalBanner1_First'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/PromotionalBanner/Button_HomePage')) == true
	}

	@Keyword
	def MoveBannersWithForwardANDBackwardButton() {
		WebUI.click(findTestObject('Object Repository/PromotionalBanner/Button_Forward_promotinalBanner1'))
		WebUI.click(findTestObject('Object Repository/PromotionalBanner/Button_Backward_PromotionalBanner1'))
	}
}
