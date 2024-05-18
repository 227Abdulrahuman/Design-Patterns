public class Counter {

    int count = 0;

    public void addOne() {
        count++;
    }

    //Singlton Desing Pattern: To allow the creation of only one instance of the class.

    //Step 1: Make the constructor Private
    private Counter() {} //This prevents the creation of new instances of the class.

    public static Counter instance = null; //At first there will be no instance of the Counter class in memory.



    //This static method is used to retrive the only avaliable instance of the class.
    public static Counter create() {

        if (instance == null) 
            instance = new Counter(); //Lazy Singleton Implementation.

        return instance;
    }
    
}