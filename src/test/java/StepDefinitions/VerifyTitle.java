package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {

   @Test
    public void titleTest(){
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sofia.buitrago\\Documents\\LearningTestNG\\src\\test\\resources\\Drivers\\msedgedriver.exe");
        driver.navigate().to("https://x.com/");
        String ExpectedTitle = "X";
        String ActualTitle = driver.getTitle();
       System.out.println(ActualTitle);

        Assert.assertEquals(ActualTitle,ExpectedTitle );
    }


}
