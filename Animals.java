class Animal {
    private static int totalAnimals = 0;
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        totalAnimals++;
    }

    public void run(int obstacleLength) {
        System.out.println(name + " пробежал " + obstacleLength + " метров.");
    }

    public void swim(int obstacleLength) {
        System.out.println(name + " проплыл " + obstacleLength + " метров.");
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
