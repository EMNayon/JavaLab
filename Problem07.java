class Parent{
    public void M1(){
        System.out.println("Parent class methods");
    }
}
class Child extends Parent{
    public void M2(){
        System.out.println("Child class methods");
    }
}
public class Problem07 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.M1();
        obj.M2();
    }
}
