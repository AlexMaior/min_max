import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        do{
            System.out.println("Enter number : ");

            boolean isInt = scanner.hasNextInt();

            if (!isInt){
                System.out.println("Invalid number!");
                break;
            }else{
                int num = scanner.nextInt();
                if(num<min){
                    min=num;
                }

                if(num>max){
                    max=num;
                }
                System.out.println("Tha maximum number is: " + max);
                System.out.println("The minimum number is: " + min);
                System.out.println("To exit enter a letter");
            }
            scanner.nextLine();

        }while(true);
        System.out.println("Tha maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        scanner.close();
    }

}