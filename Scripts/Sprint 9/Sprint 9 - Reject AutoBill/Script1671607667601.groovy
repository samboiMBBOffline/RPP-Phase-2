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
import com.my.android.keyword.duration as duration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

if ((GlobalVariable.type == 'soleR') || (GlobalVariable.type == 'ind')) {
    'if start from Quick Actions'
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Quick Actions']), 0, FailureHandling.OPTIONAL)) {
        if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 1)]), 0, FailureHandling.OPTIONAL)) {
            Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0)

            password.setText(ft('UserID').getValue(2, GlobalVariable.pass))
        } else {
            Mobile.tap(fo('Text', [('Verify') : 'Maybank2u']), 0)

            tapNo.pin(ft('UserID').getValue(4, GlobalVariable.pass))
        }
    }
    
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'ACCOUNTS']), 15, FailureHandling.OPTIONAL)) {
        Mobile.tap(fo('TextNo', [('No') : 8]), 0)

        Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0)

        password.setText(ft('UserID').getValue(2, GlobalVariable.pass))
    }
    
    'id like to...'
    Mobile.verifyElementExist(fo('Auto Billing/Id like to'), 0)

    Mobile.scrollToText(ft('TestData').getValue(4, 6), FailureHandling.CONTINUE_ON_FAILURE)

    'tap view all'
    Mobile.tap(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0)

    Mobile.delay(5)

    'land to page duitnow autodebit view all'
    Mobile.verifyEqual(Mobile.getText(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0), ft('TestData').getValue(
            4, 6))

    Mobile.takeScreenshot('Screenshot/Reject/1.png')

    Mobile.scrollToText('Incoming', FailureHandling.OPTIONAL)

    A = Mobile.getText(fo('Auto Billing/Incoming'), 0)

    if (A.substring(0, 8) == 'Pay from') {
        'MRPB - 14192'
        Mobile.tap(fo('Auto Billing/Incoming'), 0)

        'youve received an auto billing request from...'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 30)]), 0), ft('AutoBill').getValue(
                4, 30))

        Mobile.takeScreenshot('Screenshot/Reject/2.png')

        Mobile.tap(fo('ButtonNo', [('No') : 2]), 0)

        'Reject request'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0), ft('AutoBill').getValue(
                4, 31))

        Mobile.takeScreenshot('Screenshot/Reject/3.png')

        'tap reject request'
        Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0)

        'are you sure...'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 32)]), 0), ft('AutoBill').getValue(
                4, 32))

        'reject request'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 34)]), 0), ft('AutoBill').getValue(
                4, 31))

        'confirm'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 32)]), 0), ft('AutoBill').getValue(
                5, 32))

        'cancel'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 33)]), 0), ft('AutoBill').getValue(
                5, 33))

        Mobile.takeScreenshot('Screenshot/Reject/4.png')

        Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 33)]), 0)

        'Reject request'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0), ft('AutoBill').getValue(
                4, 31))

        'tap reject request'
        Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0)

        'tap confirm'
        Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 32)]), 0)

        'duitnow has been rejected'
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 33)]), 0), ft('AutoBill').getValue(
                4, 33))

        Mobile.takeScreenshot('Screenshot/Reject/5.png')
		
		Mobile.tap(fo('Text',[('Verify'):'PAST']),0)
		
		Mobile.delay(5)
		
		Mobile.scrollToText(ft('TestData').getValue(4, 6), FailureHandling.CONTINUE_ON_FAILURE)
		
		'tap view all'
		Mobile.tap(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0)
		
		Mobile.tap(fo('Text',[('Verify'):'Rejected']),0)
		
		'youve rejected the request from'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 34)]), 0), ft('AutoBill').getValue(
                4, 34))
		
		Mobile.takeScreenshot('Screenshot/Reject/6.png')
		
    } else {
        Mobile.tap(fo('Auto Billing/Incoming'), 0)
		
		'MRPB - 13087'
		Mobile.tap(fo('Auto Billing/Incoming'), 0)

		'youve received an auto billing request from...'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 35)]), 0), ft('AutoBill').getValue(
				4, 35))

		Mobile.takeScreenshot('Screenshot/Reject13087/2.png')

		Mobile.tap(fo('ButtonNo', [('No') : 2]), 0)

		'Reject request'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0), ft('AutoBill').getValue(
				4, 31))
		
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 37)]), 0), ft('AutoBill').getValue(
			4, 37))

		Mobile.takeScreenshot('Screenshot/Reject13087/3.png')

		'tap reject request'
		Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0)

		'are you sure...'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 32)]), 0), ft('AutoBill').getValue(
				4, 32))

		'reject request'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 34)]), 0), ft('AutoBill').getValue(
				4, 31))

		'confirm'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 32)]), 0), ft('AutoBill').getValue(
				5, 32))

		'cancel'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 33)]), 0), ft('AutoBill').getValue(
				5, 33))

		Mobile.takeScreenshot('Screenshot/Reject13087/4.png')

		Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 33)]), 0)

		'Reject request'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0), ft('AutoBill').getValue(
				4, 31))

		'tap reject request'
		Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 31)]), 0)

		'tap confirm'
		Mobile.tap(fo('Text', [('Verify') : ft('AutoBill').getValue(5, 32)]), 0)

		'duitnow has been rejected'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 33)]), 0), ft('AutoBill').getValue(
				4, 33))

		Mobile.takeScreenshot('Screenshot/Reject13087/5.png')
		
		Mobile.tap(fo('Text',[('Verify'):'PAST']),0)
		
		Mobile.delay(5)
		
		Mobile.scrollToText(ft('TestData').getValue(4, 6), FailureHandling.CONTINUE_ON_FAILURE)
		
		'tap view all'
		Mobile.tap(fo('FollowingText2', [('Verify') : ft('TestData').getValue(4, 6)]), 0)
		
		Mobile.tap(fo('Text',[('Verify'):'Rejected']),0)
		
		'youve rejected the request from'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('AutoBill').getValue(4, 34)]), 0), ft('AutoBill').getValue(
				4, 34))
		
		Mobile.takeScreenshot('Screenshot/Reject13087/6.png')
		
    }
	
	Mobile.tap(fo('ButtonNo',[('No'):1]),0)
}

