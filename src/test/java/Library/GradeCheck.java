package Library;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class GradeCheck extends Base {

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

	@Epic("This story represents the Library module of the onelern_school project.")
	@Description("To see if a student in a specific grade has the correct grade book")
	@Story("LIBF_03")
	@Test(dataProvider = "Studentdata")
	public void CheckStudentBookGrade(String mobNumber, String password) throws IOException, InterruptedException {
		Long mob = Long.parseLong(mobNumber);
		BaseLogin user = new BaseLogin(driver);
		user.userLogin("student", mobNumber, password);
		Thread.sleep(5000);
		lib.StudentImageClick().click();
		;
		Thread.sleep(5000);
		lib.StudentLibraryToggle().click();
		if (mob >= 9000000001l && mob <= 9000000020l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='616064e79e1fe601b5ee7677']//span[@class='svelte-a6l9q'][normalize-space()='Grade 1']"))
					.getText();
			String grade = "GRADE 1";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000021l && mob <= 9000000040l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='61606c609e1fe601b5ee7690']//span[@class='svelte-a6l9q'][normalize-space()='Grade 2']"))
					.getText();
			String grade = "GRADE 2";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}

		}

		else if (mob >= 9000000041l && mob <= 9000000060l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='61606e699e1fe601b5ee7697']//span[@class='svelte-a6l9q'][normalize-space()='Grade 3']"))
					.getText();
			String grade = "GRADE 3";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000061l && mob <= 9000000080l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='616070b99e1fe601b5ee769f']//span[@class='svelte-a6l9q'][normalize-space()='Grade 4']"))
					.getText();
			String grade = "GRADE 4";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000081l && mob <= 9000000100l) {
			String text = driver
					.findElement(By.xpath("(//span[@class='svelte-a6l9q'][normalize-space()='Grade 5'])[1]")).getText();
			String grade = "GRADE 5";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

	}

	@Epic("This story represents the Library module of the onelern_school project.")
	@Description("To see if a teacher of a specific grade has the correct grade book")
	@Story("LIBF_04")
	@Test(dataProvider = "Teachersdata")
	public void CheckTeacherBookGrade(String mobNumber, String password) throws IOException, InterruptedException {
		Long mob = Long.parseLong(mobNumber);
		BaseLogin user = new BaseLogin(driver);
		user.userLogin("teacher", mobNumber, password);
		Thread.sleep(5000);
		lib.TeacherLibraryToggle().click();
		if (mob >= 9000000101l && mob <= 9000000104l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='616064e79e1fe601b5ee7677']//span[@class='svelte-a6l9q'][normalize-space()='Grade 1']"))
					.getText();
			String grade = "GRADE 1";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000105l && mob <= 9000000108l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='61606c609e1fe601b5ee7690']//span[@class='svelte-a6l9q'][normalize-space()='Grade 2']"))
					.getText();
			String grade = "GRADE 2";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			}

		}

		else if (mob >= 9000000109l && mob <= 9000000112l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='61606e699e1fe601b5ee7697']//span[@class='svelte-a6l9q'][normalize-space()='Grade 3']"))
					.getText();
			String grade = "GRADE 3";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000113l && mob <= 9000000116l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='616070b99e1fe601b5ee769f']//span[@class='svelte-a6l9q'][normalize-space()='Grade 4']"))
					.getText();
			String grade = "GRADE 4";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

		else if (mob >= 9000000117l && mob <= 9000000120l) {
			String text = driver.findElement(By.xpath(
					"//div[@id='6160748b9e1fe601b5ee76a7']//span[@class='svelte-a6l9q'][normalize-space()='Grade 5']"))
					.getText();
			String grade = "GRADE 5";
			if (text.equals(grade)) {
				System.out.println("PASSED");
			} else {
				Assert.fail();
			}
		}

	}

	@DataProvider(name = "Studentdata")
	public Object[][] getstudentData() throws FileAlreadyExistsException {

		Object loginData[][] = { { "9000000001", "123456" }, { "9000000024", "123456" }, { "9000000046", "123456" },
				{ "9000000069", "123456" }, { "9000000081", "123456" } };

		return loginData;
	}

	@DataProvider(name = "Teachersdata")
	public Object[][] getteacherData() throws FileAlreadyExistsException {

		Object loginData[][] = { { "9000000101", "123456" }, { "9000000105", "123456" }, { "9000000110", "123456" },
				{ "9000000114", "123456" }, { "9000000120", "123456" } };

		return loginData;
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
