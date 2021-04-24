package Creational.PrototypePattern;

public class PrototypePatternDemo {
    /**
     * 1、创建一个抽象类 Shape 和扩展了 Shape 类的实体类
     * 2、定义类 ShapeCache ，该类把 shape 对象存储在一个 Hashtable 中，并在请求的时候返回它们的克隆
     * 3、PrototypPatternDemo 类使用 ShapeCache 类来获取 Shape 对象
     */
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
