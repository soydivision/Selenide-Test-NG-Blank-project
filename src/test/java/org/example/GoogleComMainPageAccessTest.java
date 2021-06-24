package org.example;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleComMainPageAccessTest extends BasicTestConditions {
    @Test
    public void openGoogleCom() {
        open("https://www.google.com/");
    }
}
