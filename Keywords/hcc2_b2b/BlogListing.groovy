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

public class BlogListing {
	
	@Keyword
	
	def RedirectToBlogPage()
	{
		WebUI.click(findTestObject('Object Repository/BlogListing/Link_Blog'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_BlogTitle')) == true
		
	}
	
	@Keyword
	def ViewBlogDetails()
	{
		WebUI.click(findTestObject('Object Repository/BlogListing/Link_BlogName'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_BlogDetails')) == true 
		
	}
	
	@Keyword
	def ViewMoreBlogsClickOnLoadMore()
	{
		WebUI.click(findTestObject('Object Repository/BlogListing/Button_LoadMore_Blogs'))
				
	}
	
	@Keyword
	def SelectCategoryFromBlogListingPage()
	{
		WebUI.click(findTestObject('Object Repository/BlogListing/Dropdown_BlogCategory'))
		WebUI.click(findTestObject('Object Repository/BlogListing/Dropdown_catgeoryValue'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_Catgeory1_selected')) == true 
		
	}

	@Keyword
	def SearchBlog()
	{
	WebUI.click(findTestObject('Object Repository/BlogListing/TextBox_SearchBlogs'))
	WebUI.sendKeys(findTestObject('Object Repository/BlogListing/TextBox_SearchBlogs'), GlobalVariable.SearchBlog)	
		WebUI.click(findTestObject('Object Repository/BlogListing/Button_Search_Blog'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogListing/Text_SearchedBlog')) ==  true 
	}
		
		
		
		
		
	
	}
