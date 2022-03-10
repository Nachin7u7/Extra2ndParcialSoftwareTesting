package pages;

import org.openqa.selenium.By;

import control.Button;

public class OpcionesDeCuenta {
	public Button logoutButton = new Button(By.xpath("//button[@role='menuitem']/span[text()='Cerrar sesión']"));
}
