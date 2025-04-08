abstract class Beverage {
    private void pourBeverage(int qty) {
        System.out.println("pour "+qty + " of Beverage into a glass");
    }
protected abstract void addCondiment();
protected void stir() {}//Hook Method
private void serve() {
    System.out.println("Serve through Waiter");
}
public final void templateMethod(int qty) {
    pourBeverage(qty);
    addCondiment();
    stir();
    serve();
}
}
