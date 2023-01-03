package org.ricardo.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ricardo.pages.LoginPage;
import static org.junit.Assert.*;

public class LoginDefinitions {

    LoginPage loginPage;

    @Given("un navegador con la pagina de inicio de sesion cargada")
    public void cargarPaginaLogin(){
        loginPage = new LoginPage();
    }

    @When("se llena campo \"Email\" con \"correo3@correo.com\"")
    public void llenarCorreoLogin(){
        loginPage.setEmail("correo3@correo.com");
    }

    @And("se llena campo \"Password\" con \"password133\"")
    public void llenarPasswordLogin(){
        loginPage.setPassword("password133");
    }

    @And("se hace click en boton \"Sign in\"")
    public void clickBotonLogin(){
        loginPage.signIn();
    }

    @Then("se redirecciona a Homepage con la sesion iniciada")
    public void redireccionLogin(){
        boolean x = loginPage.header.isUserLogged() ;
        assertTrue (x);
    }




}
