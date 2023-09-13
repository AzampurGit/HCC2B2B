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

public class BlogBanner {
	@Keyword
	def CheckBlogDetailsAtHomePage()
	{
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Text_BlogBanner_Homepage'))== true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Blog_Banner_1_HomePage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Blog_Banner_2_HomePage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Blog_Banner_3_HomePage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Blog_Banner_4_HomePage')) == true
	}

	@Keyword
	def CheckClickableOfBlogBanner()
	{
		WebUI.click(findTestObject('Object Repository/Blog_Banners/Blog_Banner_1_HomePage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Blog_Banners/Image_BlogBanner_descriptionPage')) == true
	}
	
	@Keyword
	def ViewAllBannersbyForwardBackwardButtons()
	{
	    WebUI.click(findTestObject('Object Repository/Blog_Banners/Blog_NextButton'))
		WebUI.click(findTestObject('Object Repository/Blog_Banners/Button_Blog_Previous'))
	}
	
	}
