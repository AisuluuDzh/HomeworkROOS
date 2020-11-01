/**Необходимо создать интерфейс Shape и конкретный класс,
 реализующий его. В качестве следующего шага необходимо создать
 абстрактный класс AbstractFactory. Далее необходимо создать
 фабричный класс ShapeFactory, который расширяет
 функциональность AbstractFactory. Также необходимо создать код
 Абстрактной фабрики.
 Данный UML класс использует FactoryProducer , для получение
 AbstractFactoryobject. Он будет передавать информацию (CIRCLE /
 RECTANGLE / SQUARE для Shape) для AbstractFabric, чтобы
 получить нужный ей тип объекта.
 Реализуйте код для паттерна «Абстрактная фабрика» по
 следующей схеме UML Класс Диаграммы:
 */

package Task2;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory( false);
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("rectangle");
        shape3.draw ();
        Shape shape4 = shapeFactory1.getShape("square");
        shape4.draw ();

    }
}
