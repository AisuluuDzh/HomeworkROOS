package Task2;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String typeShape) {
        if(typeShape.equalsIgnoreCase("rectangle")){
            return new RoundedRectangle();
        }else if(typeShape.equalsIgnoreCase("square")){
            return new RoundedSquare();
        }
        return null;
    }
}
