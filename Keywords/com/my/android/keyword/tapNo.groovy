package com.my.android.keyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class tapNO {
	static void pin(String Text) {

		if (Mobile.verifyElementExist(findTestObject('Text',[('Verify'):'6-digit PIN']),3,FailureHandling.OPTIONAL)) {
			int i = 0
			for (i=0;i<6;i++) {
				Mobile.tap(findTestObject('Text',[('Verify'):Text[i]]),1)
			}
			Mobile.tap(findTestObject('TickButton'),0)
		}
	}

	static void amount(String Text) {

		if(Mobile.verifyElementExist(findTestObject('Text',[('Verify'):'Enter amount']),3,FailureHandling.OPTIONAL)) {
			int i = 0
			for (i=0;i<6;i++) {
				Mobile.tap(findTestObject('Text',[('Verify'):Text[i]]),1)
			}
			Mobile.tap(findTestObject('TickButton'),0)
		}
	}
	static void otpApproval(String Text) {
		
	if(Mobile.verifyElementExist(findTestObject('Text',[('Verify'):'One Time Password']),3,FailureHandling.OPTIONAL)) {
		int i = 0
		for (i=0;i<6;i++) {
			Mobile.tap(findTestObject('Text',[('Verify'):Text[i]]),1)
		}
		Mobile.tap(findTestObject('TickButton'),0)
	}
	
}