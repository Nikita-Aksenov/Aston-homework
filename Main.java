public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[1];
        cats[0] = new Cat("Мурзик", 3, "Белый");
        cats[0].run(150);
        cats[0].eatFromBowl(10);
        Cat.refillFoodBowl(5);

        Dog dogBobik = new Dog("Бобик", 4, "Коричневый");
        dogBobik.run(300);
        dogBobik.swim(8);

        System.out.println("Общее количество животных: " + Animal.getTotalAnimals());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());


        System.out.println();


        Circle circle = new Circle(14, "синий", "зеленый");
        Rectangle rectangle = new Rectangle(10, 10, "желтый", "красный");
        Triangle triangle = new Triangle(6, 3, 4, "красный", "черный");

        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.Perimeter());
        System.out.println("Площадь: " + circle.Area());
        System.out.println("Цвет заливки: " + circle.FillColor());
        System.out.println("Цвет границы: " + circle.BorderColor());

        System.out.println();

        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + rectangle.Perimeter());
        System.out.println("Площадь: " + rectangle.Area());
        System.out.println("Цвет заливки: " + rectangle.FillColor());
        System.out.println("Цвет границы: " + rectangle.BorderColor());

        System.out.println();

        System.out.println("Треугольник:");
        System.out.println("Периметр: " + triangle.Perimeter());
        System.out.println("Площадь: " + triangle.Area());
        System.out.println("Цвет заливки: " + triangle.FillColor());
        System.out.println("Цвет границы: " + triangle.BorderColor());
    }
}