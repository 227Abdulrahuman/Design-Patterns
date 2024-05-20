import java.util.List;
import java.util.LinkedList;


public class DuckSimulator {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        wildTurkey turkey = new wildTurkey();


        //Our Turkey is now adapted to be a duck !
        Duck turkeyAdapter = new TurkeyAdapter(turkey);


        List<Duck> ducks = new LinkedList<>();

        ducks.add(duck);
        ducks.add(turkeyAdapter);

        for (Duck d : ducks) {
            d.quack();
            d.fly();
        }
        
    }
}