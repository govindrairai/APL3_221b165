public class Application {
    public static void main(String [] args) {
        Crow crow = new IndianCrow();
        Swan swan = new IndianSwan();
        CrowAdapter crowadapter = new CrowAdapter(crow);
        Client(crowadapter);
    }

public static void Client(Swan swan) {
    swan.eat();
    swan.swim();
    swan.sing();
}
}