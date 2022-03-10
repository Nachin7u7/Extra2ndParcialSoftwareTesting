package testClean;

import pages.OpcionesDeCuenta;
import pages.PaginaInicio;
import pages.PaginaLogin;
import pages.PaginaPrincipal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singleton.Session;


public class VerificarLogin extends BaseTodoist{

	PaginaInicio paginaInicio = new PaginaInicio();
    PaginaLogin paginaLogin = new PaginaLogin();
    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
    OpcionesDeCuenta opcionesCuenta = new OpcionesDeCuenta();

    
    @Test
    public void verify_login_todoly() throws InterruptedException {
        //Login
        paginaInicio.buttonLogin.click();
        paginaLogin.emailTextBox.clearSetText("ignacio.valencia.sauma@gmail.com");
        paginaLogin.passwordTextBox.clearSetText("Secreta123");
        paginaLogin.botonIniciarSesion.click();
        paginaPrincipal.configurationButton.click();
        
        Thread.sleep(2000);

        Assertions.assertTrue(opcionesCuenta.logoutButton.isControlDisplayed());

    }
	
	
}
