package Publish;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.Publish;
import resources.Base;
import testResource.BaseLogin;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublishNewContentButtonCheck extends Base {
    public Publish pub;
    public LoginPage log;
    public WebDriver driver;


    @BeforeMethod
    public void standardLogic() throws IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        pub = new Publish(driver);
        log = new LoginPage(driver);
    }

    public void PublishNewBtnValidateTest(List<WebElement> tabs){
        if (tabs.size() > 1) {
            System.out.println("Notebook Module is active");
        }
        else {
            Assert.fail();
        }
    }


    @Epic("This story represents the Publish module of the onelern_school project.")
    @Description("Examine whether or not the teacher can successfully get inside the Publish module.")
    @Story("PUBFT-02")
    @Test(dataProvider = "teacherdata")
    public void teacherPublishNewContentBtnCheck(String mobNumber, String password) throws IOException, InterruptedException {

        BaseLogin user = new BaseLogin(driver);
        user.userLogin("teacher", mobNumber, password);
        Thread.sleep(2000);
        pub.PublishToggle().click();
        Thread.sleep(5000);
        pub.PublishNewContentBtn().click();
        Thread.sleep(2000);
        List<WebElement> tabs = pub.PublishNewContentTabs();
        PublishNewBtnValidateTest(tabs);

    }



    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    @DataProvider(name = "teacherdata")
    public Object[][] getteacherData() throws FileAlreadyExistsException {
//        Object loginData[][] = {{"9000000101", "123456"}, {"9000000105", "123456"}, {"9000000109", "123456"},
//                {"9000000113", "123456"}, {"9000000117", "123456"}};
        Object loginData[][] = {{"9000000101", "123456"}};
        return loginData;
    }
}
