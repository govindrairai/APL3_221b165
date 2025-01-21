public class Le0 {
    int age;
    String name;
    
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return this.age;
    }
    
    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Le0 m1 = new Le0();
        m1.setName("Govind Rai");
        m1.setAge(22);
        System.out.println("My name is "+m1.getName()+" "+"\n"+"I am "+ m1.getAge() +" year old");
    }
}
