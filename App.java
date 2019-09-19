package org.softpost;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;

public class App 
{
    WebDriver driver;


    @BeforeTest
    public void startingUp()
    {
        System.setProperty("webdriver.chrome.driver", "/home/madacaleniuc/IdeaProjects/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();

    }

    @Test
    public void verifyTitle()
    {
        String title = driver.getTitle();
        System.out.println("Current title is:" + title);
        Assert.assertEquals(title, "Title");
    }


    @AfterTest
    public void wrapUp()
    {
        driver.close();
    }


}