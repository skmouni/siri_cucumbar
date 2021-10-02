package StepDef;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
 static WebDriver driver;
    @Given("open browser")
    public void open_browser(){
    System.setProperty("webdriver.chrome.driver","C:/chromedriver93/chromedriver_win32/chromedriver.exe");

     driver =new ChromeDriver();
        System.out.println("test");
    }

    @When("enter url {string}")
    public void enterUrl(String url) {
       System.out.println(url);
     driver.get(url);
    }

    @Then("enter username")
    public void enterUsername() {
       driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");

    }

    @Then("enter password")
    public void enterPassword() {
       driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

    }

    @And("click on login")
    public void clickOnLogin() {
       driver.findElement(By.xpath("//input[@name='Submit']")).click();
       driver.findElement(By.xpath("//b[text()='Admin']")).click();
       driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("mouni");
       driver.findElement(By.xpath("//input[@class='ac_input']")).sendKeys("mani");

    }
}
