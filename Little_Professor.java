import java.util.Random;
import java.util.Scanner;

public class Little_Professor {

    public static int GenerateNum(int level, Random ran){
        if (level == 1){
            return ran.nextInt(10);
        }
        else if (level == 2) {
            return ran.nextInt(90)+10;
        }
        else {
            return ran.nextInt(900)+100;
        }
    }

    public static void main(String[] args) {
        Random rand =  new Random();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int level;

        System.out.print("Level : ");
        level = sc.nextInt();
        for (int i = 1; i<=10 ; i++){
            int num1 = GenerateNum(level, rand);
            int num2 = GenerateNum(level, rand);

            int Result = num1 + num2;
            int tries = 0;
            boolean correct = false;

            while (tries < 3){
                System.out.print(num1 + " + "+ num2 + " = ");

               try {
                   int n = sc.nextInt();
                   if (Result == n){
                       score++;
                       correct=true;
                       break;
                   }
                   else{
                       System.out.println("EEE");
                       tries++;
                   }
               } catch (Exception e) {
                   System.out.println("EEE");
                   sc.next();
                   tries++;
               }
            }
            if (!correct){
                System.out.println(num1 + " + " + num2 + " = " + Result);
            }
        }
        System.out.println("Score : "+ score);

    }
}
