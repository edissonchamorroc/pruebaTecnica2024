package com.swaglab.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.environment.SystemEnvironmentVariables;

import com.swaglab.userinterfaces.LoginUserinterface;

public class Login implements Task {
    
    private String user;
    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    
        actor.attemptsTo(
            SendKeys.of(System.getProperty(this.user)).into(LoginUserinterface.INP_USER),
            SendKeys.of(System.getProperty(this.password)).into(LoginUserinterface.INP_PASSWORD),
            Click.on(LoginUserinterface.BTN_LOGIN)
        );
    }

    public static Login conCredenciales(String user, String password){
        return Tasks.instrumented(Login.class,user,password);
    }
    
}
