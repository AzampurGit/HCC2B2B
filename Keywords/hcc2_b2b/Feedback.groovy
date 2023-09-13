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

public class Feedback {

	@Keyword

	def LeaveFeedback() {
		
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.StagingUrl)
		
		WebUI.click(findTestObject('Object Repository/Feedback/Button_LeaveFeedback'))
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Feedback/Dropdown_feedback'), 2)
		WebUI.sendKeys(findTestObject('Object Repository/Feedback/TextBox_FeedbackMessage'), GlobalVariable.Feedback_Message)
		WebUI.click(findTestObject('Object Repository/Feedback/Rating_star_button'))
		WebUI.click(findTestObject('Object Repository/Feedback/Button_Feedback_Submit'))
	}

	@Keyword
	
	def CheckFeedbackPopup()
	{
		WebUI.openBrowser('')
		
				WebUI.maximizeWindow()
		
				WebUI.navigateToUrl(GlobalVariable.StagingUrl)
				
				WebUI.click(findTestObject('Object Repository/Feedback/Button_LeaveFeedback'))
				
				assert WebUI.verifyElementVisible(findTestObject('Object Repository/Feedback/Text_feedbackLabel')) == true : "Assert passed."
		
	}
	
	
	
	
	}
