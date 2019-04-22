package org.demo.factories;

import org.demo.buttons.Button;
import org.demo.buttons.MacOSButton;
import org.demo.checkboxes.Checkbox;
import org.demo.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}