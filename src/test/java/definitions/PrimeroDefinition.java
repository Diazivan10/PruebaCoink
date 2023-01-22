package definitions;

import io.cucumber.java.en.Given;
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


	@When("selecciona la seccion imagenes")
	public void seleccionLaSeccionImgenes() {
	paginaPrincipalStep.seleccionarSeccionImagenes();
	}

	@When("escribe la palabra {string}")
	public void escribeLaPalabra(String strPais) {
	paginaPrincipalStep.escribirPalabraBuscador(strPais);
	}
	
	
}
