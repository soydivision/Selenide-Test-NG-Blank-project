package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTestConditions {
    @BeforeTest
    public void setUpBrowser() {
        System.out.println("Test " + this.getClass().getName() + " started");
    }

    @AfterTest
    public void actionsAfterTest() {
        System.out.println("Test " + this.getClass().getName() + " finished");
    }
}
