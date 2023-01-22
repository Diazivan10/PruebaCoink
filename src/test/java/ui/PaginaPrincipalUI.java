package ui;

import org.openqa.selenium.By;

public class PaginaPrincipalUI {

	private PaginaPrincipalUI() {}
	
	private static final By CHK_BUSCADOR = By.xpath("//input[contains(@class,'gsfi')]");
	private static final By BOTON_BUSCAR = By.xpath("//input[@class='gNO89b'])[2]");
	private static final By LBL_IMAGENES = By.xpath("//a[contains(text(),'Imágenes')]");
	private static final By BOTON_BUSCAR_IMAGEN = By.xpath("//button[contains(@class,'Tg7LZd')]");


	public static By getChkBuscador() {
		return CHK_BUSCADOR;
	}

	public static By getBotonBuscar() {
		return BOTON_BUSCAR;
	}

	public static By getLblImagenes() {
		return LBL_IMAGENES;
	}

	public static By getBotonBuscarImagen() {
		return BOTON_BUSCAR_IMAGEN;
	}


}
