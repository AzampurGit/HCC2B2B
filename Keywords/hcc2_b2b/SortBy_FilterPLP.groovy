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
import testlink.api.java.client.TestLinkAPIClient
import testlink.api.java.client.TestLinkAPIException
import testlink.api.java.client.TestLinkAPIResults

import internal.GlobalVariable

public class SortBy_FilterPLP {
	@Keyword
	def CheckSortByFilterAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_Sort_PLp'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_selectvValue_PLP'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Text_SortByFilter_PLP')) == true
	}
	@Keyword
	def ViewSortByFilterOPtionInDropdown() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_Sort_PLp'))
	}
	@Keyword
	def CheckDefaultValueInSortByFilterPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/SortBy_Fliter_PLP/SortByFilter_defaultValue_PLP'), 3) == true
	}
	@Keyword
	def AddSortByFilterWithMultipleFiltersAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_Category_SubFilter_PLP'))
		WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_Category_Subfilter2_PLP'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_Sort_PLp'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_selectvValue_PLP'))
	}
}