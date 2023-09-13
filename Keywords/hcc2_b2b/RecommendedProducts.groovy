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

public class RecommendedProducts {
	@Keyword
	def CheckUserRedirectionToRecommendedProductsPage()
	{
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Button_Continue_TrolleyPage'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/RecommendedProducts/Text_RecommendedProductsPage')) == true
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/RecommendedProducts/Text_BeforeYouGo_Recommenedproducts')) == true
	}
	@Keyword
	def ViewAllproductsAtRecommendedPage()
	{
		WebUI.click(findTestObject('Object Repository/RecommendedProducts/Button_Forwardview_Recommendproducts'))
	}
	@Keyword
	def RedirectionToPDPFromRecommededProductPage()
	{
		WebUI.click(findTestObject('Object Repository/RecommendedProducts/Image_SelectProduct_RecommendProducts'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/RecommendedProducts/Text_description_pdp_recommended')) == true
	}
	@Keyword
	def AddProductInTrolleyFromRecommendedPage()
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/RecommendedProducts/Button_AddProduct_RecommendedProducts'), 3)
		WebUI.click(findTestObject('Object Repository/RecommendedProducts/Button_AddProduct_RecommendedProducts'))
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/RecommendedProducts/_Textbox_AddedProductsInCart_Recommended')) == true
	}
	@Keyword
	def CheckRedirectionToTrolleyPageByClickingGoBackTrolleyLink()
	{
		WebUI.click(findTestObject('Object Repository/RecommendedProducts/Link_GoBackTrolley_Recommended'))
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/ViewTrolleyPage/Text_MyTrolley'), 3) == true
	}
}
