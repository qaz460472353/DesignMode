package Creational.BuilderPattern.ImplItem;

import Creational.BuilderPattern.ImplPacking.Bottle;
import Creational.BuilderPattern.Interface.Item;
import Creational.BuilderPattern.Interface.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
