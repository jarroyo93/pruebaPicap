package com.babel.automation.registro.stepsdefinitions;

import com.babel.automation.registro.models.CredencialesLogin;
import com.babel.automation.registro.questions.MensajeDeLogin;
import com.babel.automation.registro.tasks.AbreLaWeb;
import com.babel.automation.registro.tasks.HaceLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions {

    @Given("^Que (.*) esta en la web de new tours$")
    public void queEstaEnLaWebDeNewTours(String nombre){

        theActorCalled(nombre).wasAbleTo(AbreLaWeb.newTours());
    }

    @When("^Diligencia el formulario del ingreso a la web$")
    public void diligenciaElFormularioDelIngresoAlaWeb(List<CredencialesLogin> cred){
        theActorInTheSpotlight().attemptsTo(HaceLogin.correctamenteEnLaWeb(cred.get(0)));
    }

    @Then("^y vera el mensaje (.*)$")
    public void yVeraElMensaje(String msg){
        theActorInTheSpotlight().should(
                seeThat(MensajeDeLogin.bienvenida(msg), equalTo(msg))
        );
    }
}
