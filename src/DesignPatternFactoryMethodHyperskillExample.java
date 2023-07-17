class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        var myStore = new BurgerStore();
        myStore.orderBurger(BurgerType.CHINESE.name());
        myStore.orderBurger(BurgerType.AMERICAN.name());
        myStore.orderBurger(BurgerType.RUSSIAN.name());
    }
}

abstract class BurgerFactory {

    abstract Burger createBurger(String type);

    Burger orderBurger(String type) throws InterruptedException {
        Burger burger = createBurger(type);
        if (burger == null) {
            System.out.println("Sorry, we are unable to create this kind of burger\n");
            return null;
        }
        System.out.println("Making a " + burger.getName());
        burger.putBun();
        burger.putCutlet();
        burger.putSauce();
        Thread.sleep(1500L);
        System.out.println(burger.getName() + " ready" + "\n");
        return burger;
    }
}

class BurgerStore extends BurgerFactory {
    @Override
    Burger createBurger(String type) {
        switch (BurgerType.valueOf(type)) {
            case CHINESE:
                return new ChineseBurger();
            case AMERICAN:
                return new AmericanBurger();
            case RUSSIAN:
                return new RussianBurger();
            default:
                return null;
        }
    }
}

abstract class Burger {
    private final String name;

    Burger(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void putBun() {
        System.out.println("Putting bun");
    }

    void putCutlet() {
        System.out.println("Putting patty");
    }

    void putSauce() {
        System.out.println("Putting sauce");
    }

}

class ChineseBurger extends Burger {
    ChineseBurger() {
        super("Chinese Burger");
    }
}

class AmericanBurger extends Burger {
    public AmericanBurger() {
        super("American Burger");
    }
}

class RussianBurger extends Burger {
    public RussianBurger() {
        super("Russian Burger");
    }
}

enum BurgerType {
    CHINESE, AMERICAN, RUSSIAN
}

class AlertDialog {
    private String title;
    private String text;
    private String applyButton;
    private String cancelButton;

    private AlertDialog(String title, String text, String applyButton, String cancelButton) {
        this.title = title;
        this.text = text;
        this.applyButton = applyButton;
        this.cancelButton = cancelButton;
    }

    @Override
    public String toString() {
        String str = "";
        if (title != null) {
            str += "The title is: \"" + title + "\"\n";
        }
        if (text != null) {
            str += "The text is: \"" + text + "\"\n";
        }
        if (applyButton != null) {
            str += "The applyButton is: \"" + applyButton + "\"\n";
        }
        if (cancelButton != null) {
            str += "The cancelButton is: \"" + cancelButton + "\"\n";
        }

        return str;
    }

    static class Builder {
        private String title;
        private String text;
        private String applyButton;
        private String cancelButton;

        Builder() {}

        Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        Builder setText(String text) {
            this.text = text;
            return this;
        }

        Builder setApplyButton(String applyButton) {
            this.applyButton = applyButton;
            return this;
        }

        Builder setCancelButton(String cancelButton) {
            this.cancelButton = cancelButton;
            return this;
        }

        AlertDialog build() {
            return new AlertDialog(title, text, applyButton, cancelButton);
        }
    }
}