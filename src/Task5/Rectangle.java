package Task5;

public class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println ("draw Rectangle");
    }

    public Rectangle(){
        type = "Rectangle";
    }
}
