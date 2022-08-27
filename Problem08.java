import java.util.Scanner;

public class Problem08 {
        public static void main(String[] args) {
            System.out.println("How many numbers you want to enter: ");
            Scanner sc = new Scanner(System.in);
            int n  = sc.nextInt();
            double[] arr = new double[n];
            double total = 0;
            for(int i = 0; i < arr.length; i++){
                System.out.print("Enter element no. " + (i+1)+ ": ");
                arr[i] = sc.nextDouble();
            }
            sc.close();
            for(int i = 0; i < arr.length; i++){
                total = total + arr[i];
            }
            double avg = total / arr.length;
            System.out.format("The average is: %.3f", avg);

        }
}
