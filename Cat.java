import java.util.ArrayList;
import java.util.List;

class Cat extends Animal {
    private static List<Cat> catList = new ArrayList<>();
    private boolean isHungry;
    private static int catCount = 0;

    public Cat(String name, int age, String color) {
        super(name, age, color);
        isHungry = true;
        catCount++;
    }

    public void run(int Length) {
        if (Length <= 200) {
            super.run(Length);
        } else {
            System.out.println("Кот не пробежит такое расстояние.");
        }
    }

    public void eatFromBowl(int foodAmount) {
        if (foodAmount >= 10 && foodAmount <= 25) {
            System.out.println(name + " покушал");
            isHungry = false;
        } else {
            System.out.println("Миска не достаточно полная у " + name + ".");
            isHungry = true;
        }
    }

    public static void refillFoodBowl(int foodAmount) {
        System.out.println("Миска пополнена на " + foodAmount + " грамм.");

        for (Cat cat : catList) {
            if (cat.isHungry()) {
                cat.eatFromBowl(foodAmount);
            }
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}
