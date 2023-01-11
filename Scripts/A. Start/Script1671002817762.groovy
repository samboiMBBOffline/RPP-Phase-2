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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

if (ID == 1) {
    Mobile.startExistingApplication('com.maybank2u.life.dev', FailureHandling.STOP_ON_FAILURE)
} else if (ID == 2) {
    Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 1)]), 0)

    'set based on excel 1,Row'
    Mobile.setText(fo('Input', [('Verify') : '']), ft('UserID').getValue(1, NO), 0)

    Mobile.hideKeyboard()

    'Tap Continue'
    Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 2)]), 0)

    'Tap yes its mine'
    Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 3)]), 0)

    'set based on excel 2,Row'
    Mobile.setText(fo('Input', [('Verify') : '']), ft('UserID').getValue(2, NO), 0)

    Mobile.hideKeyboard()

	'Tap Continue'
	Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 2)]), 0)
	
    if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('UserID').getValue(3, 4)]), 3, FailureHandling.OPTIONAL)) {
        Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 5)]), 0)
    }
    
	
	
    'create your pin'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('UserID').getValue(3, 6)]), 0), 
		ft('UserID').getValue(3, 6))

    tapNo.pin(ft('UserID').getValue(4, 1))

    'confirm your pin'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('UserID').getValue(3, 7)]), 0), ft('UserID').getValue(
            3, 7))
	
	tapNo.pin(ft('UserID').getValue(4, 1))
	
	'Set Up Later'
	Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 9)]), 0)
	
	'Yes, Proceed'
	Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 10)]), 0)
	
	'tap OTP'
	Mobile.tap(fo('TextStarts',[('Verify') : ft('UserID').getValue(3,11)]), 0)
	
	'tap tick'
	Mobile.tap(fo('ButtonNo',[('No'):3]),0)
	
	Mobile.setText(fo('Input',[('Verify'):ft('UserID').getValue(3,13)]),
		ft('UserID').getValue(4,2),0)
	
	'Tap Continue'
	Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 2)]), 0)
	
	'Type of wallet'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('UserID').getValue(3, 14)]), 0), ft('UserID').getValue(
		3, 14))
	
	if(Mobile.verifyElementExist(fo('Text',[('Verify'):ft('UserID').getValue(3,15)]),3,FailureHandling.OPTIONAL)) {
		Mobile.tap(fo('Text',[('Verify'):ft('UserID').getValue(3,15)]),0)
	}else {
		
		Mobile.scrollToText(ft('UserID').getValue(3,16),FailureHandling.OPTIONAL)
		
		Mobile.tap(fo('Text',[('Verify'):ft('UserID').getValue(3,16)]),0)
	}
	
	'Tap Continue'
	Mobile.tap(fo('Text', [('Verify') : ft('UserID').getValue(3, 2)]), 0)
	
	'Tap Done'
	Mobile.tap(fo('Text', [('Verify') : 'Done']), 0)
}








	























