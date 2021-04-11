package Creational.BuilderPattern.ImplItem;

import Creational.BuilderPattern.ImplItem.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
