import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void quickTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://onet.pl");
            System.out.println("page title:" + page.title());
        }
        System.out.println("Second test has finished.");
    }
}
