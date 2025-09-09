import java.util.*;
public class SimsimanAct2Num2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        int op1 = num1 + num2;
        int op2 = num1 - num2;
        int op3 = num1 * num2;
        int op4 = num1 / num2;
        int op5 = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + op1);
        System.out.println(num1 + " - " + num2 + " = " + op2);
        System.out.println(num1 + " * " + num2 + " = " + op3);
        System.out.println(num1 + " / " + num2 + " = " + op4);
        System.out.println(num1 + " mod " + num2 + " = " + op5);

        sc.close();
    }
    
}
