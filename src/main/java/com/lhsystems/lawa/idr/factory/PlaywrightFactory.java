package com.lhsystems.lawa.idr.factory;

import com.microsoft.playwright.*;

import java.util.List;

public class PlaywrightFactory {
    private final Playwright playwright;

    public PlaywrightFactory() {
        playwright = Playwright.create();
    }

    public Page initializeBrowser() {
        BrowserType browserType = playwright.chromium();
        Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(true)
                .setSlowMo(700)
                .setArgs(List.of("--disable-web-security")));
        BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setIgnoreHTTPSErrors(true)
        );
        return browserContext.newPage();
    }

    public void closeTestSession() {
        playwright.close();
    }

}
