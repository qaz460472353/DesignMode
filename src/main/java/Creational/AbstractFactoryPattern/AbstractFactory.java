package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Color.Color;
import Creational.AbstractFactoryPattern.Shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}