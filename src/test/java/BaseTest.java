import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Browsers.CHROME;



public class BaseTest {
    @BeforeEach
    public void setBrowser()
    {
        //Запускаем тест в браузере FIREFOX
       //Configuration.browser = FIREFOX ;
       Configuration.browser = CHROME;
       Configuration.browserSize = "1920x1080";

    }

}
