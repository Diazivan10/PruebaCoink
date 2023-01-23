package steps;

import utilities.AccionesWeb;

public class InicioPaginaStep {

	AccionesWeb accionesWeb;

	

	public void abrirUrl() {
		accionesWeb.abrirNavegador("https://coink.com/");
	}
}
