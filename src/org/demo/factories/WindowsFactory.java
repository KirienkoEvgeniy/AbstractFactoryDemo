package org.demo.factories;

import org.demo.buttons.Button;
import org.demo.buttons.WindowsButton;
import org.demo.checkboxes.Checkbox;
import org.demo.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
