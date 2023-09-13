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

public class QuikcAdds {
	
	@Keyword
	
	def VerifyQuickAddpopup()
	{
		WebUI.click(findTestObject('Object Repository/Add_ToTrolley/Button_Trolley'))
		
		assert WebUI.verifyElementPresent(findTestObject('Object Repository/QuickAdds/Text_QuickAddsPopUp'), 2) == true 
		
	}

	@Keyword
	
	def AddProductInMiniCartFromQuickAdds()
	{
		
		WebUI.click(findTestObject('Object Repository/MiniTrolley/Button_AddCart_First_QuickAdd'))
		
		assert WebUI.verifyElementVisible(findTestObject('Object Repository/QuickAdds/Text_FirstProductInMiniCart')) == true : "Assert pased"
		
	}
		@Keyword
		
		def RemoveAddedQuickAddProductFromMiniTrolley()
		{
			WebUI.click(findTestObject('Object Repository/QuickAdds/Button_DeleteAddedQuickAdproductfromminicart'))
			
			WebUI.click(findTestObject('Object Repository/My_Favourites/Button_YesRemoveFavouritePopUP'))
			
			assert WebUI.verifyElementPresent(findTestObject('Object Repository/MiniTrolley/Message_RemoveFromMinicart'), 2) == true 
			
		}
	
	
	}
