package steps;

import net.thucydides.core.annotations.Step;
import ui.PaginaPrincipalUI;
import utilities.AccionesWeb;


public class PaginaPrincipalStep {
	

	private AccionesWeb accionesWeb;	

	@Step
	public void seleccionarSeccionImagenes() {
		accionesWeb.esperaCargarPagina();
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblImagenes());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblImagenes());
	}
	
	public void escribirPalabraBuscador(String strPais){
		accionesWeb.clickBoton(PaginaPrincipalUI.getChkBuscador());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getChkBuscador(),strPais);
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getBotonBuscarImagen());
		accionesWeb.esperaCargarPagina();
		accionesWeb.tomarEvidencia();
		
	}
	
	
	
	
}	
