package com.automationcalling.testsuites;

import com.automation.pagefactory.Automationcallinghome;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

public class BasicTests7 
{
	private Automationcallinghome automationcallinghome;

	  @Parameters({"browsertype", "executionType","environment","url"})
	   
	    @BeforeClass
	    public void init(String browserType, String executionType, String environment, String url) throws IOException 
	    {
	       System.out.println("btype is: "+browserType);
	       System.out.println("executionType is: "+executionType);
	       System.out.println("environment is: "+environment);
	       System.out.println("url is: "+url);
	       automationcallinghome = new Automationcallinghome(browserType, executionType, environment, url);
	    }

    @Test
    public void articleLinkTest() throws InterruptedException 
    {
        automationcallinghome.google();
    }

    @AfterClass
    public void tearDown() 
    {
        automationcallinghome.destroyPage();
    }

}
