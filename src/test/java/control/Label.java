package control;

import org.openqa.selenium.By;

public class Label extends Control{
    public Label(By locator) {
        super(locator);
    }
    
    public String getText() {
    	this.find();
    	return this.control.getText();
    }
}