package Creational.BuilderPattern.ImplPacking;

import Creational.BuilderPattern.Interface.Packing;

/**
 * 实现 Packing 接口的实体类
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}