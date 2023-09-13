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

public class ProductListingPage {
	@Keyword
	def NavigateToPLPFromHomePageMegaMenu() {
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Summer'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_NewArrivals'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_NewIn')) == true
	}
	@Keyword
	def ViewProductInGridView() {
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Textbox_Search'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Button_GridView'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Button_ListView'))
	}
	@Keyword
	def ViewProductDetailsAtPLPPage() {
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_NewArrivals'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Image_YouMayInteresetedProducts'))== true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_ProductDetails_OurBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/PackSize_ProductDetailPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/OurBestSeller/Text_POR_Section_OurBestSeller')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/StockStatus_plp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/ProductPrice_youMayintereseted')) ==  true
	}
	@Keyword
	def CheckProductsInListAtPLPPage() {
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/Image_Subcategory_PickNmix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Button_ListView'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/YouMayBeinteresetedIn/Image_YouMayInteresetedProducts'))== true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/ProductName_ListView')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/PorSection_ListView')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Stock_status_PLpPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/ProductPrice_ListView')) == true
	}
	@Keyword
	def CheckFavIconAtproductListingPage() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Button_FavIcon_PLP'))
		WebUI.mouseOver(findTestObject('Object Repository/SignIn/Link_MyAccount'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductListingPage/SucessMesage_ProductAddedFav'), 3) == true
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ProductListingPage/FavIcon_Enabled'), 2) == true
		WebUI.click(findTestObject('Object Repository/ProductListingPage/FavIcon_selected_plp'))
	}
	@Keyword
	def CheckAvailableFiltersAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Filter_category_plp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Filter_Brands_plp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Filter_Dietary_plp')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Filter_flavour_plp')) == true
	}
	@Keyword
	def CheckSortingOPtionsAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_Sort_PLp'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Dropdown_selectvValue_PLP'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/ProductListingPage/Text_SortByFilter_PLP')) == true
		//WebUI.selectOptionByIndex(findTestObject('Object Repository/ProductListingPage/Dropdown_Sort_PLp'), 2)
	}
	@Keyword
	def CheckClickANDCollectToggleAtPLP() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Link_Subcategory_picknMix'))
		WebUI.click(findTestObject('Object Repository/ProductListingPage/Toggle_ClickANDCollect_PLp'))
	}
}
