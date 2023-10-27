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

public class ProductDetailPage {

	@Keyword
	def RedirectToPDP(String SkuForPDP) {
		WebUI.click(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'))
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), SkuForPDP)
		WebUI.click(findTestObject('Object Repository/ProductDetailPage/Text_ProductTitle_Search_PDP'))
	}
	@Keyword
	def VerifyDetailsONPDP() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductDetailPage/Text_ProductTitle_PDP'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/ProductDetailPage/Text_PackSize_PDP'), 0)
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_ProductCode_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_ProfitOnRetrun_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_POR_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_YouMake_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_SellAt_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_CashReturn_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_OurPrice_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/FavIcon_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Button_Add_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_Ingridents_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/Text_NutrionalValues'))
	}
	@Keyword
	def VerifyImagesOnPDP() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/ProductImage_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/ProductImages_bottom_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/ProductDetailPage/ProductImage_Bottom_2_PDP'))
	}
	@Keyword
	def VerifyQuantityPickerWhenAddedIntoCartFromPDP() {
		WebUI.click(findTestObject('Object Repository/ProductDetailPage/Button_Add_PDP'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Add_ToTrolley/Textbox_Quantity_Plp'))
	}
	@Keyword
	def VerifyZoomINZoomOutForProductImageAtPDP() {
		WebUI.click(findTestObject('Object Repository/ProductDetailPage/ProductImage_PDP'))
		WebUI.click(findTestObject('Object Repository/ProductDetailPage/Button_Image_Close_PDP'))
	}
}
