package Creational.SingletonPattern;
/**
 * @description 单例设计模式
 *  保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *  主要解决一个全局使用的类频繁地创建与销毁
 * @date 2021/4/26 9:40
 * @auther ZY
 */
public class SingletonPattern {
    /**
     * 饿汉式
     */
    public static class hungrySingleton {
        // 直接创建对象
        public static hungrySingleton instance = new hungrySingleton();
        // 私有化构造函数
        private hungrySingleton() {}

        // 提供对外方法
        public static  hungrySingleton getInstance() {
            return instance;
        }
    }

    /**
     * 懒汉式
     */
    public static class LazySingleton {
        // 声明变量
        private static volatile LazySingleton singleton= null;
        // 私有构造函数
        private LazySingleton() {}
        // 提供对外方法
        public static synchronized LazySingleton getInstance() {
            if (singleton == null) {
                singleton = new LazySingleton();
            }
            return singleton;
        }
    }
}
