package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Library {

	public WebDriver driver;

	By StudentImageClick = By.xpath("//div[@class='d-flex justify-content-center align-items-center flex-column']//div[2]//button[1]//img[1]");
	By TeacherLibraryToggle = By.xpath("//img[@src='/images/library.svg']");
	By StudentLibraryToggle = By.xpath("//img[@src='/images/library-white.svg']");
	By TeacherBackButton = By.xpath("/html/body/header/div[1]/div[1]/button");

	// lesson name verify
	By FirstLessonText = By.xpath("//*[@id='item_1']/div/div[2]");
	By SecondLessonText = By.xpath("//*[@id='item_2']/div/div[2]");
	By ThirdLessonText = By.xpath("//*[@id='item_3']/div/div[2]");
	By InsideLessonHeading = By.xpath("/html/body/header/div[1]/div[1]/span");


	// lesson topics verify
	By FirstTopicref = By.xpath("/html/body/div[3]/div/div[4]/div/div/div/div[1]/div/div/div/h2");
	By SecondTopicref = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div[1]/div/div/div/h2/span[2]");
	By SecondTopicrefEng = By.xpath("/html/body/div[3]/div/div[5]/div/div/div/div[1]/div/div/div/h2");
	By ThirdTopicref = By.xpath("/html/body/div[3]/div/div[6]/div/div/div/div[1]/div/div/div/h2/span[2]");
	By ThirdTopicrefEng = By.xpath("/html/body/div[3]/div/div[6]/div/div/div/div[1]/div/div/div/h2");
	By LessonHeading = By.xpath("/html/body/div[3]/div/div[2]/div/h1");



	// videocheck paths
	By EnvironmentalcoursebookGrade1 = By.xpath("//*[@id='61606a629e1fe601b5ee768c']/img");
	By FirstLesson = By.xpath("//div[@id='item_1']");
	By SecondLesson = By.xpath("//div[@id='item_2']");
	By ThirdLesson = By.xpath("//div[@id='item_3']");
	By videosPageTab = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[1]/div/button[2]");
	By VideoWatchBtn = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div");
	By VideoModalboxCloseBtn = By.xpath("/html/body/div[5]/div[1]/button");
	By ContentsPageTab = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[1]/div/button[1]");
	By FirstTopic = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[2]/a");
	By SecondTopic = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[3]/a/div/div");
	By ThirdTopic = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[4]/a/div/div");
	By SecondTopicEng = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[3]/a");
	By ThirdTopicEng = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div[4]/a");
	By EnvVideoPathGrade1 = By.xpath("//*[@id='6220ae6ed7f6eba6ab133b62']/vm-hls/vm-video/vm-file/video");
	By EnglishCoursebookGrade2 = By.xpath("//*[@id='61606c609e1fe601b5ee7690']/img");
	By EngVideoPathGrade2 = By.xpath("//*[@id='6228a37120d7ac6ee7d2e2a1']/vm-hls/vm-video/vm-file/video");
	By EnglishCoursebookGrade3 = By.xpath("//*[@id='61606e699e1fe601b5ee7697']/img");
	By EngVideoPathGrade3 = By.xpath("//*[@id='6228b27ffc400b66ae89c2ee']/vm-hls/vm-video/vm-file/video");
	By MathematicsCoursebookGrade3 = By.xpath("//*[@id='61606ea59e1fe601b5ee7698']/img");
	By EnglishCoursebookGrade4 = By.xpath("//*[@id='616070b99e1fe601b5ee769f']/img");
	By EngVideoPathGrade4 = By.xpath("//*[@id='6228a6f9f706bdc5ad6d0189']/vm-hls/vm-video/vm-file/video");
	By MathematicsCoursebookGrade5 = By.xpath("//*[@id='616074c09e1fe601b5ee76a8']/img");
	By MathVideoPathGrade5 = By.xpath("//*[@id='6225ff0d25f26af7958b2a36']/vm-hls/vm-video/vm-file/video");
	By EnglishCoursebookGrade5 = By.xpath("//*[@id='6160748b9e1fe601b5ee76a7']/img");
	// search box paths
	By SearchIcon = By.xpath("//img[@class='pointer']");
	By SearchInput = By.xpath("//input[contains(@class,'search-box')]");
	By HighlightTexts = By.xpath("//span[contains(@class,'j-highlight')]");
	By TotalCount = By.xpath("//span[contains(@class,'total')]");

	By WorkbookHeading = By.xpath("/html/body/header/div/div[1]/span");

	public Library(WebDriver driver2) {
		this.driver = driver2;
	}
	public WebElement StudentImageClick() {
		return driver.findElement(StudentImageClick);
	}
	public WebElement TeacherLibraryToggle() {
		return driver.findElement(TeacherLibraryToggle);
	}
	public WebElement StudentLibraryToggle() {
		return driver.findElement(StudentLibraryToggle);
	}
	public WebElement BackButton() {
		return driver.findElement(TeacherBackButton);
	}

	public WebElement TeacherBackButton(){
		return driver.findElement(TeacherBackButton);
	}

	// lesson name verify
	public String LessonHeadingText(){
		String str = driver.findElement(LessonHeading).getText();
		return str.substring(2);
	}
	public WebElement FirstLessonText(){return driver.findElement(FirstLessonText);}
	public WebElement SecondLessonText(){return driver.findElement(SecondLessonText);}
	public WebElement ThirdLessonText(){return driver.findElement(ThirdLessonText);}
	public WebElement InsideLessonHeading(){return driver.findElement(InsideLessonHeading);}



	//lessons topic verify

	public WebElement FirstTopicref(){return driver.findElement(FirstTopicref);}
	public WebElement SecondTopicref(){return driver.findElement(SecondTopicref);}
	public WebElement ThirdTopicref(){return driver.findElement(ThirdTopicref);}
	public WebElement SecondTopicrefEng(){return driver.findElement(SecondTopicrefEng);}
	public WebElement ThirdTopicrefEng(){return driver.findElement(ThirdTopicrefEng);}




	// videoCheck
	public WebElement EnvironmentalcoursebookGrade1(){return driver.findElement(EnvironmentalcoursebookGrade1);}
	public WebElement FirstLesson(){return driver.findElement(FirstLesson);}
	public WebElement SecondLesson(){return driver.findElement(SecondLesson);}
	public WebElement ThirdLesson(){return driver.findElement(ThirdLesson);}
	public WebElement videosPageTab(){return driver.findElement(videosPageTab);}
	public WebElement VideoWatchBtn(){return driver.findElement(VideoWatchBtn);}
	public WebElement VideoModalboxCloseBtn(){return driver.findElement(VideoModalboxCloseBtn);}
	public WebElement ContentsPageTab(){return driver.findElement(ContentsPageTab);}
	public WebElement FirstTopic(){return driver.findElement(FirstTopic);}
	public WebElement SecondTopic(){return driver.findElement(SecondTopic);}
	public WebElement ThirdTopic(){return driver.findElement(ThirdTopic);}
	public WebElement SecondTopicEng(){return driver.findElement(SecondTopicEng);}
	public WebElement ThirdTopicEng(){return driver.findElement(ThirdTopicEng);}
	public WebElement EnvVideoPathGrade1(){return driver.findElement(EnvVideoPathGrade1);}
	public WebElement EnglishCoursebookGrade2(){return driver.findElement(EnglishCoursebookGrade2);}
	public WebElement EngVideoPathGrade2(){return driver.findElement(EngVideoPathGrade2);}
	public WebElement EnglishCoursebookGrade3(){return driver.findElement(EnglishCoursebookGrade3);}
	public WebElement EngVideoPathGrade3(){return driver.findElement(EngVideoPathGrade3);}
	public WebElement MathematicsCoursebookGrade3(){return driver.findElement(MathematicsCoursebookGrade3);}
	public WebElement EnglishCoursebookGrade4(){return driver.findElement(EnglishCoursebookGrade4);}
	public WebElement EngVideoPathGrade4(){return driver.findElement(EngVideoPathGrade4);}
	public WebElement MathematicsCoursebookGrade5(){return driver.findElement(MathematicsCoursebookGrade5);}
	public WebElement MathVideoPathGrade5(){return driver.findElement(MathVideoPathGrade5);}
	public WebElement EnglishCoursebookGrade5(){return driver.findElement(EnglishCoursebookGrade5);}

	// search box
	public WebElement SearchIcon(){return driver.findElement(SearchIcon);}
	public WebElement SearchInput(){return driver.findElement(SearchInput);}
	public List<WebElement> HighlightTexts(){return driver.findElements(HighlightTexts);}
	public String TotalCount(){return driver.findElement(TotalCount).getText();}

	public WebElement WorkbookHeading(){return driver.findElement(WorkbookHeading);}


}
