package com.boots.bdd.page_objects;

import com.boots.bdd.drivers.DriversFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage extends DriversFactory {

    public void filterProductByPrice(String priceFilterValue){
        driver.findElement(By.xpath("//a[contains(@id,'SBN_all perfumes')]")).click();
        List<WebElement> allFilters= driver.findElements(By.xpath("//span[contains(@id,'facetLabel')]"));
        for (WebElement filter:allFilters){
            if(filter.getText().equalsIgnoreCase(priceFilterValue)){
                filter.click();
            }
        }
    }
    public void filterProductByStarRating(String rating){
        driver.findElement(By.xpath("//a[contains(@id,'SBN_all perfumes')]")).click();
        List<WebElement> starRatings= driver.findElements(By.xpath("//span[contains(@id,'ratingfacetLabel')]"));
        for(WebElement ratings: starRatings){
            if(ratings.getAttribute("title").contains(rating)){
                ratings.click();
            }
        }

    }
}
