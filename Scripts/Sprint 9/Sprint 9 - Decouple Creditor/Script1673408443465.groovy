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
import com.my.android.keyword.duration as duration
import com.my.android.keyword.password as password
import com.my.android.keyword.tapNo as tapNo
import com.my.android.keyword.verifyEqual as verifyEqual

if (GlobalVariable.type == 'soleR') {
    if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 3)]), 5, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 3)]), 0)

        tapNo.pin(findTestData('UserID').getValue(4, GlobalVariable.pass))
    } else {
        Mobile.tap(findTestObject('Text', [('Verify') : 'Maybank2u']), 5)

        tapNo.pin(findTestData('UserID').getValue(4, GlobalVariable.pass))

        Mobile.tap(findTestObject('Object Repository/Manage/First Acc in List'), 0)

        Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 3)]), 0)
    }
    
    Mobile.tap(findTestObject('Text', [('Verify') : findTestData('TestData').getValue(4, 6)]), 0)

    password.setText(findTestData('UserID').getValue(2, GlobalVariable.pass))

    'DuitNow AutoDebit'
    verifyEqual.text(findTestData('AutoDebit').getValue(4, 1))

    'Please fill in request details'
    verifyEqual.text(findTestData('AutoDebit').getValue(4, 2))

    'Pay to'
    verifyEqual.text(findTestData('AutoDebit').getValue(4, 3))

    'Request via'
    verifyEqual.text(findTestData('AutoDebit').getValue(2, 7))

    'Product name'
    verifyEqual.text(findTestData('AutoDebit').getValue(4, 4))

    'Recipient reference'
    verifyEqual.text(findTestData('AutoDebit').getValue(4, 5))

    'e.g. INV23232323'
    verifyEqual.input(findTestData('AutoDebit').getValue(4, 6))

    Selection = findTestData('AutoDebit').getValue(3, 7)

    Mobile.tap(findTestObject('DuitNow AutoDebit/Request via please select'), 0)

    Mobile.scrollToText(Selection)

    Mobile.tap(findTestObject('Text', [('Verify') : Selection]), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Done']), 0)

    switch (Selection) {
        case findTestData('AutoDebit').getValue(4, 7):
            Mobile.verifyEqual(Mobile.getText(findTestObject('DuitNow AutoDebit/Request via please select'), 0), findTestData(
                    'AutoDebit').getValue(4, 7))

            'ewallet'
            verifyEqual.text(findTestData('AutoDebit').getValue(5, 7))

            Mobile.tap(findTestObject('Text', [('Verify') : 'Please Select']), 0)

            Mobile.scrollToText(findTestData('AutoDebit').getValue(3, 9))
			
			Mobile.tap(findTestObject('Text',[('Verify'):findTestData('AutoDebit').getValue(3, 9)]),0)

            'acc number'
            verifyEqual.text(findTestData('AutoDebit').getValue(6, 7))
			
			'e.g. 8888 1212 8888'
			verifyEqual.input(findTestData('AutoDebit').getValue(7,7))
			
			Mobile.setText(findTestObject('Input',[('Verify'):findTestData('AutoDebit').getValue(7,7)])
				, findTestData('AutoDebit').getValue(3,8),0)
			
		case findTestData('AutoDebit').getValue(4,8):
			Mobile.verifyEqual(Mobile.getText(findTestObject('DuitNow AutoDebit/Request via please select'), 0), findTestData(
					'AutoDebit').getValue(4, 8))
			
			verify
			
    }
    
    
}

