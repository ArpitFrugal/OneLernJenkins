package Publish;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
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

public class PublishNewContentCheck extends Base {
    public Publish pub;
    public LoginPage log;
    public WebDriver driver;
    Map<String, String> map = new HashMap<>();


    @BeforeMethod
    public void standardLogic() throws IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        pub = new Publish(driver);
        log = new LoginPage(driver);
    }

    public void ValidateTest(String actual_text, String expected_text) {
        System.out.println(actual_text+" "+expected_text);
        if(actual_text.contains(expected_text)){
            System.out.println("PASSED");
        }
        else{
            Assert.fail();
        }
    }

    @Epic("This story represents the Publish module of the onelern_school project.")
    @Description("Examine whether or not the student can successfully view the published content published by teacher.")
    @Story("PUBFS_02")
    @Test(dataProvider = "studentdata", priority = 2)
    public void studentPublishNewContentCheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("student", mobNumber, password);
        Thread.sleep(2000);
        pub.StudentImageClick().click();
        Thread.sleep(2000);
        pub.PublishToggle().click();
        Thread.sleep(2000);

        String FirstContent = pub.PublishContentOnTop().getText();
        if (mob >= 9000000001l && mob <= 9000000020l) {
            String GradeContent = map.get("Grade 1");
            ValidateTest(FirstContent, GradeContent);
        }

        else if (mob >= 9000000021l && mob <= 9000000040l) {
            String GradeContent = map.get("Grade 2");
            ValidateTest(FirstContent, GradeContent);
        }

        else if (mob >= 9000000041l && mob <= 9000000060l) {
            String GradeContent = map.get("Grade 3");
            ValidateTest(FirstContent, GradeContent);
        }

        else if (mob >= 9000000061l && mob <= 9000000080l) {
            String GradeContent = map.get("Grade 4");
            ValidateTest(FirstContent, GradeContent);
        }

        else if (mob >= 9000000081l && mob <= 9000000100l) {
            String GradeContent = map.get("Grade 5");
            ValidateTest(FirstContent, GradeContent);
        }
    }




    @Epic("This story represents the Publish module of the onelern_school project.")
    @Description("Examine whether or not the teacher can successfully publish new content.")
    @Story("PUBFT-03")
    @Test(dataProvider = "teacherdata", priority = 1)
    public void teacherPublishNewContentCheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("teacher", mobNumber, password);
        Thread.sleep(2000);
        pub.PublishToggle().click();
        Thread.sleep(5000);

        pub.PublishNewContentBtn().click();
        Thread.sleep(5000);

        List<WebElement> ContentOptions = pub.ContentOptions();
        int i=0;
        for(WebElement webElement:ContentOptions){
            if(i==0 || i==3 || i==4){
                webElement.sendKeys(Keys.ARROW_DOWN);
                webElement.sendKeys(Keys.ENTER);
            }
            else{
                webElement.sendKeys(Keys.ENTER);
            }
            i+=1;
            Thread.sleep(2000);
        }

