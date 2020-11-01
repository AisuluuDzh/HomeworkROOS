/*
Необходимо создать класс SingleObject. Класс SingleObject имеет
 свой конструктор как частный и статический экземпляр самого себя.
 Класс SingleObject предоставляет статический метод для передачи
 своего статического экземпляра во внешний мир.
 SingletonPatternDemo, наш демонстрационный класс будет
 использовать класс SingleObject для получения объекта SingleObject.
 Реализуйте код для паттерна «Синглтон»(Одиночки) по следующей
 схеме UML Класс Диаграммы:
 */

package Task3;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
