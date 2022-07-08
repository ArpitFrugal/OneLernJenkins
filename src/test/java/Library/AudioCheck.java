package Library;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.Library;
import pageObjects.LoginPage;
import resources.Base;
import testResource.BaseLogin;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class AudioCheck extends Base {
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

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Epic("This story represents the Library module of the onelern_school project.")
    @Description("To check if the audio player is displayed or not.")
    @Story("LIBFS_06")
    @Test(dataProvider = "Studentdata")
    public void StudentAudioCheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("student", mobNumber, password);
        lib.StudentImageClick().click();

        Thread.sleep(5000);
        lib.StudentLibraryToggle().click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (mob >= 9000000001l && mob <= 9000000020l){
            driver.findElement(By.xpath("//*[@id='616064e79e1fe601b5ee7677']/img")).click();
        }
    }


    @DataProvider(name = "Studentdata")
    public Object[][] getstudentData() throws FileAlreadyExistsException {

        Object loginData[][] = {{"9000000001", "123456"}};

        return loginData;
    }

//    @DataProvider(name = "Teachersdata")
//    public Object[][] getteacherData() throws FileAlreadyExistsException {
//
//        Object loginData[][] = {{"9000000117", "123456"}, {"9000000105", "123456"}, {"9000000110", "123456"},
//                {"9000000114", "123456"}, {"9000000120", "123456"}};
//        return loginData;
//    }
}
