import java.util.*;

public class SimsimanQuiz4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("++Simple Average Calculator++");
        System.out.print("Enter your First number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter your Second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter your Third number: ");
        double num3 = sc.nextDouble();

        double result = (num1 + num2 + num3) / 3;

        System.out.printf("%.2f", result);

        sc.close();
    
        
    }
    
}
