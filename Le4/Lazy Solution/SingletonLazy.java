public class SingletonLazy {

    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {
        System.out.println("Lazy Singleton Instance Created");
    }

    public static SingletonLazy getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }

    public static void main(String[] args) {
        SingletonLazy obj1 = SingletonLazy.getInstance();
        obj1.showMessage();

        SingletonLazy obj2 = SingletonLazy.getInstance();
        System.out.println("Are both instances equal? " + (obj1 == obj2));
    }
}
