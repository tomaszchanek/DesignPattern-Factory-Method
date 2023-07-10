package factory;

import buttons.Button;
import buttons.WindowsButton;

/*
 * Here we'll create Windows button
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

