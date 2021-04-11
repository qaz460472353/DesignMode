package Creational.FactoryPattern;

public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType 类型
     * @return shape
     */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
