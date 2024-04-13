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

WebUI.navigateToUrl('https://chercher.tech/practice/practice-pop-ups-selenium-webdriver')

boolean Alert1 = WebUI.verifyElementPresent(findTestObject('Object Repository/Element_verification/TC_06_Element_Height_Width_Leftpos/input_Practice Alerts_alert'), 
    4)

if (Alert1 == true) {
    println('Alert is present')

    int height = WebUI.getElementHeight(findTestObject('Element_verification/TC_06_Element_Height_Width_Leftpos/input_Practice Alerts_alert'))

    int leftPosition = WebUI.getElementLeftPosition(findTestObject('Element_verification/TC_06_Element_Height_Width_Leftpos/input_Practice Alerts_alert'))

    int width = WebUI.getElementWidth(findTestObject('Element_verification/TC_06_Element_Height_Width_Leftpos/input_Practice Alerts_alert'))

    println('Height of alert is ' + height)

    println('leftPosition of alert is ' + leftPosition)

    println('Width of alert is ' + width)
}

boolean backpack = WebUI.verifyElementNotPresent(findTestObject('Element_verification/TC_06_Element_Height_Width_Leftpos/div_Sauce Labs Backpack'), 
    3)

if (backpack == true) {
    println('This is wrong URL')
}

WebUI.doubleClick(findTestObject('Object Repository/Element_verification/TC_06_Element_Height_Width_Leftpos/input_Bing_double-click'))

WebUI.closeBrowser()

WebUI.enableSmartWait()

