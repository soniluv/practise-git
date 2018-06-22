package com.boots.bdd.page_objects;

import com.boots.bdd.drivers.DriversFactory;
import gherkin.lexer.He;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HeaderPage extends DriversFactory {

    public void doSearch(){
        driver.findElement(By.cssSelector("#SimpleSearchForm_SearchTerm")).sendKeys("perfume");
        driver.findElement(By.cssSelector(".submitButton")).click();
       // sleepBroswer(5000);
    }


}
