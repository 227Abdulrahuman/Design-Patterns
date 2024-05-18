
public class Singleton  {
    public static void main(String[] args) {
        Counter c1 = Counter.create();
        Counter c2 = Counter.create();

        c1.addOne();
        c2.addOne();




        System.out.println("Counter One : " +  c1.count);
        System.out.println("Counter Two : " +  c2.count);

    }
}