package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Color.ColorFactory;
import Creational.AbstractFactoryPattern.Shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
