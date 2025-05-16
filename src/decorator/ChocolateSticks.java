package decorator;

import factory.IceCream;

public class ChocolateSticks extends IceCreamDecorator {

    public ChocolateSticks(IceCream iceCream) {
        super(iceCream);
    }

    public String getDescription() {
        return iceCream.getDescription() + " with Chocolate Sticks";
    }
}
