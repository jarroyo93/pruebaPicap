package com.babel.automation.registro.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/java/features"},
        tags ={"@LoginExitoso"},
        glue = {"com.babel.automation.registro.stepsdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}