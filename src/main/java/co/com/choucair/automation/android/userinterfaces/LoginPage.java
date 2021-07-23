package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("TextBox to write username").
            located(By.id("org.wordpress.android:id/input"));
    public static final Target NEXT_USERNAME_BUTTON = Target.the("Button to go the next step").
            located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target PASSWORD_LINK = Target.the("Link to enter the password").
            located(By.id("org.wordpress.android:id/login_enter_password"));
    public static final Target PASSWORD_INPUT = Target.the("TextBox to write the password").
            located(By.id("org.wordpress.android:id/input"));
    public static final Target SIGNIN_BUTTON = Target.the("Button to sing in app").
            located(By.id("org.wordpress.android:id/primary_button"));
    public static final Target LOGGEDINAS_LABEL = Target.the("Logged in as label").
            located(By.id("org.wordpress.android:id/logged_in_as_heading"));
}
