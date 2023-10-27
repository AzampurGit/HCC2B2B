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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyFavourites {

	@Keyword

	def CheckLoggedInUserAccessMyFavourite() {
			
		//WebUI.waitForElementPresent(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'), 6)
		WebUI.waitForElementVisible(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'), 5)
		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))	

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveFromFavourite'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_ConfirmationPopUp_Remove'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Message_Sucess_removefromFav')) == true
	}

	@Keyword
	def ViewPDPFromFavouriteList() {

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddtoFav_FromPDP'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Link_FavToPDP'), 5)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Link_FavToPDP'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Link_PDP_desriptionPage'),5)

		WebUI.back()

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveFromFavourite'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_ConfirmationPopUp_Remove'))
		
	}


	@Keyword

	def AddProductInTrolleyFromFavouritePage() {

		WebUI.waitForElementVisible(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'), 3)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductToTrolleyFromFav'))
		
	    WebUI.waitForElementVisible(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'), 3)
		
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Count_addedProductCart')) == true

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_deleteProductFromMiniTrolley'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveProduct_MiniCart_myfav'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'), 3)

		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_cross_minicart'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveFromFavourite'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_ConfirmationPopUp_Remove'))
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_AddProductToFavInFavouritePage'), 5)
	}

	@Keyword
	def RemoveProductFromFavouriteList() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_MyFavourite_option'), 5)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourite_option'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductToFavInFavouritePage'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_addToFavFromHome'), 3)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_addToFavFromHome'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourite_option'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Text_items_fav')) == true

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveFromFavourite'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_Remove_confirmation_withoutaddedCart'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_AddProductToFavInFavouritePage'), 5)
	}


	@Keyword

	def AddProductIntoFavListIfNoProductAdded() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'), 5)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Link_FavButton_HomePage'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Button_AddProductToFavInFavouritePage'), 5)

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductToFavInFavouritePage'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_addToFavFromHome'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourite_option'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Count_AddedProduct_FavPage')) == true

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_RemoveFromFavourite'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_Remove_confirmation_withoutaddedCart'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Message_Sucess_removefromFav'))  == true
	}

	@Keyword

	def AddProductInFavPage() {
		for (int i=0;i<2;i++)
		{
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/My_Favourites/Message_OutOfStock_FavouritePage'), 2, FailureHandling.OPTIONAL)) {
			WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddtoFav_anotherProduct'))
		}
		else {
			WebUI.waitForElementPresent(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'), 3)
			WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddProductInFavWithLogin'))
		}}
	}

	

	@Keyword
	def RemoveExistingProductsInFavList() {
		WebUI.click(findTestObject('Object Repository/ProductReview_OnlineDelivery/Link_HomePage_logo'))
		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))
		for (int i=0;i<6;i++) {
			WebUI.click(findTestObject('Object Repository/My_Favourites/Checkbox_FavList'))
		}
	}

	@Keyword

	def RemoveMultipleProductsFromFavList() {

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_MyFavourites'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Checkbox_SelectFirstFromFavList'))
		
		WebUI.click(findTestObject('Object Repository/My_Favourites/Checkbox_SelectSecondFromFavList'))
		
		WebUI.click(findTestObject('Object Repository/My_Favourites/Link_RemoveProductsFromFavList'))

		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_remove_popup'))

		assert WebUI.verifyElementVisible(findTestObject('Object Repository/My_Favourites/Message_Sucess_removefromFav')) == true
	}
	
	def AddProductInFavListFromSearch(String SKU)
	{
		WebUI.sendKeys(findTestObject('Object Repository/CheckOut_ClickNCollect/Textbox_Search_homepage'), SKU)
		WebUI.click(findTestObject('Object Repository/ViewTrolleyPage/Link_productTitle_trolleyPage'))
		WebUI.click(findTestObject('Object Repository/My_Favourites/Button_AddtoFav_FromPDP'))
	}
}
