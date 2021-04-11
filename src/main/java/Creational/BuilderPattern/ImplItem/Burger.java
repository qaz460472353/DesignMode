package Creational.BuilderPattern.ImplItem;

import Creational.BuilderPattern.ImplPacking.Wrapper;
import Creational.BuilderPattern.Interface.Item;
import Creational.BuilderPattern.Interface.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
