package Task2;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String typeShape) {
        if(typeShape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(typeShape.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
