package Library;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import pageObjects.Library;
import pageObjects.LoginPage;
import resources.Base;
import testResource.BaseLogin;

public class WorkbookNameVerify extends Base {

	public Library lib;
	public LoginPage log;
	public WebDriver driver;

	@BeforeMethod
	public void standardLogic() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		lib = new Library(driver);
		log = new LoginPage(driver);

	}
	
	public void ThreadSleep2000() throws InterruptedException {
		Thread.sleep(2000);
	}
	public void ThreadSleep5000() throws InterruptedException {
		Thread.sleep(5000);
	}
	public void ValidateTest(String expected_text, String actual_text){
		if(actual_text.equals(expected_text)){
			System.out.println("PASSED");
		}
		else{
			Assert.fail();
		}
	}

	@Epic("This story represents the Library module of the onelern_school project.")
	@Description("To check if the student workbook name is the same as that mentioned in the library image")
	@Story("LIBF_05")
	@Test(dataProvider = "Studentdata")
	public void StudentWorkbookCheck(String mobNumber, String password) throws IOException, InterruptedException {
		Long mob = Long.parseLong(mobNumber);
		BaseLogin user = new BaseLogin(driver);
		user.userLogin("student", mobNumber, password);
		ThreadSleep5000();
		lib.StudentImageClick().click();
		ThreadSleep5000();
		lib.LibraryToggle().click();
		ThreadSleep5000();

		// Scrolling page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (mob >= 9000000001l && mob <= 9000000020l) { // Environmental Studies Coursebook - Part A
			lib.EnvironmentalcoursebookGrade1().click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Environmental Studies Coursebook - Part A";
			
			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000021l && mob <= 9000000040l) { // English Coursebook - Part A
			WebElement element = lib.EnglishCoursebookGrade2();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "English Coursebook - Part A";

			ValidateTest(workbookName, text);
		}
		else if (mob >= 9000000041l && mob <= 9000000060l) { // Mathematics Coursebook - Part A
			WebElement element = lib.MathematicsCoursebookGrade3();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Mathematics Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000061l && mob <= 9000000080l) { // English Coursebook - Part A
			WebElement element = lib.EnglishCoursebookGrade4();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "English Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000081l && mob <= 9000000100l) { // Mathematics Coursebook - Part A
			WebElement element = lib.MathematicsCoursebookGrade5();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Mathematics Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

	}

	@Epic("This story represents the Library module of the onelern_school project.")
	@Description("To check if the teacher workbook name is the same as that mentioned in the library image")
	@Story("LIBF_06")
	@Test(dataProvider = "Teachersdata")
	public void TeacherWorkbookCheck(String mobNumber, String password) throws IOException, InterruptedException {
		Long mob = Long.parseLong(mobNumber);
		BaseLogin user = new BaseLogin(driver);
		user.userLogin("teacher", mobNumber, password);
		ThreadSleep5000();
		lib.LibraryToggle().click();
		ThreadSleep5000();

		// Scrolling page
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (mob >= 9000000101l && mob <= 9000000104l) { // Environmental Studies Coursebook - Part A
			WebElement element = lib.EnvironmentalcoursebookGrade1();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Environmental Studies Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000105l && mob <= 9000000108l) { // English Coursebook - Part A
			WebElement element = lib.EnglishCoursebookGrade2();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "English Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000109l && mob <= 9000000112l) { // Mathematics Coursebook - Part A
			WebElement element = lib.MathematicsCoursebookGrade3();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Mathematics Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000113l && mob <= 9000000116l) { // English Coursebook - Part A
			WebElement element = lib.EnglishCoursebookGrade4();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "English Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

		else if (mob >= 9000000117l && mob <= 9000000120l) { // Mathematics Coursebook - Part A
			WebElement element = lib.MathematicsCoursebookGrade5();
			js.executeScript("arguments[0].scrollIntoView();", element);
			ThreadSleep5000();
			element.click();
			ThreadSleep5000();
			String text = lib.WorkbookHeading().getText();
			String workbookName = "Mathematics Coursebook - Part A";

			ValidateTest(workbookName, text);
		}

	}

	@DataProvider(name = "Studentdata")
	public Object[][] getstudentData() throws FileAlreadyExistsException {

		Object loginData[][] = { { "9000000001", "123456" }, { "9000000024", "123456" }, { "9000000046", "123456" },
				{ "9000000069", "123456" }, { "9000000081", "123456" } };
//		Object loginData[][] = { { "9000000001", "123456" }};
		return loginData;
	}

	@DataProvider(name = "Teachersdata")
	public Object[][] getteacherData() throws FileAlreadyExistsException {

		Object loginData[][] = { { "9000000101", "123456" }, { "9000000105", "123456" }, { "9000000110", "123456" },
				{ "9000000114", "123456" }, { "9000000120", "123456" } };
//		Object loginData[][] = { { "9000000101", "123456" }};
		return loginData;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
