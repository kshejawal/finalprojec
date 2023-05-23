package Database;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMLogin {

	public class loginPage {
		
	}
		public static WebDriver driver;
		@BeforeTest
		public void setup() {
			//browser initilisation  
			System.setProperty("webdriver.chrome.driver", "C:\\selenium jars\\chromedriver_win32/chromedriver.exe");
	   		ChromeOptions co = new ChromeOptions();
	   		co.addArguments("--remote-allow-origins=*");
	   		driver = new ChromeDriver(co);
	   		driver.manage().window().maximize();
		}
		@Test (priority =1)
		public void LoginHRMS() {
			// verify Orangehrm page is open 
			//verify username box is visible and clickable 
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			WebElement userName = driver.findElement(By.name("username"));
			assertTrue(userName.isEnabled());
			if(userName.isEnabled()) {
				userName.sendKeys("Admin");
			}
		//	Verify password input box is visible and clickable 
			WebElement password = driver.findElement(By.name("password"));
			assertTrue(password.isEnabled());
			if(password.isEnabled()) {
				password.sendKeys("admin123");
			};
			//verify login button visible and clickable 
			WebElement lgnBtn = driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
			assertTrue(lgnBtn.isEnabled());
			if(lgnBtn.isEnabled()) {
				lgnBtn.click();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			}
		}
		@Test (priority = 2)
		//verify myinfo is visible and clickable
		public void myinfo() {
			WebElement myinfo = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a > span"));
			assertTrue(myinfo.isEnabled());
			if(myinfo.isEnabled()) {
				myinfo.click();
			}
			
		}
		@Test (priority = 3)
		public void personal_deatils() {
			
			//verify firstname box is visible and clickable 
			WebElement firstname =driver.findElement(By.name("firstName"));
			assertTrue(firstname.isEnabled());
			if(firstname.isEnabled()) {
				firstname.click();
				firstname.sendKeys("kunal");
			}
			//verify middlename box is vsisble and clickable 
			WebElement middlename =driver.findElement(By.name("middleName"));
			assertTrue(middlename.isEnabled());
			if(middlename.isEnabled()) {
				middlename.click();
				middlename.sendKeys("vijay");	
		}
			//verify lastname box is visible and clickable 
			WebElement lastname =driver.findElement(By.name("lastName"));
			assertTrue(lastname.isEnabled());
			if(lastname.isEnabled()) {
				lastname.click();
				lastname.sendKeys("shejwal");
		}
			
			//verify nickname box is visible and clickable 
			WebElement nickname =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
			assertTrue(nickname.isEnabled());
			if(nickname.isEnabled()) {
				nickname.click();
				nickname.sendKeys("rocky");
		}
			//verify Employeeid box is visible and clickable 
			WebElement Employeeid =driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > input"));
			assertTrue(Employeeid.isEnabled());
			if(Employeeid.isEnabled()) {
				Employeeid.click();
				Employeeid.sendKeys("123456789");
		}
			//verify otherid box is visible and clickable 
			WebElement otherid =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
			assertTrue(otherid.isEnabled());
			if(otherid.isEnabled()) {
				otherid.click();
				otherid.sendKeys("786262598");
		}
			//verify driver license number box verify and clickable 
			WebElement Driverlicenseno =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
			assertTrue(Driverlicenseno.isEnabled());
			if(Driverlicenseno.isEnabled()) {
				Driverlicenseno.click();
				Driverlicenseno.sendKeys("786262598");
		}
			
			//verify LicenseExpiryDate visible and clickable
			WebElement LicenseExpiryDate =driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div > div > input"));
			assertTrue(LicenseExpiryDate.isEnabled());
			if(LicenseExpiryDate.isEnabled()) {
				LicenseExpiryDate.click();
				LicenseExpiryDate.sendKeys("2026-08-26");
		}
			//verify SSNnumber visible and clickable 
			WebElement SSNnumber =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
			assertTrue(SSNnumber.isEnabled());
			if(SSNnumber.isEnabled()) {
				SSNnumber.click();
				SSNnumber.sendKeys("786262598");
		}
			//verify SINnumber visible and clickable 
			WebElement SINnumber =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"));
			assertTrue(SINnumber.isEnabled());
			if(SINnumber.isEnabled()) {
				SINnumber.click();
				SINnumber.sendKeys("78626225");
		}
			//verify Nationality box is visible and clickable
			WebElement Nationality =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]"));
			assertTrue(Nationality.isEnabled());
			if(Nationality.isEnabled()) {
				Nationality.click();
				Nationality.sendKeys("Namibian");
		}
			//virify maritalstatus box is visible and clickable 
			WebElement maritalstatus =driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > div > div > div.oxd-select-text-input"));
			assertTrue(maritalstatus.isEnabled());
			if(maritalstatus.isEnabled()) {
				maritalstatus.click();
				maritalstatus.sendKeys("single");
		}
			//verify Dateofbirth box is visible and clickable 
			WebElement Dateofbirth =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
			assertTrue(Dateofbirth.isEnabled());
			if(Dateofbirth.isEnabled()) {
				Dateofbirth.click();
				Dateofbirth.sendKeys("1996-05-05");
		}
			//verify gender box is visible and clickable 
			WebElement gender = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
			assertTrue(gender.isEnabled());
			if(gender.isEnabled()) {
				gender.click();
		}
			//verify miletryservice box is visible and clicakble 
			WebElement miletryservice =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));
			assertTrue(miletryservice.isEnabled());
			if(miletryservice.isEnabled()) {
				miletryservice.click();
				miletryservice.sendKeys("Asian");
		}
			// verify smoker box is visible and clickable
			WebElement smoker =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span/i"));
			assertTrue(smoker.isEnabled());
			if(smoker.isEnabled()) {
				smoker.click();
		}
			//verify save button is visible and clickable 
			WebElement savebtn =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));
			assertTrue(savebtn.isEnabled());
			if(savebtn.isEnabled()) {
				savebtn.click();
		}	
		}
		@Test(priority = 4)
		public void Custom_Fields() {
			
			//verify blood type box is visible and clickable 
			WebElement Blood_Type =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[1]"));
			assertTrue(Blood_Type.isEnabled());
			if(Blood_Type.isEnabled()) {
				Blood_Type.click();
				Blood_Type.sendKeys("B");
		}
			//verify save button is visible and clickable 
			WebElement savebtn = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
			assertTrue(savebtn.isEnabled());
			if(savebtn.isEnabled()) {
				savebtn.click();
		}
		}
		@Test(priority = 5)
		public void attchments() {
			
			//verify add button is visible and clickable 
			WebElement Add =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));
			assertTrue(Add.isEnabled());
			if(Add.isEnabled()) {
				Add.click();
		}
			// verify select file is visible and clickable
			WebElement SelectFile =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
			assertTrue(SelectFile.isEnabled());
			if(SelectFile.isEnabled()) {
				SelectFile.click();
		}
			//verify comment box visible and clickable 
			WebElement comments =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea"));
			assertTrue(comments.isEnabled());
			if(comments.isEnabled()) {
				comments.click();
				comments.sendKeys("pass");
		}
			//verify save button is visible and clickable 
			WebElement savebtne =driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-attachment > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
			assertTrue(savebtne.isEnabled());
			if(savebtne.isEnabled()) {
				savebtne.click();
		}
			
		}
		@AfterTest
		public void teardown() {
			driver.quit();
		}
}
