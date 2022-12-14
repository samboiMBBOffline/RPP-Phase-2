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
import com.my.android.keyword.verifyEqual as verifyEqual

def Status

if ((GlobalVariable.type == 'ind') || (GlobalVariable.type == 'soleUR')) {
    'youve received a request from'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 19)]), 0), ft('TestData').getValue(
            4, 19))

    Mobile.takeScreenshot('Screenshot/DetailsPending/1.png')

    VendorName = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 19)]), 0)

    Status = Mobile.getText(fo('FollowingText2', [('Verify') : VendorName]), 0)

    if (Status == 'Incoming') {
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Incoming']), 0), 'Incoming')
    } else {
        Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Expiring Soon']), 0), 'Expiring Soon')
    }
} 
else 
{
	
	RequestText = Mobile.getText(findTestObject('TextNo',[('No'):2]),0)
	switch (RequestText) 
	{
			
	case ft('TestData').getValue(4,19):

		'youve received a request'
		verifyEqual.text(ft('TestData').getValue(4,19))
			
		VendorName = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 19)]), 0)
			
		Status = Mobile.getText(fo('FollowingText2', [('Verify') : VendorName]), 0)
			
		if (Status == 'Incoming') {
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Incoming']), 0), 'Incoming')
		} else {
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Expiring Soon']), 0), 'Expiring Soon')
		}	
		
	case ft('TestData').getValue(4,19):
		
		'youve received an auto billing request'
		verifyEqual.text(ft('TestData').getValue(5,19))
			
		VendorName = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(5, 19)]), 0)
			
		Status = Mobile.getText(fo('FollowingText2', [('Verify') : VendorName]), 0)
			
		if (Status == 'Incoming') {
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Incoming']), 0), 'Incoming')
		} else {
			Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : 'Expiring Soon']), 0), 'Expiring Soon')
		}
			
	case ft('TestData').getValue(6,19):
		
		'youve sent a request to'
		verifyEqual.text(ft('TestData').getValue(6,19))
			
		VendorName = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(6, 19)]), 0)
			
		Status = Mobile.getText(fo('FollowingText2', [('Verify') : VendorName]), 0)
			
		verifyEqual.text(Status)
	}
}
'Requested on'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 20)]), 0), ft('TestData').getValue(
        4, 20))

DateRequested = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 20)]), 0)

'Recipient ref'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 21)]), 0), ft('TestData').getValue(
        4, 21))

RecipientRef = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 21)]), 0)

if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 22)]), 5, FailureHandling.OPTIONAL)) {
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 22)]), 0), ft('TestData').getValue(
            4, 22))

    PaymentDeets = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 22)]), 0)
}

'Request expiry date'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 23)]), 0), ft('TestData').getValue(
        4, 23))

ExpiryDate = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 23)]), 0)

'Duitnow autodebit details'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 24)]), 0), ft('TestData').getValue(
        4, 24))

X1 = Mobile.getDeviceWidth()/2
Y1 = Mobile.getDeviceHeight()*0.9
Y2 = Mobile.getDeviceHeight()*0.1

Mobile.swipe(X1,Y1,X1,Y2)

'Product name'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 25)]), 0), ft('TestData').getValue(
        4, 25))

ProductName = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 25)]), 0)

Period = Mobile.getText(fo('FollowingText1', [('Verify') : ProductName]), 0)

'Frequency'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 27)]), 0), ft('TestData').getValue(
        4, 27))

FreqPay = Mobile.getText(findTestObject('Details/FollowingText2nd', [('Verify') : ft('TestData').getValue(4, 27)]), 0)

'Limit per trxn'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 28)]), 0), ft('TestData').getValue(
        4, 28))

LPT = Mobile.getText(fo('Details/FollowingText2nd', [('Verify') : ft('TestData').getValue(4, 28)]), 0)

Mobile.verifyEqual(LPT.substring(LPT.length() - 3), '.00')

'DuitNow AutoDebit ID'
Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 29)]), 0), ft('TestData').getValue(
        4, 29))

AutoDebitID = Mobile.getText(fo('FollowingText1', [('Verify') : ft('TestData').getValue(4, 29)]), 0)

if (Status!='Outgoing') {
	Mobile.verifyElementExist(fo('Text',[('Verify'):'Approve Now']),0)
	
	verifyEqual.text('Approve Now')
}else {
	Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Approve Now']),0)
}



Mobile.swipe(X1,Y2,X1,Y1)

Mobile.swipe(X1,Y2,X1,Y1)

Mobile.tap(fo('ImageNo',[('No'):1]),0)
