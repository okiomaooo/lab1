package animals;

public class Ant extends Insects{

    public static int life=5;
    public static int count;
    public Ant(String name, String type, int age, int maxRunDistance, int maxSwimDistance) {
        super("Мура","Муравей",5,20000,0, life);
        count ++;
    }
}
