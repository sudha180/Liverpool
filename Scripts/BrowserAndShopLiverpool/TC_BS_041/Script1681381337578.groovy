import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.mouseOver(findTestObject('HomePage/CategorasDropDown_HP'))

WebUI.mouseOver(findTestObject('HomePage/L1_Category1_HP'))

WebUI.enhancedClick(findTestObject('HomePage/L3_categoryMenu_HP'))

'L4 category page\r\n'
WebUI.getText(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('CLPPage/SubCategory1_leftmenu_CLP'))

WebUI.click(findTestObject('PLPPage/product1_PLP'))

WebUI.click(findTestObject('PDPpage/Colour1_PDP'))

WebUI.click(findTestObject('PDPpage/Size1_PDP'))

WebUI.click(findTestObject('PDPpage/AddToCart_PDP'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('PDPpage/AddedToCart_alert_message_PDP'), 'Agregaste un producto a tu bolsa')

WebUI.closeBrowser()

