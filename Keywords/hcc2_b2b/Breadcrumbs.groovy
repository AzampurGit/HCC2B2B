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

public class Breadcrumbs {
	@Keyword
	def CheckBreadcrumbsAtEveryPage() {
		WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegMenu_Summer'))
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/MegaMenu_TraditionalSweets'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_pickNSweets')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_Retrosweets')) ==  true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/Image_Subcategory_PickNmix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_pickNSweets')) == true
		WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Category'))
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/Megamenu_Subcategory_Sweets'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_chewySweets')) ==  true
	}
	@Keyword
	def CheckBreadcrumbForCategoryAndSubCategory() {
		WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegMenu_Summer'))
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/MegaMenu_TraditionalSweets'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_pickNSweets')) == true
		WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Category'))
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/Megamenu_Subcategory_Sweets'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_chewySweets')) ==  true
		WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Seasonal'))
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Subcategory_IceCream'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_Subcateggory_seaonal')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_subcatgory_seasons')) == true
	}
	@Keyword
	def CheckBreadcrumbsAtPDPAndPLP()
	{
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/FirstProduct_HomePage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_PDP')) == true
		WebUI.mouseOver(findTestObject('Object Repository/MegaMenuDesktop/MegaMenu_PicknMix'))
		WebUI.click(findTestObject('Object Repository/MegaMenuDesktop/Image_Subcategory_PickNmix'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_pickNSweets')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/CMSPages_FooterLinks/Footer_WholeSaleSweets')) == true
	}
	@Keyword
	def CheckHomeBredcrumbs()
	{
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/FirstProduct_HomePage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_PDP')) == true
		WebUI.click(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_Home')) 
			}
	 @Keyword
	 def CheckcliakbleOfLatestBreadcrumbs()
	 {
		 WebUI.mouseOver(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Brands'))
		 WebUI.click(findTestObject('Object Repository/Breadcrumbs/MegaMenu_Subcategory_Aero'))
		 WebUI.verifyElementClickable(findTestObject('Object Repository/Breadcrumbs/Breadcrumbs_active')) ==  true
}}
