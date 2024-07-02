package maven.maven;

import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        WebDriver driver=new ChromeDriver();
        driver.get("http://183.82.103.245/nareshit/login.php");
        System.out.println("application is opened");
        System.out.println("application is opened");
        System.out.println("application is opened");
        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        System.out.println("login is completed");
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("logout is completed");
        driver.close();

    }
}
