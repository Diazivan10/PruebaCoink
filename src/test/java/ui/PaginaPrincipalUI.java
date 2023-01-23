package ui;

import org.openqa.selenium.By;

public class PaginaPrincipalUI {

	private PaginaPrincipalUI() {}
	
	
	private static final By CERRAR_POP_UP = By.xpath("//i[@class='eicon-close']");
	private static final By BOTON_INGRESO = By.xpath("//span[contains(text(),'Ingreso')]");
	private static final By LBL_NUMERO_CELULAR = By.xpath("//*[@id=\"mat-input-0\"]");
	private static final By LBL_PASSWORD = By.xpath("//a[contains(text(),'1')]");
	private static final By BTN_OK = By.xpath("//span[contains(text(),'OK')]");
	private static final By BTN_INGRESAR = By.xpath("//span[contains(text(),'Ingresar')]");

	public static By getCerrarPopUp() {
		return CERRAR_POP_UP;
	}

	public static By getBotonIngreso() {
		return BOTON_INGRESO;
	}

	public static By getLblNumeroCelular() {
		return LBL_NUMERO_CELULAR;
	}

	public static By getLblPassword() {
		return LBL_PASSWORD;
	}

	public static By getBtnOk() {
		return BTN_OK;
	}

	public static By getBtnIngresar() {
		return BTN_INGRESAR;
	}


}
