package Adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        DuckImplement turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(DuckImplement duck) {
        duck.quack();
        duck.fly();
    }
}
