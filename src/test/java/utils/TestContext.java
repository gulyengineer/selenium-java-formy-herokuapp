package utils;

import pages.BasePage;

public class TestContext {

    private static final ThreadLocal<BasePage> currentPage = new ThreadLocal<>();

    public static BasePage getCurrentPage() {
        return currentPage.get();
    }

    public static void setCurrentPage(BasePage page) {
        currentPage.set(page);
    }
}
