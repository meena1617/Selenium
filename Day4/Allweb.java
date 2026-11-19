package org.example;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.ArrayList;

public class Allweb {
    static WebDriver driver;
    static List<WebDriver> allDrivers = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        browser();
    }

    static void browser() throws InterruptedException {
        driver = new ChromeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        edge();
        fire();
        remove();
    }

    static void edge() throws InterruptedException {
        driver = new EdgeDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void fire() throws InterruptedException {
        driver = new FirefoxDriver();
        allDrivers.add(driver);
        driver.get("https://maya.adityauniversity.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    static void remove() {
        for (WebDriver d : allDrivers) {
            d.quit();
        }
        allDrivers.clear();
    }
}
