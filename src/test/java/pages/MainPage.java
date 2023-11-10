package pages;

import com.lhsystems.lawa.idr.factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPage {
    private PlaywrightFactory playwrightFactory;
    private Page page;

    @BeforeTest
    public void initializePlaywright() {
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.initializeBrowser();
    }

    @Test(priority = 1)
    public void pageTitle_checkIfItIsReturned() {
        page.navigate("https://gdnvlnx81.dev.lsy.pl:8725/lido/lax/lax-datamaintenance-reports-ui/");
        System.out.println(page.title());
    }

    @AfterTest
    public void closePlaywright() {
        playwrightFactory.closeTestSession();
    }

}
