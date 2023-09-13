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

public class FiltersPLP {

	@Keyword
	def CheckFiltersAtPLPPage() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Filters_PLP/Filters_Category_according_PLP'), 2) == true // for category filter
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Brands_accordin_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Dietary_accordin_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Flavour_accordin_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Colour_accordin_PLP')) == true

	}
	@Keyword
	def CheckAvailableFilterAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductListingPage/Filter_category_plp'), 2) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Filters_PLP/Filter_Brand_PLP'), 2) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Dietary_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Flavour_PLP')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Filters_PLP/Filter_Colour_PLP')) == true
	}
    @Keyword
	def ExpandORCollapseFiltersAtPLP()
	{
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/Filters_PLP/Filters_Category_according_PLP'))
		WebUI.click(findTestObject('Object Repository/Filters_PLP/Filters_Collapsed_PLP'))
	}
	@Keyword
	def ViewSelectedFiltersAtTopofPLP()
	{
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_Category_SubFilter_PLP')) 
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/Filters_PLP/Filters_SelectedFilter_PLP'), 2) == true
			}
	@Keyword
	def ClearAddedFilterAtPLP()
	{
	 WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_RemoveSelectedFilter_PLP'))
	 	}
	  @Keyword
	  def ClearAppliedFiltersAtPLP()
	  {
		  WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_Category_Subfilter2_PLP'))
		  WebUI.click(findTestObject('Object Repository/Filters_PLP/Filter_ClearAll'))
	  }
	}
