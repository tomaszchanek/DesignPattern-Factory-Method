package factory;

import buttons.Button;
import buttons.HtmlButton;

/*
 * Here we'll create HTML button tags
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
