import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData as ft
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject as fo
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
import com.my.android.keyword.tapNo as tapNo
import com.my.android.keyword.password as password
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Quick Actions']), 5, FailureHandling.OPTIONAL)) {
    Mobile.tap(fo('Text', [('Verify') : 'Maybank2u']), 0)

    tapNo.pin(ft('userId').getValue(4, 1))
}

if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'ACCOUNTS']), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(fo('Fave/Wallet Click'), 0)
}

if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'View Transactions']), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(fo('Text', [('Verify') : 'Send & Request']), 0)
}

'Tap fav'
Mobile.tap(fo('Text', [('Verify') : ft('EntryPoint').getValue(2, 3)]), 0)

Mobile.delay(5)

if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 3)]), 4, FailureHandling.OPTIONAL)) {
    'User doesnt have favourite account'
} else {
    Mobile.tap(fo('Object Repository/Fav/FirstFav'), 0)

    password.setText(ft('UserID').getValue(2, GlobalVariable.pass))

    'DuitNow No'
    IDtype = Mobile.getText(fo('TextNo', [('No') : 2]), 0)

    'DuitNow Name'
    IDtype = Mobile.getText(fo('TextNo', [('No') : 3]), 0)

    'DuitNow No'
    IDtype = Mobile.getText(fo('TextNo', [('No') : 4]), 0)

    'Enter amount'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Enter amount']), 0), 'Enter amount')

    'RM'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'RM']), 0), 'RM')

    '0.00'
    Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : '0.00']), 0), '0.00')

    tapNo.amount(ft('TestData').getValue(7, 4))

    'enter recipient ref'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 18)]), 0), ft('TestData').getValue(
            4, 18))

    Mobile.setText(fo('InputNo', [('No') : 1]), ft('TestData').getValue(5, 18), 0)

    Mobile.hideKeyboard()

    Mobile.tap(fo('Text', [('Verify') : 'Continue']), 0)
}

Mobile.callTestCase(findTestCase('1b. DuitNow Confirmation'), [:], FailureHandling.CONTINUE_ON_FAILURE)

