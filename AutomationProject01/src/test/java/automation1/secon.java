package automation1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.sleep;

public class secon {
    @Test
    public void redmedlogin (){
        Selenide.open("https://redmed.ge/ka");
        Configuration.browserSize = "1920x1080";
        $(byText("ავტორიზაცია")).click();
        $(byText("პაციენტი")).click();
        $(byText("შესვლა")).shouldBe(Condition.visible);
        $("#login-button").shouldBe(Condition.disabled);
        $("#telLogin").setValue("555555");
        $("#login-button").shouldBe(Condition.enabled);

    }
}
