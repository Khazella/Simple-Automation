package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {

        // Initiate Browser driver
        System.setProperty("Webdriver.chrome.driver", "E:\\Work\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Initiate URL
        String baseUrl = "https://nextcloud.khazella.com";

        // Launch Google chrome and open URL
        driver.get(baseUrl);

        // Get the Element for Account Name and input Username
        WebElement username = driver.findElement(By.id("user"));
        username.sendKeys("AutomationTesting");

        // Get the Element for Password and input Password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("TestingAutomation1");

        // Click Login Button
        WebElement login = driver
                .findElement(By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/form/fieldset/button/span"));
        login.click();

        // Verify Element Present
        WebElement welcome = driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div[1]/div/video"));

        if (welcome.isDisplayed()) {

            System.out.println("Welcome video is present!");

        } else {

            System.out.println("Welcome video is not present!");

        }

        // close Google chrome
        driver.close();

    }
}
