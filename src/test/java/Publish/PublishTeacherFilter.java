package Publish;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
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
import java.util.List;
import java.util.Objects;

public class PublishTeacherFilter extends Base {
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

    @Epic("This story represents the Publish module of the onelern_school project.")
    @Description("Examine whether or not the student can successfully filter content according to Teacher.")
    @Story("PUBFS_05")
    @Test(dataProvider = "studentdata")
    public void studentPublishTeacherFilter(String mobNumber, String password) throws IOException, InterruptedException {
        boolean flag = true;
        BaseLogin user = new BaseLogin(driver);
        user.userLogin("student", mobNumber, password);
        Thread.sleep(2000);
        pub.StudentImageClick().click();
        Thread.sleep(2000);
        pub.PublishToggle().click();
        Thread.sleep(10000);

        pub.TeacherNameInput().click();
        String TeacherName = pub.FirstTeacherInList().getText();
        pub.FirstTeacherInList().click();
        if (TotalContentCount() != 0){
            List<WebElement> DoubtCards = pub.DoubtCards();
            for(int i=0;i<DoubtCards.size();i++){
                if(!TeacherName.equals(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[" + (i + 2) + "]/a/div/div[1]/div[2]/h3")).getText())){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("PASSED");
        }
        else{
            Assert.fail();
        }
    }

    public int TotalContentCount(){
        List<String> pagination_text = List.of(pub.PaginationText().getText().split(" "));
        return Integer.parseInt(pagination_text.get(pagination_text.size() - 1));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @DataProvider(name = "studentdata")
    public Object[][] getstudentData() throws FileAlreadyExistsException {

//        Object loginData[][] = {{"9000000001", "123456"}, {"9000000024", "123456"}, {"9000000046", "123456"},
//                {"9000000069", "123456"}, {"9000000081", "123456"}};
        Object loginData[][] = {{"9000000001", "123456"}};
        return loginData;
    }

}
