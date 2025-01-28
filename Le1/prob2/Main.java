public class Main {
    public static void main(String[] args) {
        Mother motherObj = new Mother();
        motherObj.show(); 

        Child childObj = new Child();
        childObj.show();
        Mother polymorphicObj = new Child();
        polymorphicObj.show(); 
}
}