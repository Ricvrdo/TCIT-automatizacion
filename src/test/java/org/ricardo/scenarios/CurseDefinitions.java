package org.ricardo.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ricardo.pages.CursoPage;
import org.ricardo.pages.HomePage;

public class CurseDefinitions {

    HomePage homePage;
    CursoPage cursoPage;

    @Given("un navegador con la pagina \"colections\" cargada")
    public void cargarPaginaHome(){
        homePage = new HomePage();
    }

    @When("se busca curso \"Modern React and NodeJS Development\" en la barra de busqueda")
    public void buscarCurso(){
        homePage.buscarCurso();
    }

    @And ("se hace click en curso  \"Modern React and NodeJS Development\"")
    public void clickCurso(){
        this.cursoPage=homePage.entrarCurso();
    }

    @And("se da click al video del curso")
    public void playVideo(){
        cursoPage.playVideo();
    }


}
