package pages;

import org.openqa.selenium.By;

import control.Button;
import control.Label;

public class PaginaPrincipal {
    public Button configurationButton = new Button(By.xpath("//button[contains(@class,'top_bar_btn settings_btn')]"));
    public Button projectButton = new Button(By.xpath("//button[@class='expansion_panel__toggle']/span[text()='Proyectos']"));
    public Button buttonAddProject = new Button(By.xpath("//button[@class='adder_icon']"));
    public Label tituloDeProyecto = new Label(By.xpath("//h1/span[@class=\"simple_content\"]"));
    //public Button buttonProyectoIndicado = new Button(By.id("//li[last()]/div"));
    public Button buttonMasOpciones = new Button(By.xpath("//button[contains(@aria-label, 'Men� de opciones del proyecto')]"));

}
