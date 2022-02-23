package com.saucedemo.solution;

import com.saucedemo.solution.pages.*;
import com.saucelabs.saucebindings.junit4.SauceBaseTest;
import com.saucelabs.saucebindings.options.SauceOptions;
import org.junit.Test;

public class PerformanceSolutionTests extends SauceBaseTest {
    @Override
    public SauceOptions createSauceOptions() {
        return SauceOptions.chrome().setName("perfTest").setCapturePerformance().setExtendedDebugging().build();
    }
    @Test()
    public void perfTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.visit();
        loginPage.atomicLogin();

        ShoppingCartPage cart = new ShoppingCartPage(driver);
        cart.visit();
    }
}
