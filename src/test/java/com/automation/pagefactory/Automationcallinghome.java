package com.automation.pagefactory;

import com.automationcalling.seleniumcore.SeleniumUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class Automationcallinghome extends SeleniumUtil 
{
    private WebDriver driver;

    @FindBy(id = "menu-item-129")
    private WebElement articleLink;

    public Automationcallinghome(String browserType, String executionType) throws IOException 
    {
        this.driver=returnDriver(browserType,executionType);
        PageFactory.initElements(driver, this);
        maximizeWindow();
    }

    public void clickArticlelink() throws InterruptedException 
    {
    	driver.get("https://login.salesforce.com");
    	Thread.sleep(3000);
        
        driver.findElement(By.id("username")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("username")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).sendKeys("test@2020");
        Thread.sleep(2000);
    }

    public void destroyPage() 
    {
        closeBrowser();
    }

    public WebElement returnDynamicXpath(String identifier)
    {
        return driver.findElement(By.xpath("//*[@id=\"menu-item-103\"]/"+identifier+""));
    }

}
