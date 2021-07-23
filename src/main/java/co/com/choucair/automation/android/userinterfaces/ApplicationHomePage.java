package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomePage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button to sign in app").
            located(By.id("org.wordpress.android:id/login_button"));
}
