package Task5;

public class Square extends Shape{
    @Override
    void draw() {
        System.out.println ("draw Square");
    }

    public Square(){
        type = "Square";
    }
}
