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

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Pending']), 0), 'Pending')

if ((GlobalVariable.type == 'ind') || (GlobalVariable.type == 'soleUR')) {
    Mobile.scrollToText('Incoming', FailureHandling.CONTINUE_ON_FAILURE)

    PayTo = Mobile.getText(findTestObject('Object Repository/Auto Billing/Incoming'), 0)

    Mobile.verifyEqual(PayTo.substring(0, 6), 'Pay to')

    Mobile.takeScreenshot('Screenshot/PendingListing/1.png')

    Mobile.scrollToText('Expiring Soon', FailureHandling.OPTIONAL)

    if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Expiring Soon']), 0, FailureHandling.OPTIONAL)) {
        PayTo2 = Mobile.getText(findTestObject('Object Repository/Auto Billing/IncomingExpired'), 0)

        Mobile.verifyEqual(PayTo2.substring(0, 6), 'Pay to')

        Mobile.takeScreenshot('Screenshot/PendingListing/2.png')
    }
} else {
    Mobile.scrollToText('Incoming', FailureHandling.CONTINUE_ON_FAILURE)

    PayToFrom = Mobile.getText(findTestObject('Object Repository/Auto Billing/Incoming'), 0)

    if (Mobile.verifyMatch(PayToFrom, '^Pay from', true)) {
        Mobile.verifyEqual(PayToFrom.substring(0, 8), 'Pay from')
    } else {
        Mobile.verifyEqual(PayToFrom.substring(0, 8), 'Pay to')
    }
	Mobile.scrollToText('Expiring Soon', FailureHandling.OPTIONAL)

    if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Expiring Soon']), 0, FailureHandling.OPTIONAL)) {
        PayTo3 = Mobile.getText(findTestObject('Object Repository/Auto Billing/IncomingExpired'), 0)

        Mobile.verifyEqual(PayTo3.substring(0, 6), 'Pay to')

        Mobile.takeScreenshot('Screenshot/PendingListing/4.png')
    }else {
		'This data doesnt have expiring soon'
	}
	
	Mobile.scrollToText('Expiring Soon', FailureHandling.OPTIONAL)
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : 'Outgoing']), 0, FailureHandling.OPTIONAL)) {
		Payfrom1 = Mobile.getText(findTestObject('Object Repository/Auto Billing/IncomingOutgoing'), 0)

		Mobile.verifyEqual(Payfrom1.substring(0, 8), 'Pay from')

		Mobile.takeScreenshot('Screenshot/PendingListing/5.png')
	}else {
		'This data doesnt have outgoing'
	}
}

Mobile.scrollToText('Type to search',FailureHandling.OPTIONAL)

Mobile.tap(fo('ButtonNo',[('No'):3]),0)

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Filter']),0),'Filter')

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Status']),0),'Status')


if(GlobalVariable.type=='ind'||GlobalVariable.type=='soleUR') {
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Incoming']),0),'Incoming')
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Expiring Soon']),0),'Expiring Soon')
}else {
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Incoming']),0),'Incoming')
	
	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Expiring Soon']),0),'Expiring Soon')

	Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Outgoing']),0),'Outgoing')
}

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Apply']),0),'Apply')

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Clear All']),3)

Mobile.tap(fo('Text',[('Verify'):'Apply']),0)

'prove that apply cannot be tap'
Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Filter']),0),'Filter')

Mobile.tap(fo('Text',[('Verify'):'Incoming']),0)

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Clear All']),0),'Clear All')

Mobile.tap(fo('Text',[('Verify'):'Clear All']),0)

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Clear All']),3)

Mobile.tap(fo('Text',[('Verify'):'Incoming']),0)

Mobile.tap(fo('ButtonNo',[('No'):1]),0)

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Pending']), 0), 'Pending')

Mobile.tap(fo('ButtonNo',[('No'):3]),0)

Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):'Apply']),0),'Apply')

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Clear All']),3)

Mobile.tap(fo('Text',[('Verify'):'Incoming']),0)

Mobile.tap(fo('Text',[('Verify'):'Apply']),0)

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Pending']), 0), 'Pending')

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Incoming']), 0), 'Incoming')

Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Expiring Soon']),3)









