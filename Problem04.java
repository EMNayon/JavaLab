import java.util.Scanner;

public class Problem04 {
    public Problem04(){
        System.out.println("It's a non parameterized constructor of Problem04 class");
    }
    public void Sum(int a, int b){
        int sum = a + b;
        System.out.println("Summation of "+ a + " & " + b + " : " + 
        sum + ". It's a parameterized contructor");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Problem04 obj = new Problem04();
        obj.Sum(x,y);
    }
}
