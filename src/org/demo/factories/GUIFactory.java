package org.demo.factories;

import org.demo.buttons.Button;
import org.demo.checkboxes.Checkbox;


public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
