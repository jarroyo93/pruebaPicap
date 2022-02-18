package com.babel.automation.registro.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



public class UiLogin {

    public static final Target USER_FIELD = Target.the("Campo usuario").located(By.name("userName"));
    public static final Target PASS_FIELD = Target.the("Campo clave").located(By.name("password"));
    public static final Target LOGIN_BTN = Target.the("Botón submit").located(By.name("submit"));

    private UiLogin(){
        throw new IllegalStateException("Error UiLogin");
    }
}
