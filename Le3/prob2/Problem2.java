interface Testable {
    void display();
}

class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method in Test class.");
    }
}

abstract class AbsTest implements Testable {
    @Override
    public abstract void display();
}
public class Problem2{
    public static void main(String[] args) {
        Testable test = new Test();
        test.display();
        // AbsTest absTest = new AbsTest();
    }
}
