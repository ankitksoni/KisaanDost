package com.example.piyush.kisaandost;


import android.support.test.espresso.ViewAssertion;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.pressBack;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class TestSchemeManager {

    @Rule
    public ActivityTestRule<SchemeManager> mainSchemeTestRule = new ActivityTestRule<>(SchemeManager.class);



    @Test
    public void TestOneSchemeManager() {
        onView(withId(R.id.scrollView1)).perform(swipeDown());
        onView(withId(R.id.seed_button)).perform(click());
    }
    @Test
    public void TestTwoSchemeManager(){
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("About_us")).perform(click());
    }
    @Test
    public void TestThreeSchemeManager(){
        onView(withText("Soil")).check(matches(isDisplayed()));
        onView(withText("Seeds")).check(matches(isDisplayed()));




    }


    @Test
    public void TestfourSchemeManager() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText("Language")).perform(click());
    }

    @Test
    public void TestFiveSchemeManager(){
        onView(withId(R.id.irrigation_button)).perform(click());
    }
}
