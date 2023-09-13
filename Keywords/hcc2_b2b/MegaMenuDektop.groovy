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

public class MegaMenuDektop {
	@Keyword
	def MegaMenuRedirections() {
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Summer'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_NewArrivals'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_NewIn')) == true
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_PicknMix')) == true
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_CategoryOnline'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_ShopByCategory')) == true
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Seasonal'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_SeasonalPage')) == true
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Brand'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_Brand')) == true
	}
	@Keyword
	def CheckSubcategoriesOfMainCategoriesMegaMenuAtHomePage() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Summer'))
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Icecream'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Sauces')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_NewArrivals'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Button_ShopNow_NewInHover_')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_PickNMix')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Image_Subcategory_PickNmix')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_CategoryOnline'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Category_Sweets')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Sweets_jelly')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Seasonal'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_Seasonal_Page')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Brand'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/Text_brand_popup')) == true
	}

	@Keyword
	def RedirectionToCategoryPageFromMegaMenu() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Top50'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Breacrumb_picmix')) == true
	}
	@Keyword
	def RedirectToThirdlevelSubcategiryFromMegMenu() {
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Summer'))
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/SubCategory_Icecream'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_threelevel'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_Sub_SubcategeoryText')) == true
	}
}
