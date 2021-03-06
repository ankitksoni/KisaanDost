package com.example.piyush.kisaandost;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
public class TestFarmerManager
{
    @Rule
    public ActivityTestRule<FarmerManager> mainFarmerManagerTestRule = new ActivityTestRule<>(FarmerManager.class);

    @Test
    public void TestOneFarmerManager(){
        onView(withText("MARKET PRICE")).check(matches(isDisplayed()));
        onView(withText("SCHEMES")).check(matches(isDisplayed()));
    }
}
