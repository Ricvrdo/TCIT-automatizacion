package org.ricardo.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ricardo.pages.RegisterPage;
import static org.junit.Assert.*;

public class RegisterDefinitions {

    RegisterPage registerPage;

    @Given("un navegador con la pagina de registro cargada")
    public void cargarPaginaRegistro(){
        registerPage = new RegisterPage();
    }

    @When("se llena el campo  \"First Name\" con \"Juan\"")
    public void llenarNombre(){
        registerPage.setName("Juan");
    }

    @And("se llena el campo \"Last Name\" con Perez")
    public void llenarApellido(){
        registerPage.setLastName("Perez");
    }

    @And("se llena el campo \"Email\" con \"correo5@correo.com\"")
    public void llenarCorreo(){
        registerPage.setEmail("correo5@correo.com");
    }

    @And("se llena el campo \"Password\" con \"password133\"")
    public void llenarPassword(){
        registerPage.setPassword("password133");
    }

    @And("se aceptan los terminos y condiciones")
    public void aceptarTerminos(){
        registerPage.agreeTerms();
    }

    @And("se hace click en el boton Sign up")
    public void clickBoton(){
        registerPage.signUp();
    }

    @Then("se redirecciona al Homepage con la sesion iniciada")
    public void redireccion(){
        boolean isUserLogged = registerPage.header.isUserLogged() ;
        assertTrue(isUserLogged);
    }



}
