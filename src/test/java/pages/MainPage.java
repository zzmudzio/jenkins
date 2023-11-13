package pages;

import com.lhsystems.lawa.idr.factory.PlaywrightFactory;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
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
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("LOGIN WITH LUFTHANSA SYSTEMS")).click();
        System.out.println(page.content());
    }

    @AfterTest
    public void closePlaywright() {
        playwrightFactory.closeTestSession();
    }

}
