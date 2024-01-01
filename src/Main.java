import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания от 1 до 5");
        int number = 0;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        }
        switch (number){
            case (1):
                first(scanner);
                break;
            case (2):
                second(scanner);
                break;
            case (3):
                third();
                break;
            case (4):
                fourth(scanner);
                break;
            case (5):
                fifth(scanner);
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }

    }


    public static void first(Scanner scanner) {

         System.out.println("Введите число: ");
         if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number % 2 == 0){
                System.out.println(number + " - четное");
            }else System.out.println("не четное");
         }else System.out.println(("Буквы мда"));

    }

    public static void second(Scanner scanner){

         System.out.println("Введите температуру: ");
         if (scanner.hasNextInt()){
             int t = scanner.nextInt();
             if (-5 < t) {
                 System.out.println("warm");
             }
             else if (-5 >= t & t >-20) {
                 System.out.println("normal");
             }
             else if (-20 >= t){
                 System.out.println("Cold");
             }
         }else System.out.println("Только числа!");

    }

    public static void third(){

        int result;
        for (int i = 10, a = 10; i<=20; i++, a++){
            result = a * i;
            System.out.println(result);
        }

    }

    public static void fourth(){

        int result = 0;
        int i = 1;
        while (result < 100){
            result = 7;
            result *=i;
            System.out.println(result);
            i++;
        }

    }

    public static void fifth(Scanner scanner){

        System.out.println("Введите любое положительно число: ");
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            int result = 0;
            if(number > 0){
                for (int i = 1;i<=number; i++) {
                    result +=i;
                    System.out.println(result);
                }
            } else {
                System.out.println("Только положительные числа");
            }
        } else {
            System.out.println("Только положительные числа");
        }

    }










    }
