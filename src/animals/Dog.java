package animals;

public class Dog extends Animal{
    public static int maxRunDistance=500;
    public static int maxSwimDistance=100;
    public static int count;
    public Dog(String name, int age) {
        super(name, "Собака",age, maxRunDistance, maxSwimDistance);
        count++;
    }
}
