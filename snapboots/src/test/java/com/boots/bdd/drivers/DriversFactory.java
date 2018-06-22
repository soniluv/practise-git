package com.boots.bdd.drivers;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class DriversFactory {

private String browser="Chrome";
public static WebDriver driver;

public void openBrowser(){
    switch (browser){
        case "Chrome":
        {
            ChromeDriverManager.getInstance().setup();
            driver= new ChromeDriver();
            break;
        }
        case "ie":
            {
            InternetExplorerDriverManager.getInstance().setup();
            driver= new InternetExplorerDriver();
            break;
        }
        case "Opera":
            {
            OperaDriverManager.getInstance().setup();
            driver= new OperaDriver();
            break;
        }
        default:
        {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
            break;
        }
    }
}

public void navigateUrl(String url){driver.get(url);}
public void maximizeWindow(){driver.manage().window().maximize();}
public void implWait(){driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);}
public void closeBrowser(){driver.quit();}
public void sleepBroswer(int ms){
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenShot, "image/png");
        } catch (WebDriverException e) {
            System.out.println("took screen shot. ");
        }
    }
}

