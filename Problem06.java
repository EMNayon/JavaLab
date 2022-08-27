class Shapes{
    public void area(){
        System.out.println("The Formula for area of");
    }
}
class Triangle extends Shapes{
    public void area(){
        System.out.println("Triangle is 1/2 * base * height ");
    }
}
class Circle extends Shapes {
    public void area(){
        System.out.print("Circle is 3.14 * radius * radius");
    }
}
public class Problem06 {
    public static void main(String[] args) {
        Shapes myShapes = new Shapes();
        Shapes myTriangle = new Triangle();
        Shapes myCircle = new Circle();

        myShapes.area();
        myTriangle.area();
        myShapes.area();
        myCircle.area();
    }    
}
