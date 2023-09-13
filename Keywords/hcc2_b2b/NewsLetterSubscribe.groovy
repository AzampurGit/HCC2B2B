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

public class NewsLetterSubscribe {
	
	@Keyword
	
	def CheckValidationForNewsletterSubscription()
	{
		WebUI.click(findTestObject('Object Repository/NewsLetter_Subscribe/Button_NewsletterSubscribe'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/NewsLetter_Subscribe/Text_validationMsg_newsletter')) == true  :"Assert passeed."
		
	}
	
	@Keyword
	
	def CheckEmailValidationForNewsleter()
	{
		
		WebUI.sendKeys(findTestObject('Object Repository/NewsLetter_Subscribe/TextBox_Email_SubscribeField'), GlobalVariable.EmailInvalid)
		
		WebUI.click(findTestObject('Object Repository/NewsLetter_Subscribe/Button_NewsletterSubscribe'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/NewsLetter_Subscribe/Text_Email_mandatoryValidation')) == true : "Assertr passed"
		
	}
	
	@Keyword
	
	def CheckPrivacyPolicyHomepage()
	{
		
		WebUI.click(findTestObject('Object Repository/NewsLetter_Subscribe/Link_PrivacyPolicy_homepage'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/NewsLetter_Subscribe/Text_privacyPolicy')) == true :"Assert passed."
		
		
	}
	
	
}
