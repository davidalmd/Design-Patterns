package Adapter;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        Duck duck = new DuckImplement();
        WildTurkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    static void testTurkey(WildTurkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
