package utils;

import pages.BasePage;

public class TestContext {

    private static BasePage currentPage;

    public static BasePage getCurrentPage() {
        return currentPage;
    }

    public static void setCurrentPage(BasePage page) {
        currentPage = page;
    }
}
