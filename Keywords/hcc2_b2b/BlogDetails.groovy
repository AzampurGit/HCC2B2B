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

public class BlogDetails {
	@Keyword
	def CheckBlogDetailPage() {
		WebUI.click(findTestObject('Object Repository/BlogDetails/Image_SecondBlog_HomePage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogDetails/Image_SecondBlog_HomePage')) == true
	}
	@Keyword
	def CheckBlogTags() {
		WebUI.click(findTestObject('Object Repository/BlogDetails/Blogs_Tags'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogDetails/Blog_Title_BlogUrl')) == true
	}
     @Keyword
	 def CheckBlogBreadcrumbAtBlogsPage()
	 {
		 WebUI.click(findTestObject('Object Repository/BlogDetails/Breadcrumb_Blog'))
		 assert WebUI.verifyElementVisible(findTestObject('Object Repository/BlogDetails/Blog_title_BlogsPage')) == true
	 }
	}
