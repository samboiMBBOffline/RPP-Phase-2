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
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.my.android.keyword.tapNo as tapNo
import com.my.android.keyword.password as password

'first page exist'
if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 1)]), 3, FailureHandling.OPTIONAL)) {
    'Tap skip'
    Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 2)]), 0)

    'Tap Agree'
    Mobile.tap(fo('Text', [('Verify') : 'Agree']), 0)
	
	'verify send& request not visible for prelogin'
	Mobile.verifyElementNotExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 3)
	
	Mobile.takeScreenshot('Screenshot/MRPB35/1.png')
	
	Mobile.tap(fo('Text', [('Verify') : 'Transfer']), 0)
	
	if (Mobile.verifyElementExist(fo('Text', [('Verify') : ft('UserID').getValue(3, 1)]), 3, FailureHandling.OPTIONAL)) {
		Mobile.callTestCase(findTestCase('A. Start'), [('ID') : 2, ('NO') : 1], FailureHandling.STOP_ON_FAILURE)
	}
}





if (Mobile.verifyElementNotExist(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 3, FailureHandling.OPTIONAL)) {
    Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 4)]), 0)

    'remove 4th qa'
    Mobile.tap(fo('Object Repository/Manage/Remove4thQA'), 0)

    Mobile.scrollToText(ft('TestData').getValue(4, 3), 0)

    Mobile.tap(fo('Manage/AddSendRequest'), 0)

    Mobile.scrollToText('Customise Top Actions', FailureHandling.CONTINUE_ON_FAILURE)

    Mobile.tap(fo('Object Repository/Manage/SendUp'), 0)

    Mobile.delay(3)

    Mobile.tap(fo('Object Repository/Manage/SendUp'), 0)

    Mobile.delay(3)

    Mobile.tap(fo('Object Repository/Manage/SendUp'), 0)

    Mobile.tap(fo('Text', [('Verify') : 'Save Changes']), 0)

    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 0), ft('TestData').getValue(
            4, 3))
	
	Mobile.tap(fo('Text', [('Verify') : 'More']), 2)
	
	Mobile.tap(fo('Text', [('Verify') : 'Logout']), 0)
	
	Mobile.tap(fo('Text', [('Verify') : 'Back to Dashboard']), 0)
	
	Mobile.waitForElementPresent(fo('Text', [('Verify') : 'Quick Actions']), 0)
	
	Mobile.takeScreenshot('Screenshot/MRBP35/3.png')
}



Mobile.tap(fo('Text', [('Verify') : ft('TestData').getValue(4, 3)]), 2)

tapNo.pin(ft('UserID').getValue(4, ID))

Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0), ft('TestData').getValue(
        4, 5))





if (ft('UserID').getValue(5, ID) == 'SolePropNR') {
	
	'DuitNowRequest exist'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0),ft('TestData').getValue(4, 5))
	
	'DuitNowAutoDebit exist'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 6)]), 0),ft('TestData').getValue(4, 6))
	
	Mobile.takeScreenshot('Screenshot/DRR/1.png')
	
	if(Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Outgoing']), 5,FailureHandling.OPTIONAL)) {
		
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('EntryPoint').getValue(3,1)]),0),ft('EntryPoint').getValue(3,1))
		
		Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('EntryPoint').getValue(4,1)]),0),ft('EntryPoint').getValue(4,1))
	
	}

	Mobile.tap(fo('Text',[('Verify'):ft('EntryPoint').getValue(2,2)]),0)
	
	Mobile.delay(5)
	
	'DuitNowRequest exist'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0),ft('TestData').getValue(4, 5))
	
	'DuitNowAutoDebit exist'
	Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 6)]), 0),ft('TestData').getValue(4, 6))
	
	if(Mobile.verifyElementNotExist(fo('Text',[('Verify'):'Outgoing']), 5,FailureHandling.OPTIONAL)) {
			
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('EntryPoint').getValue(3,1)]),0),ft('EntryPoint').getValue(3,1))
			
			Mobile.verifyEqual(Mobile.getText(fo('Text',[('Verify'):ft('EntryPoint').getValue(4,1)]),0),ft('EntryPoint').getValue(4,1))
		
		}
		
		Mobile.takeScreenshot('Screenshot/DRR/2.png')
		
		Mobile.tap(fo('Text',[('Verify'):ft('EntryPoint').getValue(2,3)]),0)
		
		'DN Request Fav'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(3, 3)]), 0),ft('EntryPoint').getValue(3, 3))
		
		'DuitNowRequest exist'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0),ft('TestData').getValue(4, 5))
		
		'DuitNowAutoDebit exist'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 6)]), 0),ft('TestData').getValue(4, 6))
		
		'Add Fav to List'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 3)]), 0),ft('EntryPoint').getValue(4, 3))
		
		'You can always add fav'
		Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('EntryPoint').getValue(4, 4)]), 0),ft('EntryPoint').getValue(4, 4))
		
	
    Mobile.callTestCase(findTestCase('1a. DuitNowRequest - SoleProp Registered'), [ID:1], FailureHandling.CONTINUE_ON_FAILURE)
	
	
} else if (ft('UserID').getValue(5, ID) == 'Individual') {
    'DuitNowRequest exist'
    Mobile.verifyEqual(Mobile.getText(fo('Text', [('Verify') : ft('TestData').getValue(4, 5)]), 0), ft('TestData').getValue(
            4, 5))
}
