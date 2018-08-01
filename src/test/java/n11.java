import io.qameta.allure.Step;
import org.testng.annotations.Test;
import page.*;
public class n11 extends anaSayfa {
anaSayfa as=new anaSayfa();
mainPage mp= new mainPage();
Regpage rg=new Regpage();

 @Test
public void TEST0001() {

             as.urlGit("https://www.n11.com/");
             as.girisyapTikla();
             rg.emailDoldur();
             rg.sifreDoldur();
             rg.girisYap();
             as.search("Iphone SE");
 }
}
