class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        dogCount++;
    }

    public void run(int Length) {
        if (Length <= 500) {
            super.run(Length);
        } else {
            System.out.println("Собака не пробежит такое расстояние.");
        }
    }

    public void swim(int Length) {
        if (Length <= 10) {
            super.swim(Length);
        } else {
            System.out.println("Собака не проплывет такое расстояние.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
