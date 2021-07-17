package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        //IF MY SCENARIO FAILS
        // TAKE A SCREENSHOT

        //scenario.isFailed()

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }




        System.out.println("AFTER--Teardown steps are being applied...");
        //Driver.closeDriver();
    }

}
