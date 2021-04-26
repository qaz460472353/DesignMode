package Structural.ProxyPattern;
/**
 * @description 代理模式
 *  使用一个类代表另一个类的功能
 *  代理模式创建具有现有对象的对象，以便向外界提供功能接口
 *  为其他对象提供一种代理以控制对这个对象的访问
 * @date 2021/4/26 10:04
 * @auther ZY
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
