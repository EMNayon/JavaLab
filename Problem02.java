import java.util.Scanner;
public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add, sub, mul, div;

        add = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("\nAddition " + add + "\nSubtraction "
        + sub + "\nMultiplication " + mul + "\nDivision " + div);

    }
}
