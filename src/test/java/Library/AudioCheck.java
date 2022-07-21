package Library;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

    public void ThreadSleep5000() throws InterruptedException {
        Thread.sleep(5000);
    }
    public void ThreadSleep3000() throws InterruptedException {
        Thread.sleep(3000);
    }

    public void ValidateTest(String curr_time){
        System.out.println(curr_time);
        if(curr_time.equals("0:00")){
            Assert.fail();
        }
        else{
            System.out.println("Audio played");
        }
    }

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
        lib.LibraryToggle().click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (mob >= 9000000001l && mob <= 9000000020l){ // Environmental Studies Coursebook - Part A
            lib.EnvironmentalcoursebookGrade1().click();
            ThreadSleep3000();
            lib.SecondLesson().click();
            ThreadSleep3000();

            lib.FirstTopic().click();
            ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000021l && mob <= 9000000040l){ // English Coursebook - Part A
            lib.EnglishCoursebookGrade2().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000041l && mob <= 9000000060l){ // English Coursebook - Part A
            lib.EnglishCoursebookGrade3().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000061l && mob <= 9000000080l){ // English Coursebook - Part A
            lib.EnglishCoursebookGrade4().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000081l && mob <= 9000000100l){ // English Coursebook - Part A
            lib.EnglishCoursebookGrade5().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
    }
    @Epic("This story represents the Library module of the onelern_school project.")
    @Description("Examine whether or not the audio can successfully played properly.")
    @Story("LIBFT_06")
    @Test(dataProvider = "Teacherdata")
    public void teacherVideocheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("teacher", mobNumber, password);
        ThreadSleep5000();
        lib.LibraryToggle().click();
        ThreadSleep5000();

        // Scrolling Page
        JavascriptExecutor js = (JavascriptExecutor) driver;

        if (mob >= 9000000101l && mob <= 9000000104l) { // English Coursebook - Part A
            lib.EnvironmentalcoursebookGrade1().click();
            ThreadSleep3000();
            lib.SecondLesson().click();
            ThreadSleep3000();

            lib.FirstTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000105l && mob <= 9000000108l) { // English Coursebook - Part A
            lib.EnglishCoursebookGrade2().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000109l && mob <= 9000000112l) { // English Coursebook - Part A
            lib.EnglishCoursebookGrade3().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000113l && mob <= 9000000116l) { // English Coursebook - Part A
            lib.EnglishCoursebookGrade4().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
        else if (mob >= 9000000117l && mob <= 9000000120l) { // English Coursebook - Part A
            lib.EnglishCoursebookGrade5().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.EngCommunicationTopic().click();
            ThreadSleep5000(); ThreadSleep5000();

            WebElement element = lib.AudioPlayer();
            js.executeScript("arguments[0].scrollIntoView();", element);
            ThreadSleep5000(); ThreadSleep5000();

            lib.AudioPlayBtn().click();
            ThreadSleep5000();

            String curr_time = lib.CurrPlayTime().getText();
            ValidateTest(curr_time);
        }
    }


    @DataProvider(name = "Studentdata")
    public Object[][] getstudentData() throws FileAlreadyExistsException {

        Object loginData[][] = {{"9000000001", "123456"}, {"9000000021", "123456"}, {"9000000041", "123456"},
                {"9000000061", "123456"}, {"9000000081", "123456"}};
//        Object loginData[][] = {{"9000000021", "123456"}};

        return loginData;
    }

    @DataProvider(name = "Teacherdata")
    public Object[][] getteacherData() throws FileAlreadyExistsException {

        Object loginData[][] = {{"9000000101", "123456"}, {"9000000105", "123456"}, {"9000000109", "123456"},
                {"9000000113", "123456"}, {"9000000117", "123456"}};
//        Object loginData[][] = {{"9000000101", "123456"}};
        return loginData;
    }
}
