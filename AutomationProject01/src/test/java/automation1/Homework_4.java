package automation1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class Homework_4 {
    @Test
    public void homework4(){
        Selenide.open("https://redmed.ge/ka/user/register");
        Configuration.browserSize = "1920x1080";
        $(byText("მომხმარებლის")).shouldBe(Condition.visible);
        $(byText("რეგისტრაცია")).shouldBe(Condition.visible);
        $("#userName").click();
        $("#userName").shouldBe(Condition.empty);
        $("#userName").setValue("NIka");
        $("#lastName").click();
        $("#lastName").shouldBe(Condition.empty);
        $("#lastName").setValue("Megrelishvili");
        $("#mobileNumber").click();
        $("#mobileNumber").shouldBe(Condition.empty);
        $(byXpath("//*[@id=\"phonePatientSuccess\"]/label/img")).shouldBe(Condition.visible);
        $(byText("+995")).click();
        $(".form-control").shouldBe(Condition.visible);
        $(".form-control").click();
        $(".country-select-container").shouldBe(Condition.visible);
        $(".form-control").setValue("Georgia");
        $("#mobileNumber").setValue("555555");
        $("#email").shouldBe(Condition.empty);
        $("#email").setValue("nikolozmegrelishvili0@gmail.com");
        $(byLinkText("ისარგებლე მოწვევის კოდით")).shouldBe(Condition.visible);
        $(byLinkText("ისარგებლე მოწვევის კოდით")).doubleClick();
        $("#referralCode").click();
        $("#referralCode").shouldBe(Condition.empty);
        $("#referralCode").setValue("xaxaxa");
        $("#terms").click();
        $(".mat-ripple").shouldBe(Condition.visible);
        $(".mat-ripple").click();
        sleep(1000);
    }

}
