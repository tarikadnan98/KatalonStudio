import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Tarik\\Desktop\\New Folder\\MyTM_v3.10.0.apk', true)

Mobile.tap(findTestObject('Login using Email/android.widget.ImageView1'), 0)

Mobile.tap(findTestObject('Login using Email/android.widget.RadioButton0 - English'), 0)

Mobile.tap(findTestObject('Login using Email/android.widget.Button0 - '), 0)

Mobile.tap(findTestObject('Login using Email/android.widget.TextView3 - Sign in with Telenor ID'), 0)

Mobile.setText(findTestObject('Login using Email/android.widget.EditText0'), '+95121212121212', 0)

Mobile.tap(findTestObject('Login using Email/android.widget.Button0 - Sign in'), 0)

Mobile.tap(findTestObject('Login using Email/android.view.View12 - Sign in with email'), 0)

Mobile.setText(findTestObject('Login using Email/android.widget.EditText0 (1)'), 'atif@portonics.com', 0)

Mobile.tap(findTestObject('Login using Email/android.widget.Button0 - Sign in'), 0)

Mobile.setText(findTestObject('Login using Email/android.widget.EditText1'), 'Pass123!', 0)

Mobile.tap(findTestObject('Login using Email/android.widget.Button0 - Sign in (1)'), 0)
Mobile.delay(30);

//Mobile.closeApplication()

