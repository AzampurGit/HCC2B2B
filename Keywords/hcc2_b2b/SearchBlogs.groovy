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

public class SearchBlogs {
	@Keyword
	def SearchBlogsAtBlogPage()
	{
		WebUI.sendKeys(findTestObject('Object Repository/BlogListing/TextBox_SearchBlogs'), GlobalVariable.SearchBlog)
		WebUI.click(findTestObject('Object Repository/BlogListing/Button_Search_Blog'))
	    assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_SearchedBlog')) == true
		}

	@Keyword
	def CheckValidationsForNonExistingBlog()
	{
		WebUI.sendKeys(findTestObject('Object Repository/BlogListing/TextBox_SearchBlogs'), GlobalVariable.NonExistingBlog)
		WebUI.click(findTestObject('Object Repository/BlogListing/Button_Search_Blog'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Search_Blogs/Text_NoBlog_Found')) == true
	}
	
	@Keyword
	def ClearSearchBlogText()
	{
		WebUI.sendKeys(findTestObject('Object Repository/BlogListing/TextBox_SearchBlogs'), GlobalVariable.NonExistingBlog)
	}
		
	
	
	}
