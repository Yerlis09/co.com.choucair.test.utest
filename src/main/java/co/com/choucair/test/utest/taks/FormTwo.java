package co.com.choucair.test.utest.taks;

import co.com.choucair.test.utest.model.UTestSignUpData;
import co.com.choucair.test.utest.userinterface.UtestFormTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.type.Type;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

public class FormTwo implements Task {
    private UTestSignUpData uTestSignUpData;

    public FormTwo(UTestSignUpData uTestSignUpData) {
        this.uTestSignUpData = uTestSignUpData;
    }

    public static FormTwo the(UTestSignUpData uTestSignUpData) {
        return Tasks.instrumented(FormTwo.class, uTestSignUpData);
    }

    public <T extends Actor> void performAs(@NotNull T actor) {
        actor.attemptsTo(Enter.theValue(uTestSignUpData.getStrCity()).into(UtestFormTwoPage.INPUT_CITY),
                Enter.theValue(uTestSignUpData.getStrPostalCode()).into(UtestFormTwoPage.INPUT_POSTAL_CODE),
                Type.theValue(uTestSignUpData.getStrCountry()).into(UtestFormTwoPage.INPUT_COUNTRY).thenHit(Keys.ENTER),
                Click.on(UtestFormTwoPage.NEXT_BUTTON));
    }
}
