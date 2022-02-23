package com.saucedemo.exercises;

import com.saucedemo.solution.pages.LoginPage;
import com.saucedemo.solution.pages.ShoppingCartPage;
import com.saucelabs.saucebindings.junit4.SauceBaseTest;
import com.saucelabs.saucebindings.options.SauceOptions;
import org.junit.Test;

public class PerformanceTests extends SauceBaseTest {
    @Override
    public SauceOptions createSauceOptions() {
        return SauceOptions.chrome().setName("perfTest").setCapturePerformance().setExtendedDebugging().build();
    }
    @Test()
    public void perfTest() {
        /*
         * Add your code below this
         * */

        // no assertion required

        /*
         * ^^^^^^^^ AddYour code above this ^^^^^^^^^
         * */
    }
}
