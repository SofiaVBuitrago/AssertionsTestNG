package StepDefinitions;

//import org.junit.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class loginTest {

    @BeforeTest
    public void loginToApplication(){
        System.out.println("Login to application");
    }
    @AfterTest
    public void logoutToApplication(){
        System.out.println("Logout to application");
    }

    @Test(priority = 1,description = "I'm the login test")
    public void loginTest(){
        System.out.println("Login successful");
    }

    @Test (priority = 2 )
    public void logoutTest(){
        System.out.println("Logout successful");
    }
}
