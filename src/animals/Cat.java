package animals;

public class Cat extends Animal{
    public static int maxRunDist=100;
    public static int maxSwimDist=0;
    public static int count;
    public Cat(String name, int age) {
        super(name,"Кот", age, maxRunDist, maxSwimDist);
        count ++;
    }
}
