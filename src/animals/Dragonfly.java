package animals;

public class Dragonfly extends Insects{

    public static int life=1;
    public static int count;
    public Dragonfly(String name, String type, int age, int maxRunDistance, int maxSwimDistance) {
        super("Стрела","Стрекоза",1,10000,0, life);
        count ++;
    }
}
