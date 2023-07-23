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

WebUI.navigateToUrl(GlobalVariable.url)

not_run: WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('HomePage/LoginButton_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('CartPage/home_button_(header_liverpool)'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/FirstProduct_plp'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('PDPpage/AddToCart_pdp (1)'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('OPCPage/3DotButton2_Checkout'))

WebUI.click(findTestObject('OPCPage/EditAddress_Checkout'))

WebUI.setText(findTestObject('Object Repository/OPCPage/shortName_addAddress_opc (1) (1)'), GlobalVariable.ShortName)

WebUI.click(findTestObject('OPCPage/ContinueButtonAddAddress_Checkout'))

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.mouseOver(findTestObject('CLPPage/AfterLogin_hp'))

WebUI.click(findTestObject('HomePage/myAccount_hp'))

WebUI.click(findTestObject('OPCPage/deliveryAddressHeading_address_opc'))

addressBlockContainer = WebUI.getText(findTestObject('AccountManagement/addressBlockContainer_Account'))

if (addressBlockContainer == GlobalVariable.ShortName) {
    println('Checked')
}

WebUI.closeBrowser()

