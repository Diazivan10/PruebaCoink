#Author: idiaz
Feature: Primera Prueba

	@Tag-1
 	Scenario: Ingreso No valido a cuenta
 		Given abre el navegador
 		When Selecciona la opcion ingreso
 		When digita el celular "1111111111"
 		And digita la clave 
 		Then finaliza al no poder ingresar 
 		
 		
 