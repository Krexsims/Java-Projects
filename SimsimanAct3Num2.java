import java.util.Scanner;
public class SimsimanAct3Num2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your grade: ");
       
        if (!sc.hasNextInt()){
            System.out.println("Invalid please enter a number");
        }
         int grade = sc.nextInt();

        if (grade < 65 || grade > 99){
            System.out.println("invalid grade please enter 65 to 99 ");
        }
        else {
            if (grade >= 69 && grade <= 74){
                System.out.println("Your result: Failed ");

             } else if (grade >= 75 && grade <= 80){
                System.out.println("Your result: Good");

             } else if (grade >=81 && grade <= 90){
                System.out.println("Your result: Very Good");

             }else if (grade >=91 && grade <= 99){
                System.out.println("Your result: Excellent");
             }
             else {
                System.out.println("Your result: Below the passing grade");
             }
             sc.close();

        }
            
        }

    }
