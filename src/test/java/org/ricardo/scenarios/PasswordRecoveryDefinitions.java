package org.ricardo.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ricardo.pages.PasswordRecoveryPage;

public class PasswordRecoveryDefinitions {

    PasswordRecoveryPage passwordRecoveryPage;

    @Given("un navegador con la pagina de recuperacion de passwrod cargada")
    public void cargarPaginaRecuperacion(){
        passwordRecoveryPage = new PasswordRecoveryPage();
    }

    @When("se llena el campo \"Email\" con el correo de la cuenta que se recuperará el acceso")
    public void llenarEmail(){
        passwordRecoveryPage.setEmailRecovery("correo3@correo.com");
    }
    @And("se hace click en el boton Submit")
    public void clickBoton(){
        passwordRecoveryPage.submit();
    }

    @Then("Se muestra el Mensaje \"Help is on the way!\"")
    public void mensaje(){
        boolean x = passwordRecoveryPage.header.isUserLogged() ;
        System.out.println(x);
        assert passwordRecoveryPage.header.isUserLogged();
    }
}
