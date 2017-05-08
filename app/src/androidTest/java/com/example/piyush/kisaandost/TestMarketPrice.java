package com.example.piyush.kisaandost;

import android.support.test.espresso.web.webdriver.Locator;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.web.assertion.WebViewAssertions.webContent;
import static android.support.test.espresso.web.matcher.DomMatchers.hasElementWithId;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static android.support.test.espresso.web.webdriver.DriverAtoms.findElement;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webClick;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webKeys;


@RunWith(AndroidJUnit4.class)
public class TestMarketPrice {
    @Rule
    public ActivityTestRule<MarketPrice> mainMarketPriceTestRule = new ActivityTestRule<>(MarketPrice.class);
    @Before
    public void setUp(){
        onWebView().forceJavascriptEnabled();
    }

    @Test
    public void TestOneMarketPrice() throws InterruptedException {
        onWebView().check(webContent(hasElementWithId("cboYear")));
        onWebView().check(webContent(hasElementWithId("cboMonth")));

    }
    @Test
    public void TestTwoMarketPrice(){
        onWebView().withElement(findElement(Locator.ID,"cboYear")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='2017']")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID,"cboMonth")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='March']")).perform(webClick());
    }
    @Test
    public void TestThreeMarketPrice() throws InterruptedException {
        onWebView().withElement(findElement(Locator.ID,"cboYear")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='2016']")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID,"cboMonth")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='May']")).perform(webClick());
        Thread.sleep(3000);
        onWebView().check(webContent(hasElementWithId("cboState")));
        onWebView().withElement(findElement(Locator.ID,"cboState")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='West Bengal']")).perform(webClick());
    }
    @Test
    public void  TestFourMarketPrice() throws InterruptedException {
        onWebView().withElement(findElement(Locator.ID,"cboYear")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='2015']")).perform(webClick());
        onWebView().withElement(findElement(Locator.ID,"cboMonth")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='April']")).perform(webClick());
        Thread.sleep(3000);
        onWebView().check(webContent(hasElementWithId("cboState")));
        onWebView().withElement(findElement(Locator.ID,"cboState")).perform(webClick());
        onWebView().withElement(findElement(Locator.XPATH,"//option[@value='Kerala']")).perform(webClick());
        Thread.sleep(3000);
        onWebView().check(webContent(hasElementWithId("cboCommodity")));
        onWebView().withElement(findElement(Locator.ID,"cboCommodity")).perform(webClick());
    }
}
