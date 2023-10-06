package animals;

public abstract class Insects extends Animal {
    private int lifespan;
    public static int count;

    public Insects(String name, String type, int age, int maxRunDistance, int maxSwimDistance, int lifespan) {
        super(name, type, age, maxRunDistance, maxSwimDistance);
        this.lifespan = lifespan;
        count++;
    }

    public static int getInsCount() {
        return count;
    }

    public void lifespan() {
        System.out.println(this.getType() + ": Продолжительность жизни " + this.getAge() + " лет");
    }
}