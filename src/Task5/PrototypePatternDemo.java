/*
Необходимо создать абстрактный класс Shape и конкретные классы,
расширяющие класс Shape. Класс ShapeCache определяется как
следующий шаг, который сохраняет объекты формы в Hashtable и
возвращает их клон по запросу.
PrototypPatternDemo, наш демонстрационный класс будет
использовать класс ShapeCache для получения объекта Shape.
Реализуйте код для паттерна «Прототип»(Prototype) по следующей
схеме UML Класс Диаграммы:
 */
package Task5;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
    }
}
