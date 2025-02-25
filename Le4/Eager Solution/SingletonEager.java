public class SingletonEager {

    private static final SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {
        System.out.println("Eager Singleton Instance Created");
    }

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }

    public static void main(String[] args) {
        SingletonEager obj1 = SingletonEager.getInstance();
        obj1.showMessage();

        SingletonEager obj2 = SingletonEager.getInstance();
        System.out.println("Are both instances equal? " + (obj1 == obj2));
    }
}
