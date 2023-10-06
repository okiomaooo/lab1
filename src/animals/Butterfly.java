package animals;

public class Butterfly extends Insects{

    public static int life=1;
    public static int count;
    public Butterfly(String name, String type, int age, int maxRunDistance, int maxSwimDistance) {
        super("Бочка","Бабочка",1,10000,0, life);
        count ++;
    }
}
