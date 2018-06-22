package com.boots.bdd;

import com.boots.bdd.drivers.DriversFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriversFactory driversFactory = new DriversFactory();

    @Before
    public void setUp(){
        driversFactory.openBrowser();
        driversFactory.navigateUrl("http://www.boots.com/");
        driversFactory.maximizeWindow();
        driversFactory.implWait();
    }

    //@After
    public void tearDown(Scenario scenario){
        if(!scenario.isFailed()) {
        driversFactory.embedScreenshot(scenario);
        }
        driversFactory.closeBrowser();
    }
}
