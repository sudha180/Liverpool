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

WebUI.navigateToUrl(GlobalVariable.URL2)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'SCL428499'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/GID collection/SoftLine_product3_Colour1_PDP'), FailureHandling.OPTIONAL)

productName = WebUI.getText(findTestObject('PDPPage/GID collection/SoftLine_product3_title_PDP'))

WebUI.click(findTestObject('PDPPage/GID collection/SoftLine_product3_size1_PDP'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPPage/GID collection/SoftLine_product3_selectButton_PDP'))

WebUI.click(findTestObject('PDPPage/GID collection/AddToCartStickyBar_PDP'))

WebUI.click(findTestObject('PDPPage/Bag_PDP'))

WebUI.verifyElementText(findTestObject('CartPage/product1_name_cart'), productName)

WebUI.verifyElementPresent(findTestObject('CartPage/Product1_quantity1_cart'), 0)

WebUI.closeBrowser()

