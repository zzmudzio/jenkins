import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void quickTest() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://google.pl");
            Assert.assertEquals(page.title(), "Google");
        }
        System.out.println("First test has finished.");
    }
}
