package Task5;

public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println ("draw Cicrle");
    }

    public Circle(){
        type = "Circle";
    }
}
