package automation1;

import com.codeborne.selenide.*;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;  // fifqi nishnavs yvelafers.
import static com.codeborne.selenide.Selenide.*;

public class firsttest {

    @Test
    public void test1 () {
        Selenide.open("https://www.google.com/");
        Configuration.browserSize = "1920x1080";
        SelenideElement selector = $(".gLFyf");
        $("#telllogin").shouldBe(Condition.visible, Duration.ofMillis(5000));
        System.out.println(selector);
        ElementsCollection col = $$(byName("q")).shouldHave(CollectionCondition.size(12));
        $(".gLFyf").click();
        sleep(1000); // shuashi tu weria anelebs process magram ar viyenebt, cudia.


    }

}
