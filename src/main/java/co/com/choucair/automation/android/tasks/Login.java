package co.com.choucair.automation.android.tasks;

import static co.com.choucair.automation.android.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Task {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Login with(String username, String password) {
        return Tasks.instrumented(Login.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_INPUT),
                Click.on(NEXT_USERNAME_BUTTON),
                WaitUntil.the(PASSWORD_LINK, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(PASSWORD_LINK),
                WaitUntil.the(PASSWORD_INPUT, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(password).into(PASSWORD_INPUT),
                Click.on(SIGNIN_BUTTON),
                WaitUntil.the(LOGGEDINAS_LABEL, isPresent()).forNoMoreThan(10).seconds()
        );
    }
}
