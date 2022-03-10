package pages;

import org.openqa.selenium.By;

import control.Button;
import control.TextBox;

public class PaginaLogin {
	public TextBox emailTextBox = new TextBox(By.id("email"));
	public TextBox passwordTextBox = new TextBox(By.id("password"));
	public Button botonIniciarSesion = new Button(By.xpath("//button[text()='Inicia sesión']"));
	
}