//        for(i=0;i<5; i++){
//            driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div["+(i+1)+"]/select")).click();
//            List<WebElement> optionsUnderSelect = driver.findElements(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/div["+(i+1)+"]/select/option"));
//            for (WebElement webElement : optionsUnderSelect) {
//                if (webElement.isEnabled()) {
//                    webElement.click();
//                }
//            }
//        }
        Thread.sleep(3000);

        if(mob >= 9000000101l && mob <= 9000000104l){
            String publishContent = "Grade 1 Content";
            map.put("Grade 1",publishContent);

            pub.PublishContentDescriptionTextArea().click();
            pub.PublishContentDescriptionTextArea().sendKeys(publishContent);
            Thread.sleep(3000);
            pub.NextStepBtn().click();
            Thread.sleep(3000);
            pub.IndividualOption().click();
            pub.StudentNamesInput().click();
            pub.StudentNamesInput().sendKeys(Keys.ARROW_DOWN);
            pub.StudentNamesInput().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            pub.FinalPublishBtn().click();
            Thread.sleep(5000);
            pub.BackAfterPublish().click();

            String actual_time = pub.FirstContentTime().getText();
            String expected_time = "a minute ago";
            ValidateTest(actual_time, expected_time);
        }
        else if (mob >= 9000000105l && mob <= 9000000108l) {
            String publishContent = "Grade 2 Content";
            map.put("Grade 2",publishContent);

            pub.PublishContentDescriptionTextArea().click();
            pub.PublishContentDescriptionTextArea().sendKeys(publishContent);
            Thread.sleep(3000);
            pub.NextStepBtn().click();
            Thread.sleep(3000);
            pub.IndividualOption().click();
            pub.StudentNamesInput().click();
            pub.StudentNamesInput().sendKeys(Keys.ARROW_DOWN);
            pub.StudentNamesInput().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            pub.FinalPublishBtn().click();
            Thread.sleep(5000);
            pub.BackAfterPublish().click();

            String actual_time = pub.FirstContentTime().getText();
            String expected_time = "a minute ago";
            ValidateTest(actual_time, expected_time);
        }

        else if (mob >= 9000000109l && mob <= 9000000112l) {
            String publishContent = "Grade 3 Content";
            map.put("Grade 3",publishContent);

            pub.PublishContentDescriptionTextArea().click();
            pub.PublishContentDescriptionTextArea().sendKeys(publishContent);
            Thread.sleep(3000);
            pub.NextStepBtn().click();
            Thread.sleep(3000);
            pub.IndividualOption().click();
            pub.StudentNamesInput().click();
            pub.StudentNamesInput().sendKeys(Keys.ARROW_DOWN);
            pub.StudentNamesInput().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            pub.FinalPublishBtn().click();
            Thread.sleep(5000);
            pub.BackAfterPublish().click();

            String actual_time = pub.FirstContentTime().getText();
            String expected_time = "a minute ago";
            ValidateTest(actual_time, expected_time);
        }

        else if (mob >= 9000000113l && mob <= 9000000116l) {
            String publishContent = "Grade 4 Content";
            map.put("Grade 4",publishContent);

            pub.PublishContentDescriptionTextArea().click();
            pub.PublishContentDescriptionTextArea().sendKeys(publishContent);
            Thread.sleep(3000);
            pub.NextStepBtn().click();
            Thread.sleep(3000);
            pub.IndividualOption().click();
            pub.StudentNamesInput().click();
            pub.StudentNamesInput().sendKeys(Keys.ARROW_DOWN);
            pub.StudentNamesInput().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            pub.FinalPublishBtn().click();
            Thread.sleep(5000);
            pub.BackAfterPublish().click();

            String actual_time = pub.FirstContentTime().getText();
            String expected_time = "a minute ago";
            ValidateTest(actual_time, expected_time);
        }

        else if (mob >= 9000000117l && mob <= 9000000120l) {
            String publishContent = "Grade 5 Content";
            map.put("Grade 5",publishContent);

            pub.PublishContentDescriptionTextArea().click();
            pub.PublishContentDescriptionTextArea().sendKeys(publishContent);
            Thread.sleep(3000);
            pub.NextStepBtn().click();
            Thread.sleep(3000);
            pub.IndividualOption().click();
            pub.StudentNamesInput().click();
            pub.StudentNamesInput().sendKeys(Keys.ARROW_DOWN);
            pub.StudentNamesInput().sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            pub.FinalPublishBtn().click();
            Thread.sleep(5000);
            pub.BackAfterPublish().click();

            String actual_time = pub.FirstContentTime().getText();
            String expected_time = "a minute ago";
            ValidateTest(actual_time, expected_time);
        }

    }



    @AfterMethod
    public void tearDown() {
        driver.close();
    }
    @DataProvider(name = "studentdata")
    public Object[][] getstudentData() throws FileAlreadyExistsException {

        Object loginData[][] = {{"9000000001", "123456"}, {"9000000024", "123456"}, {"9000000046", "123456"},
                {"9000000069", "123456"}, {"9000000081", "123456"}};
//        Object loginData[][] = {{"9000000001", "123456"}};
        return loginData;
    }

    @DataProvider(name = "teacherdata")
    public Object[][] getteacherData() throws FileAlreadyExistsException {
        Object loginData[][] = {{"9000000101", "123456"}, {"9000000105", "123456"}, {"9000000109", "123456"},
                {"9000000113", "123456"}, {"9000000117", "123456"}};
//        Object loginData[][] = {{"9000000101", "123456"}};
        return loginData;
    }
}
