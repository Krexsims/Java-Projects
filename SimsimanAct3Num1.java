import java.util.Scanner;
public class SimsimanAct3Num1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Your a number: ");
      if (!sc.hasNextDouble()) {
        System.out.println("Invalid please enter a number");
      }  
        double num = sc.nextDouble();

      if (num > 0){
        System.out.println("Your number is positive. ");
      }

        else if (num < 0){
            System.out.println("Your number is negative. ");
        }
        else {
            System.out.println("Your number is zero. ");
        }
        sc.close();
    }
}
