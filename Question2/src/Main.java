import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num, i =0;
        boolean mustDisplay = true;
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        do{
            System.out.println("Enter number: ");
            num = sc.nextInt();
            mustDisplay = true;
            if(num<10 || num>100) {
                System.out.println("Invalid number");
                continue;
            }
            myArray[i] = num;
            for (int j = 0; j <i; j++){
                if(num == myArray[j]){
                    mustDisplay = false;
                    continue;
                }

            }
            sc.nextLine();
            if(mustDisplay){
                System.out.println("You have entered : "+myArray[i]);
                System.out.print("Current array: [");
                for (int j = 0; j <=i; j++){
                    System.out.print(" "+myArray[j]);
                }
                System.out.println(" ]");
            }


            i++;

        }while (i<5);


    }
}