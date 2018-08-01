package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Regpage extends mainPage{
    @Step("Email Alanı Doldurulur")
    public Regpage emailDoldur(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("darkbluearcher@gmail.com");
        return this;
    }
    @Step("Şifre Alanı Doldurulur")
    public Regpage sifreDoldur(){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("herobatu123");
        return this;
    }
    @Step("Giriş yap butonuna tıklar")
    public Regpage girisYap(){
        driver.findElement(By.id("loginButton")).click();
        return this;
    }
}
