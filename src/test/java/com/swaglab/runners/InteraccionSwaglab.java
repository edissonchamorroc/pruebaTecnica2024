package com.swaglab.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    glue = {"com.swaglab.stepdefinitions", "com.swaglab.setup"},
    features = "src/test/resources/com/swaglab/features/interaccion_swaglab.feature", 
    snippets = CucumberOptions.SnippetType.CAMELCASE, 
    monochrome = true)

public class InteraccionSwaglab {

}
