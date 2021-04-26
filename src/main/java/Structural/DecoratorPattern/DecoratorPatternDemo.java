package Structural.DecoratorPattern;
/**
 * @description 装饰器模式
 *  向现有对象添加新功能，同时不改变其结构
 *  装饰器模式创建一个装饰类，用来包装原有的类。
 *  并在保持类方法签名完整的前提下，提供了额外的功能。
 * @date 2021/4/26 9:52
 * @auther ZY
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
