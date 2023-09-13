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

public class CMS_FooterLinks {
	@Keyword
	def CheckFooterHeadersAtHomePage() {
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/FooterHeaders_Help')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/FooterHeaders_ShoopingWithUs')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/FooterHeader_AboutHancocks')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/FooterHeader_RegisteredAddress')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/FooterHeader_Feedback')) == true
	}
	@Keyword
	def VerifyredirectionOfFooterLinks() {
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_ContactUs'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_Faq')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_DeliveryLinks'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_DeliveryInformation')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_Returns'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_RetuenPolicy')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_Covid19'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_Covid-19')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_ClickANDCollect'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_FindAStore')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_WholeSaleSweets'))
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_Bespoke'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_BespokePack')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_Confectionery'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_ConfectioneryPage')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_AboutUs'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_AboutUs')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_Blog'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_BlogDescription')) == true
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_CorporatePolicy'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_CorporatePolicy')) == true
	}

	@Keyword
	def RedirectToPrivacyPolicy() {
		WebUI.click(findTestObject('Object Repository/CMSPages_FooterLinks/Link_PrivacyPolicy_HomePage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Text_PrivacyPolicy')) == true
	}
}
