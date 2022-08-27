import java.util.Scanner;
public class Problem05 {
    Problem05(){ // constructor overloading
        System.out.println("It's a non parameterized constructor of Problem04 class");
    }
    Problem05(int a, int b){
        int sum = a + b;
        System.out.println("Summation of a &  b : " + sum + ". It's a parameterized contructor");
    }
    void Sum(int a, int b){     // Method overloading 
        int sum = a + b;
        System.out.println("Summation of a & b : " + sum);
    }
    void Sum(int a , int b , int c){
        int sum = a + b + c;
        System.out.println("Summation of a , b & c : " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Problem05 obj = new Problem05();
        Problem05 obj1 = new Problem05(x,y);
        obj.Sum(x, y);
        obj.Sum(x, y, z);
    }    
}
