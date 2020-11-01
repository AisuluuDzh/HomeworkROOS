package Task1;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("cicrle")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square();

        } else if(shapeType.equalsIgnoreCase("recrangle")){
            return new Rectangle();
        }

        return null;
    }
}
