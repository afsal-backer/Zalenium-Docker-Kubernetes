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
    
    public String urltoopen = "";

    public Automationcallinghome(String browserType, String executionType, String environment, String url) throws IOException 
    {
        this.driver=returnDriver(browserType,executionType,environment);
        PageFactory.initElements(driver, this);
        maximizeWindow();
        urltoopen=url;
        
    }

    public void clickArticlelink() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(3000);
        
        driver.findElement(By.id("username")).click();
        
        System.out.println("Entered username.");
        
        driver.findElement(By.id("username")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).click();

        
        driver.findElement(By.id("password")).sendKeys("test@2020");
        Thread.sleep(10000);
        
        System.out.println("Entered password.");
    }
    
    public void amazon() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Amazon.");
        
    }
    
    public void target() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Target.");
        
    }
    
    public void facebook() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Facebook.");
        
    }
    
    public void gmail() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Gmail.");
        
    }
    
    public void infoblox() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Infoblox.");
        
    }
    
    public void linkedin() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened LinkedIn.");
        
    }
    
    public void google() throws InterruptedException 
    {
    	driver.get(urltoopen);
    	Thread.sleep(5000);
        
    	System.out.println("Opened Google.");
        
    }

    public void destroyPage() 
    {
        closeBrowser();
    }

   

}
