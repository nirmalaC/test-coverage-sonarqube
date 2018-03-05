package integrationtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by NirmalaDevi.Dharmara on 02/03/2018.
 */

public class NewTest {

    @Test
    public void testLoginLink(){
        WebDriver driver = new ChromeDriver();
        //Launch the Online Store Website
        driver.navigate().to("https://www.google.co.uk/");
        driver.getTitle().equals("Google");
        // Print a Log In message to the screen
        System.out.println("Successfully opened the Google");
        // Close the driver
        driver.quit();
    }
}












