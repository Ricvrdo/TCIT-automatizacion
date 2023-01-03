package org.ricardo.scenarios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ricardo.pages.LoginPage;
import static org.junit.Assert.*;

public class FailedLoginDefinitions {

    LoginPage loginPage;

    @Given("el navegador con la pagina de inicio de sesion cargada")
    public void cargarPaginaLogin(){
        loginPage = new LoginPage();
    }

    @When("se llena campo \"Email\" con: \"correo3@correo.com\"")
    public void llenarCorreoLogin(){
        loginPage.setEmail("correo3@correo.com");
    }

    @And("se llena campo \"Password\" con: \"password133p\"")
    public void llenarPasswordLogin(){
        loginPage.setPassword("password133p");
    }

    @And("se hace click en el boton \"Sign in\"")
    public void clickBotonLogin(){
        loginPage.signIn();
    }

    @Then("se muestra mensaje \"Invalid email or password\"")
    public void failedLogin(){
        assertTrue(loginPage.hasError());
    }


}
