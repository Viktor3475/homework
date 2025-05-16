package decorator;

import factory.IceCream;

public abstract class IceCreamDecorator extends IceCream {
    protected IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public abstract String getDescription();
}
