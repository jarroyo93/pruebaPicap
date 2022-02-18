package com.babel.automation.registro.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class UiHome {

    public static final Target MSG_LOGIN_SUCCESSFULLY = Target.the("Mensaje de bienvenida").located(By.xpath("//h3[1]"));

    private UiHome(){
        throw new IllegalStateException("Error UiHome");
    }
}
