/*
Необходимо создать интерфейс Shape и конкретные классы,
реализующие интерфейс Shape. Затем определить фабричный класс
ShapeFactory.
Реализуйте код для паттерна «Фабричный метод» по следующей
схеме UML Класс Диаграммы:v
 */
package Task1;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory ();
        Shape shape1 = shapeFactory.getShape ( "cicrle" );
        shape1.draw();
        Shape shape2 = shapeFactory.getShape ( "square" );
        shape2.draw();
        Shape shape3 = shapeFactory.getShape ( "recrangle" );
        shape3.draw();
    }
}
