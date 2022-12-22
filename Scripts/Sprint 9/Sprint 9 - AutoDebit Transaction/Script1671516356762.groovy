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

'tap set autobill'
Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 8)]), 0)

'Step 1 of 2'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(2, 10)]), 0), ft('AutoBill').getValue(
        2, 10))

'set up auto billing via duitnow autodebit'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 10)]), 0), ft('AutoBill').getValue(
        4, 10))

Mobile.takeScreenshot('Screenshot/AutoBill/')

'Please fill in merchants details'
Mobile.verifyEqual(Mobile.getText(fo('Auto Billing/FillMerchantDeets'), 0), ft('AutoBill').getValue(4, 11))

'Pay to'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 12)]), 0), ft('AutoBill').getValue(
        4, 12))

'Product name'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 13)]), 0), ft('AutoBill').getValue(
        4, 13))

'Recipient reference'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 15)]), 0), ft('AutoBill').getValue(
        4, 15))

'Ref input'
Mobile.verifyEqual(Mobile.getText(fo('Input', [('Verify') : ft('AutoBill').getValue(5, 15)]), 0), ft('AutoBill').getValue(
        5, 15))

'pay to = please select'
Mobile.verifyEqual(Mobile.getText(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 12)]), 0), ft('AutoBill').getValue(
        5, 13))

'tap pay to please select'
Mobile.tap(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 12)]), 0)

Mobile.delay(10)

'Select merchant'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(2, 18)]), 0), ft('AutoBill').getValue(
        2, 18))

Mobile.takeScreenshot('Screenshot/AutoBill/2.png')

'type to search'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 18)]), 0), ft('AutoBill').getValue(
        4, 18))

Mobile.tap(fo('Text', [('Verify') : 'Type to search']), 0)

'set non existent text'
Mobile.setText(fo('Auto Billing/InputNo', [('No') : 1]), 'asqdwqwkqwlid', 0)

Mobile.delay(10)

'No results found'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 20)]), 0), ft('AutoBill').getValue(
        4, 20))

Mobile.verifyEqual(Mobile.getText(fo('Auto Billing/couldntfind'), 0), ft('AutoBill').getValue(
	4, 21))

Mobile.hideKeyboard()

Mobile.takeScreenshot('Screenshot/AutoBill/3.png')

'tap X button'
Mobile.tap(fo('ButtonNo', [('No') : 2]), 0)

'type to search'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 18)]), 0), ft('AutoBill').getValue(
        4, 18))

Mobile.tap(fo('Text', [('Verify') : 'Type to search']), 0)

'set 1 product merchant'
Mobile.setText(fo('Auto Billing/InputNo', [('No') : 1]), ft('AutoBill').getValue(5, 18), 0)

'verify the picked merchant shows in the list'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 18)]), 0), ft('AutoBill').getValue(
        5, 18))

Mobile.takeScreenshot('Screenshot/AutoBill/4.png')

'tap the list'
Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 18)]), 0)

'Step 1 of 2'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(2, 10)]), 0), ft('AutoBill').getValue(
        2, 10))

'defaulted to product name with 1 product'
Mobile.verifyNotEqual(Mobile.getText(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 13)]), 0), ft('AutoBill').getValue(
        5, 13))

'tap pay to please select'
Mobile.tap(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 12)]), 0)

Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 18)]), 0)

'Set many product merchant'
Mobile.setText(fo('Auto Billing/InputNo', [('No') : 1]), ft('AutoBill').getValue(5, 19), 0)

'verify the picked merchant shows in the list'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 19)]), 0), ft('AutoBill').getValue(
        5, 19))

'tap the choosen merchant'
Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 19)]), 0)

'defaulted to product name with >1 product'
Mobile.verifyEqual(Mobile.getText(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 13)]), 0), ft('AutoBill').getValue(
        5, 13))

'tap product'
Mobile.tap(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 13)]), 0)

Prod1 = Mobile.getText(fo('TextNo', [('No') : 3]), 0)

Prod2 = Mobile.getText(fo('TextNo', [('No') : 4]), 0)

Mobile.tap(fo('Text', [('Verify') : Prod1]), 0)

Mobile.tap(fo('Text', [('Verify') : 'Done']), 0)

Mobile.delay(5)

'verify picked same as chosen shown in field'
Mobile.verifyEqual(Mobile.getText(fo('FollowingText3', [('Verify') : ft('AutoBill').getValue(4, 13)]), 0), Prod1)

Mobile.tap(fo('Text', [('Verify') : 'Continue']), 0)

Mobile.verifyElementExist(fo('Text', [('Verify') : 'Step 1 of 2']), 0)

'set ref no'
Mobile.setText(fo('InputNo', [('No') : 1]), ft('AutoBill').getValue(6, 15), 0)

'verify same as input'
Mobile.verifyEqual(Mobile.getText(fo('InputNo', [('No') : 1]), 0), ft('AutoBill').getValue(6, 15))

Mobile.takeScreenshot('Screenshot/AutoBill/5.png')

Mobile.tap(fo('Text', [('Verify') : 'Continue']), 0)


