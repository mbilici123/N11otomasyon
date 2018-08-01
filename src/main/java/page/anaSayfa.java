package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.Random;

public class anaSayfa extends Regpage {

    public anaSayfa urlGit(String url) {
        driver.get(url);
        return this;
    }
    @Step("Arama Motoruna yazı gönderir ve aratır")
    public anaSayfa search(String ara){
        driver.findElement(By.xpath("//*[@id=\"searchData\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"searchData\"]")).sendKeys(ara);
        driver.findElement(By.cssSelector("#header > div > div > div.hMedMenu > div.searchBox.withLocalization > a")).click();
        return this;
    }
    @Step("Giriş Yap linkine tıklar")
    public anaSayfa girisyapTikla(){
        driver.findElement(By.cssSelector("#header > div > div > div.hMedMenu > div.customMenu > div.myAccountHolder.customMenuItem.withLocalization > div > div > a.btnSignIn")).click();
        return this;
    }

}