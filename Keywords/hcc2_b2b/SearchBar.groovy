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
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

public class SearchBar {
	@Keyword
	def verifySearchWithSKU(String SKU) {

		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), SKU)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SearchBar/Text_SearchResult_Homepage'), 2)
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductReview_OnlineDelivery/Text_ProductTitle_ProductReview'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/SearchBar/Button_ViewResults_Search_homepage'))
	}

	@Keyword
	def verifySearchWithProductName(String ProductName) {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), ProductName)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SearchBar/Text_SearchResult_Homepage'), 2)
		WebUI.verifyElementVisible(findTestObject('Object Repository/SearchBar/Button_ViewResults_Search_homepage'))
	}

	@Keyword
	def CheckMax5ProductsDuringSearchProducts() {
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), GlobalVariable.ProductName)
		//List searchResults = WebUI.findTestObject('Object Repository/SearchBar/ProductsList_SearchMax5Proucts')

		def  countSearch = WebUI.getText(findTestObject('Object Repository/SearchBar/ProductsList_SearchMax5Proucts'))
		//WebUI.verifyElementVisible(findTestObject('Object Repository/SearchBar/ProductsList_SearchMax5Proucts'))
		println("Count" + countSearch)

	}
}
