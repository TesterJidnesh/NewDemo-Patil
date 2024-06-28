package com.prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Desktop\\AutomationProject\\chromedriver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.amazon.in/");
				
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("drone");
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-3']")).click();
	    driver.get("https://www.amazon.in/Heattack-David-Drone-with-4K-Camera-WiFi-FPV-1080P-HD-Dual-Foldable-RC-Drone-Altitude-Hold-Headless-Mode-Visual-Positioning-Auto-Return-App-Control-Multicolor-DRG-4/dp/B0D49XGWYW/ref=sr_1_2_sspa?crid=2WP007MFE714M&dib=eyJ2IjoiMSJ9.NqxotPL1FzwFhhHsADGVhHeoTIIbPe03pC2zEUN0cPmNvpoSf6yVl26vQhEkOZ-Of2bdXTuKVDNPJoYstuK5DHAWOSfm0J-ykM3In4ucGXTuVWPVo1Io3WA4IeDmqRIsJ0aSUE6H362sSp7izu1lbFmwxgqApJFNwxiIc8DYohEYBFksU6WMeZY_5eZ4eibMI44JakFiG71gRzZaQ4762BWbE54AXCWPVJykkTCpQYZuapWyVhT4glAGefRgOa4XCAS_7KYvg9higogJ_V0_FlKvVtWcepYpCPzUc1SyJro.rSZVy-E0d-P95jhyCrS8Ziz5s0JWlQdktQon7Cobcu4&dib_tag=se&keywords=drone&qid=1717836838&sprefix=drone%2Caps%2C524&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
       
	}

}
