package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.InicioPaginaStep;
import steps.PaginaPrincipalStep;

public class PrimeroDefinition {

	@Steps
	InicioPaginaStep inicioPaginaStep;
	@Steps
	PaginaPrincipalStep paginaPrincipalStep;
	

	@Given("abre el navegador")
	public void abreElNavegador() {
		inicioPaginaStep.abrirUrl();
		
	}


	@When("Selecciona la opcion ingreso")
	public void selecciona_la_opcion_ingreso() {
	paginaPrincipalStep.cerrarVentanaEmergente();
	paginaPrincipalStep.seleccionarInicio();
	}
	
	@When("digita el celular {string}")
	public void digita_el_celular(String strNumero) {
		paginaPrincipalStep.digitarNumero(strNumero);
	
	
	}
	
	@When("digita la clave")
	public void digita_la_clave() {
		paginaPrincipalStep.digitarClave();
		paginaPrincipalStep.clickIngresar();
	}
	
	@Then("finaliza al no poder ingresar")
	public void finaliza_al_no_poder_ingresar() {
		paginaPrincipalStep.cerrarIngresoNoValido();
	}


	
	
}
