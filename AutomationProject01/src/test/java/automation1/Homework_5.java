package automation1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertEquals;

public class Homework_5 {
    @Test
    public void homework5_1 () {
        Selenide.open("https://ee.ge/");
        Configuration.browserSize = "1920x1080";
        $(byText("რეგისტრაცია")).click();
        $("#firstName").setValue("nika");
        $("#lastName").setValue("megrelishvili");
        $("#email").setValue("nikolozmegrelishvili0@gmail.com");
        $("#password").setValue("nika123");
        $("#confirmPassword").setValue("nika123");



        Assert.assertTrue($("#firstName").is(Condition.not(Condition.empty)));
        Assert.assertTrue($("#lastName").is(Condition.not(Condition.empty)));
        Assert.assertTrue($("#email").is(Condition.not(Condition.empty)));
        Assert.assertTrue($("#password").is(Condition.not(Condition.empty)));
        Assert.assertTrue($("#confirmPassword").is(Condition.not(Condition.empty)));
        Assert.assertTrue($("#singup").is(Condition.enabled));
    }


    @Test
    public void homework5_2(){
         Selenide.open("https://ee.ge/");
         Configuration.browserSize = "1920x1080";
         $(byText("რეგისტრაცია")).click();
        $("#firstName").click();
        $("#lastName").click();
        $("#email").click();
        $("#password").click();
        $("#confirmPassword").click();
        $("#email").setValue("test");
        $("#email").setValue("test@");
        $("#email").setValue("test@gmail");
        $("#password").setValue("12345");
        $("#confirmpassword").setValue("1243");

         Assert.assertTrue($("#signup").is(Condition.disabled));
         Assert.assertTrue($("text-danger").is(Condition.visible);

    }

}
