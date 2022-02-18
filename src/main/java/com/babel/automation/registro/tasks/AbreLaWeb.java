package com.babel.automation.registro.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import pageObjects.HomePage;

import java.util.logging.Logger;

public class AbreLaWeb implements Task {

    public AbreLaWeb(){}
    private HomePage homePage = new HomePage();
    public static AbreLaWeb newTours(){
        return Tasks.instrumented(AbreLaWeb.class);
    }

    @Override
    @Step("Web New Tours abierta")
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(homePage));
        Logger.getAnonymousLogger().info("Se abre la web de new tours");
    }
}
