package com.test.web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetRows {
	
	public void Do() {
		System.out.println("Do method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath(".//*[@class='tsc_table_s13']/tbody"));
		List<WebElement>rows=	element.findElements(By.tagName("tr"));
		int length=rows.size();
		for(int row=0;row<length;row++){	
			List<WebElement>cols=rows.get(row).findElements(By.tagName("td"));
			int colsize=cols.size();
			System.out.println("rows are "+row+" columns are "+colsize);
			for(int col=0;col<1;col++){
				String celtext=cols.get(col).getText();
				System.out.println("Cell Value Of row number "+row+" and column number "+col+" Is "+celtext);
			}
		}
		driver.close();
	}

}
