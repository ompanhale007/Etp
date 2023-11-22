package stockin;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Createapprovalnotrequired
{
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void openbrowser()
    {
        driver=new EdgeDriver();
        driver.get("https://dev-unified-op.etpgroup.sg/");
        driver.manage().window().maximize();
    }

    @Owner("Om Panhale")
    @Test
    public void stockinapprovalnotrequired() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        WebElement email= driver.findElement(By.xpath("//input[@id=\"txtLoginId\"]"));
        email.sendKeys("ankita.thinge@etpgroup.com");

        WebElement pass= driver.findElement(By.xpath("//input[@id=\"inputPassword\"]"));
        pass.sendKeys("Ankita@123123");

        WebElement login=driver.findElement(By.xpath("//button[@id=\"btnLogin\"]"));
        login.click();

        Thread.sleep(3000);

        WebElement group=driver.findElement(By.xpath("//p[text()=\" Sylphy Group\"]"));
        group.click();

        Thread.sleep(8000);

        WebElement hamburger= driver.findElement(By.xpath("//div[@id=\"nav-icon1\"]"));
        Actions  act=new Actions(driver);
        act.moveToElement(hamburger).click().build().perform();
        Thread.sleep(1000);

        WebElement menu= driver.findElement(By.xpath("//span[text()=\"INVENTORY MANAGEMENT \"]"));
        menu.click();
        Thread.sleep(1000);

        //wait=new WebDriverWait(driver, Duration.ofMinutes(2));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Stock Transaction\"]")));
        WebElement submenu= driver.findElement(By.xpath("//a[text()=\"Stock Transaction\"]"));
        submenu.click();
        Thread.sleep(90000);


        WebElement plusbutton= driver.findElement(By.xpath("//span[@class='close']"));
        plusbutton.click();
        Thread.sleep(5000);

        WebElement stockin= driver.findElement(By.xpath("//button[text()=\" Stock IN  \"]"));
        stockin.click();
        Thread.sleep(15000);

        WebElement fornode= driver.findElement(By.xpath("//mat-select[@id='nodeuu']"));
        fornode.click();
        Thread.sleep(1000);

        WebElement fornodeselect= driver.findElement(By.xpath("//span[text()=\"Tanisq - Tanisq \"]"));
        fornodeselect.click();

        Thread.sleep(1000);

        WebElement sot= driver.findElement(By.id("mat-select-9"));
        sot.click();
        Thread.sleep(500);

        WebElement sotselect= driver.findElement(By.xpath("//span[normalize-space()='Approval Not Required - Approval Not Required']"));
        sotselect.click();
        Thread.sleep(1000);

        WebElement location= driver.findElement(By.xpath("//span[text()=\"Select Location\"]"));
        location.click();

        WebElement locselect= driver.findElement(By.xpath("//span[text()=\" L2-Approved \"]"));
        locselect.click();
        Thread.sleep(1000);

        WebElement searchicon= driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search form-control-feedback enable-pointer-events ng-star-inserted']"));
        searchicon.click();

        //Ankita@123123
        ////span[text()="INVENTORY MANAGEMENT "]

    }

    /*@AfterTest
    public void closebrowser()
    {
        System.out.println("hi");
    }

     */
}
