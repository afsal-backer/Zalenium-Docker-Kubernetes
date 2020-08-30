package com.automationcalling.testsuites;

import com.automation.pagefactory.Automationcallinghome;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class BasicTests2 {
    private Automationcallinghome automationcallinghome;

    @Parameters({"browsertype", "executionType"})
    @BeforeClass
    public void init(String browserType, String executionType) throws IOException 
    {
       System.out.println("btype is: "+browserType);
       System.out.println("executionType is: "+executionType);
       automationcallinghome = new Automationcallinghome(browserType, executionType);
    }

    @Test
    public void articleLinkTest() throws InterruptedException 
    {
        automationcallinghome.clickArticlelink();
    }

    @AfterClass
    public void tearDown() 
    {
        automationcallinghome.destroyPage();
    }

}
