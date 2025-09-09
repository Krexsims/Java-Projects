import java.util.Scanner;

public class SimsimanAct2Num1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number:  ");
        int num1 = sc.nextInt();
        System.out.print("Input second number:  ");
        int num2 = sc.nextInt();
        int result = num1 * num2;

        System.out.print(num1 + " x " + num2 + " = " + result);

        sc.close();

    }
}
