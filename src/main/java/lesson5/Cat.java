package lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;

    public Cat(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, String color, int age) {
        this(name, color, age, 0);
    }

    public Cat(String color, int age) {
        this("Неизвестно", color, age);
        //this.color = color;
        //this.age = age;
        //this.name = "Неизвестно";
    }

    public Cat(String color) {
        this("Неизвестно", color, 0);
    }


    /**
     * Выводит в консоль информацию об  объекте
     */
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        char c = '\"';
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age is negative");
        }
    }


}
