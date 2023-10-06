package animals;

public class Animal {
    private int age;
    private String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    private static int count;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal(String name, String type, int age, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.type = type;
        count++;

    }

    public static int getCount() {
        return count;
    }

    public void run(int dist) {

        if (maxRunDistance == 0) {
            System.out.println(this.type + " " + this.name + " не умеет бегать");
        }
        else if  (dist >= maxRunDistance) {
            System.out.println(this.type + " " + this.name + " не смог пробежать " + dist);
        }
        else
        {
            System.out.println(this.type + " " + this.name + " пробежал " + dist);
        }
    }
    public void swim(int swimDist) {
        if (maxSwimDistance == 0) {
            System.out.println(this.type + " " + this.name + " не умеет плавать");
        }
        else if (swimDist >= maxSwimDistance) {
            System.out.println(this.type + " " + this.name + " не смог проплыть " + swimDist);
        }
        else
        {
            System.out.println(this.type + " " + this.name + " проплыл " + swimDist);
        }

    }

    }

