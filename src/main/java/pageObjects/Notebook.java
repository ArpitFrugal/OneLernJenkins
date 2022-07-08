package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notebook {
    public WebDriver driver;

    By StudentImageClick = By.xpath("//div[@class='d-flex justify-content-center align-items-center flex-column']//div[2]//button[1]//img[1]");
    By TeacherNotebookToggle = By.xpath("//img[@src='/images/notebook.svg']");
    By StudentNotebookToggle = By.xpath("//img[@src='/images/notebook-white.svg']");
    By BackButton = By.xpath("//header/div[1]/div[1]/button[1]/img[1]");

    //landing page
    By GetHeader = By.xpath("/html/body/header/div[1]/h2");


    // Grade check
    By EnglishGradeTextGrade1 = By.xpath("//div[@id='616064e79e1fe601b5ee7677']//span[@class='svelte-uh84k1']");
    By EnglishGradeTextGrade2 = By.xpath("//div[@id='61606c609e1fe601b5ee7690']//span[@class='svelte-uh84k1']");
    By EnglishGradeTextGrade3 = By.xpath("//div[@id='61606e699e1fe601b5ee7697']//span[@class='svelte-uh84k1']");
    By EnglishGradeTextGrade4 = By.xpath("//div[@id='616070b99e1fe601b5ee769f']//span[@class='svelte-uh84k1']");
    By EnglishGradeTextGrade5 = By.xpath("//div[@id='6160748b9e1fe601b5ee76a7']//span[@class='svelte-uh84k1']");



    // lesson name verify
    By EnvironmentalCoursebookGrade1 = By.xpath("//*[@id='61606a629e1fe601b5ee768c']/img");
    By MathematicsCoursebookGrade2 = By.xpath("//*[@id='61606cd19e1fe601b5ee7691']/img");
    By SocialStudiesCoursebookGrade3 = By.xpath("//*[@id='616070109e1fe601b5ee769e']/img");
    By ScienceCoursebookGrade4 = By.xpath("//*[@id='616071349e1fe601b5ee76a1']/img");
    By SocialStudiesCoursebookGrade5 = By.xpath("//*[@id='616075449e1fe601b5ee76aa']/img");
    By FirstLesson = By.xpath("//*[@id='item_1']");
    By SecondLesson = By.xpath("//*[@id='item_2']");
    By ThirdLesson = By.xpath("//*[@id='item_3']");
    By FirstLessonText = By.xpath("//*[@id='item_1']/div/div[2]");
    By SecondLessonText = By.xpath("//*[@id='item_2']/div/div[2]");
    By ThirdLessonText = By.xpath("//*[@id='item_3']/div/div[2]");
    By LessonHeading = By.xpath("/html/body/div[3]/div/div[2]/div/h1");


    public Notebook(WebDriver driver2) {
        this.driver = driver2;
    }
    public WebElement StudentImageClick() {
        return driver.findElement(StudentImageClick);
    }
    public WebElement TeacherNotebookToggle() {
        return driver.findElement(TeacherNotebookToggle);
    }
    public WebElement StudentNotebookToggle() {
        return driver.findElement(StudentNotebookToggle);
    }
    public WebElement BackButton() {
        return driver.findElement(BackButton);
    }

    // landing page
    public String GetHeader(){return driver.findElement(GetHeader).getText();}


    // Grade Check
    public WebElement EnglishGradeTextGrade1(){return driver.findElement(EnglishGradeTextGrade1);}
    public WebElement EnglishGradeTextGrade2(){return driver.findElement(EnglishGradeTextGrade2);}
    public WebElement EnglishGradeTextGrade3(){return driver.findElement(EnglishGradeTextGrade3);}
    public WebElement EnglishGradeTextGrade4(){return driver.findElement(EnglishGradeTextGrade4);}
    public WebElement EnglishGradeTextGrade5(){return driver.findElement(EnglishGradeTextGrade5);}


    // lesson name verify
    public WebElement EnvironmentalCoursebookGrade1(){return driver.findElement(EnvironmentalCoursebookGrade1);}
    public WebElement MathematicsCoursebookGrade2(){return driver.findElement(MathematicsCoursebookGrade2);}
    public WebElement SocialStudiesCoursebookGrade3(){return driver.findElement(SocialStudiesCoursebookGrade3);}
    public WebElement ScienceCoursebookGrade4(){return driver.findElement(ScienceCoursebookGrade4);}
    public WebElement SocialStudiesCoursebookGrade5(){return driver.findElement(SocialStudiesCoursebookGrade5);}
    public WebElement FirstLesson(){return driver.findElement(FirstLesson);}
    public WebElement SecondLesson(){return driver.findElement(SecondLesson);}
    public WebElement ThirdLesson(){return driver.findElement(ThirdLesson);}
    public String FirstLessonText(){return driver.findElement(FirstLessonText).getText();}
    public String SecondLessonText(){return driver.findElement(SecondLessonText).getText();}
    public String ThirdLessonText(){return driver.findElement(ThirdLessonText).getText();}
    public String LessonHeading(){return driver.findElement(LessonHeading).getText().substring(2);}

}
