public class Main {
    public static void main(String[] args) {
        
        Mother m1 = new Child();
        m1.show(); 
        System.out.println("\n--- Testing Static Methods ---");
        System.out.println("Case 1: show() is static in Mother only.");
        System.out.println("\nCase 2: show() is static in Child only.");
        System.out.println("\nCase 3: show() is static in both Mother and Child.");
        
    }
}
