package steps;

import net.thucydides.core.annotations.Step;
import ui.PaginaPrincipalUI;
import utilities.AccionesWeb;


public class PaginaPrincipalStep {
	

	private AccionesWeb accionesWeb;	

	@Step
	
	public void cerrarVentanaEmergente() {
		accionesWeb.esperaCargarPagina();
		accionesWeb.bordearElemento(PaginaPrincipalUI.getCerrarPopUp());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getCerrarPopUp());
		
	}
	public void seleccionarInicio() {

		accionesWeb.bordearElemento(PaginaPrincipalUI.getBotonIngreso());
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getBotonIngreso());
		accionesWeb.tomarEvidencia();
		
		
	}
	
	


	public void digitarNumero(String strNumero) {
		accionesWeb.tomarEvidencia();
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblNumeroCelular());
		accionesWeb.escribirTexto(PaginaPrincipalUI.getLblNumeroCelular(), strNumero);
		accionesWeb.tomarEvidencia();
		
	}
	
	
	public void digitarClave() {
		accionesWeb.tomarEvidencia();
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblPassword());
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblPassword());
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblPassword());
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblPassword());
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblPassword());
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblPassword());
		accionesWeb.bordearElemento(PaginaPrincipalUI.getLblPassword());
		accionesWeb.clickBoton(PaginaPrincipalUI.getLblPassword());
		accionesWeb.tomarEvidencia();
	}
	
	
	public void clickIngresar(){
		accionesWeb.bordearElemento(PaginaPrincipalUI.getBtnIngresar());
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnIngresar());
		
		
		
	}
	public void cerrarIngresoNoValido(){
		accionesWeb.esperaCargarPagina();
		accionesWeb.tomarEvidencia();
		accionesWeb.bordearElemento(PaginaPrincipalUI.getBtnOk());
		accionesWeb.clickBoton(PaginaPrincipalUI.getBtnOk());
		accionesWeb.esperaCargarPagina();
		
	}

	
	
	
	
}	
