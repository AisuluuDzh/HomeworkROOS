/*
Представим, что у нас есть бизнес-кейс ресторана быстрого питания,
где типичной едой может быть бургер и холодный напиток. Бургер
может быть вегетарианским или куриным, и он будет упакован в
обертку. Холодный напиток может быть колой или пепси и будет
расфасован в бутылку.
Первым шагом необходимо создать интерфейс Item, представляющий
такие продукты питания, как гамбургеры и холодные напитки, и
конкретные классы, реализующие интерфейс Item, и интерфейс
Packing, представляющий упаковку продуктов питания, и конкретные
классы, реализующие интерфейс Packing, поскольку гамбургер будет
упакован в обертку и холодные напитки. будет упакован как бутылка.
Затем необходимо создать класс Meal, содержащий ArrayList of Item
и MealBuilder, для создания различных типов объектов Meal путем
объединения Item. BuilderPatternDemo, наш демонстрационный класс
будет использовать MealBuilder для создания Meal.
Реализуйте код для паттерна «Строитель»(Builder) по следующей
схеме UML Класс Диаграммы:
 */
package Task4;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
