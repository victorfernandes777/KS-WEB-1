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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.scrollToElement(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select City'), 4)

WebUI.waitForElementVisible(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select City'), 
    5)

//WebUI.verifyElementNotClickable(findTestObject('Object Repository/Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select City'))
//WebUI.click(findTestObject('Object Repository/Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))
//WebUI.click(findTestObject('Object Repository/Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_NCR'))
WebUI.verifyElementClickable(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/div_Select State_css-1gtu0rj-indicatorContainer'))

WebUI.waitForElementPresent(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/Page_DEMOQA/Page_DEMOQA/input_State and City_react-select-3-input'), 
    4)

WebUI.sendKeys(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/Page_DEMOQA/Page_DEMOQA/input_State and City_react-select-3-input'), 
    'NCR', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Element_verification/TC_08_Element_Clickable/Page_DEMOQA/Page_DEMOQA/Page_DEMOQA/Page_DEMOQA/input_State and City_react-select-3-input'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.closeBrowser()

