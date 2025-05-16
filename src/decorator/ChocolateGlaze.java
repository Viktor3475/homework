package decorator;

import factory.IceCream;

public class ChocolateGlaze extends IceCreamDecorator {
    public ChocolateGlaze(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return iceCream.getDescription() + " with Chocolate Glaze";
    }
}