import animals.*;

public class Main {
        public static void main (String[] args){

            Animal[] animals = {
                    new Cat("Жорик", 15),
                    new Cat("Раф", 2),
                    new Dog("Ласка", 7),
                    new Tiger("Тич", 2, 150, 50),
                    new Dog("Ричи",10),
                    new Butterfly("Бочка","Бабочка",1,10000,0),
                    new Ant("Мура","Муравей",5,20000,0),
                    new Dragonfly("Стрела","Стрекоза",1,10000,0)

            };

            for (Animal a : animals) {
                a.run(160);
                a.swim(40);
            }
            System.out.println();
            System.out.println("Жизнь.");
            ((Insects) animals[5]).lifespan();
            ((Insects) animals[6]).lifespan();
            ((Insects) animals[7]).lifespan();

            System.out.println();
            System.out.println("Кол-во животных.");
            System.out.println("Количество котов " + Cat.count);
            System.out.println("Количество собак " + Dog.count);
            System.out.println("Количество тигров " + Tiger.count);
            System.out.println("Количество бабочек " + Butterfly.count);
            System.out.println("Количество муравьёв " + Ant.count);
            System.out.println("Количество стрекоз " + Dragonfly.count);
            System.out.println("Количество животных тундры  " + Insects.getInsCount());
            System.out.println("Общее количество животных  " + Animal.getCount());





        }
}