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

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

not_run: WebUI.navigateToUrl(GlobalVariable.LiverpoolProduction)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciarsesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.SLProduct], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/ReceiveAtHomeFlag_pdp'), 0)

if (WebUI.verifyElementPresent(findTestObject('0PDPPage/EnterZipCode_pdp'), 0) == true) {
    WebUI.click(findTestObject('0PDPPage/EnterZipCode_pdp'))

    WebUI.verifyElementPresent(findTestObject('0PDPPage/EnterZipCodePopup_pdp'), 0)

    WebUI.verifyElementPresent(findTestObject('0PDPPage/ChangesDirectionZipCodeInput_pdp'), 0)
} else {
    WebUI.click(findTestObject('0PDPPage/EnterZipCode_pdp'))

    WebUI.verifyElementPresent(findTestObject('0PDPPage/EnterZipCodePopup_pdp'), 0)

    WebUI.verifyElementPresent(findTestObject('0PDPPage/ChangesDirectionZipCodeInput_pdp'), 0)
}

WebUI.closeBrowser()

