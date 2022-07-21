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
import java.util.Objects;

public class VideoCheck extends Base {
    public Library lib;
    public LoginPage log;
    public WebDriver driver;
    JavascriptExecutor js;

    @BeforeMethod
    public void standardLogic() throws IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        lib = new Library(driver);
        log = new LoginPage(driver);
    }

    public void ThreadSleep5000() throws InterruptedException {
        Thread.sleep(5000);
    }
    public void ThreadSleep3000() throws InterruptedException {
        Thread.sleep(3000);
    }


    public void VideoPlay(){
        js.executeScript("document.getElementsByTagName('video')[0].play()");
    }
    public String VideoStatus(){
        String str= js.executeScript("if(document.getElementsByTagName('video')[0].paused){return 'fail';}else{return 'pass';}").toString();
        return str;
    }
    public void ScrollToVideo(WebElement element){
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void ValidateVideoStatus(){
        String video_status = VideoStatus();
        System.out.println(video_status);
        if (Objects.equals(video_status, "pass")) {
            System.out.println("PASSED");
        }
        else {
            Assert.fail();
        }
    }
    @Epic("This story represents the Library module of the onelern_school project.")
    @Description("Examine whether or not the video can successfully played properly.")
    @Story("LIBFS_07")
    @Test(dataProvider = "Studentdata")
    public void studentVideocheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("student", mobNumber, password);
        lib.StudentImageClick().click();
        ThreadSleep3000();

        lib.LibraryToggle().click();
        ThreadSleep3000();

        // Scrolling Page
        js = (JavascriptExecutor) driver;
        if (mob >= 9000000001l && mob <= 9000000020l) { // Environmental Studies Coursebook - Part A
            lib.EnvironmentalcoursebookGrade1().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EnvVideoPathGrade1());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000021l && mob <= 9000000040l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade2().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade2());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000041l && mob <= 9000000060l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade3().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade3());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000061l && mob <= 9000000080l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade4().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade4());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000081l && mob <= 9000000100l) { // Mathematics Coursebook - Part A
            Thread.sleep(10000);
            lib.MathematicsCoursebookGrade5().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.MathVideoPathGrade5());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }

    }

    @Epic("This story represents the Library module of the onelern_school project.")
    @Description("Examine whether or not the video can successfully played properly.")
    @Story("LIBFT_07")
    @Test(dataProvider = "teacherdata")
    public void teacherVideocheck(String mobNumber, String password) throws IOException, InterruptedException {
        Long mob = Long.parseLong(mobNumber);
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("teacher", mobNumber, password);
        ThreadSleep5000();
        lib.LibraryToggle().click();
        ThreadSleep5000();

        // Scrolling Page
        js = (JavascriptExecutor) driver;

        if (mob >= 9000000101l && mob <= 9000000104l) { // Environmental Studies Coursebook - Part A
            lib.EnvironmentalcoursebookGrade1().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EnvVideoPathGrade1());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000105l && mob <= 9000000108l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade2().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade2());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000109l && mob <= 9000000112l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade3().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade3());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000113l && mob <= 9000000116l) { // English Coursebook - Part A
            Thread.sleep(10000);
            lib.EnglishCoursebookGrade4().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.EngVideoPathGrade4());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
        else if (mob >= 9000000117l && mob <= 9000000120l) { // Mathematics Coursebook - Part A
            Thread.sleep(10000);
            lib.MathematicsCoursebookGrade5().click();
            ThreadSleep3000();
            lib.FirstLesson().click();
            ThreadSleep3000();

            lib.videosPageTab().click();
            ThreadSleep3000();
            lib.VideoWatchBtn().click();
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            // check video
            ValidateVideoStatus();

            // close the video modal-box
            lib.VideoModalboxCloseBtn().click();

            //contents
            lib.ContentsPageTab().click();
            ThreadSleep3000();

            //click first topic
            lib.FirstTopic().click();
            ThreadSleep3000();

            ScrollToVideo(lib.MathVideoPathGrade5());
            ThreadSleep3000();

            // play video
            VideoPlay();
            ThreadSleep3000();

            ValidateVideoStatus();
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    // This method provides data inputs to the above mentioned data receiver
    // functions.
    @DataProvider(name = "Studentdata")
    public Object[][] getstudentData() throws FileAlreadyExistsException {

        Object loginData[][] = {{"9000000001", "123456"}, {"9000000024", "123456"}, {"9000000046", "123456"},
                {"9000000069", "123456"}, {"9000000081", "123456"}};
//        Object loginData[][] = {{"9000000001", "123456"}};
        return loginData;
    }

    @DataProvider(name = "teacherdata")
    public Object[][] getteacherData() throws FileAlreadyExistsException {
        Object loginData[][] = {{"9000000101", "123456"}, {"9000000105", "123456"}, {"9000000109", "123456"}, {"9000000113", "123456"}, {"9000000117", "123456"}};
//        Object loginData[][] = {{"9000000101", "123456"}};
        return loginData;
    }
}
