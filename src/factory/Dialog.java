package factory;

import buttons.Button;

/*
 * Base class with factory method
 */
abstract public class Dialog {
    public void renderWindow() {
        // ... more code ...

        Button okButton = createButton();
        okButton.render();
    }

    /*
     * Method to override by subclasses
     */
    public abstract Button createButton();
}
