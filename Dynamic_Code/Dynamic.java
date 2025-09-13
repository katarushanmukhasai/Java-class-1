package Dynamic_Code;

import java.util.Scanner;

public class Dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Good Morning"+name);

        System.out.println("Enter your age: ");
        int age  = sc.nextInt();
        System.out.println("Your age is :"+ age);

        if(age>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("Your age is :"+age);
        }

        System.out.println("Enter Your Age: ");
        int newage = sc.nextInt();
        // voting app dynamic
        if (newage >= 18) {
            System.out.println("Do You have ID: (yes/no)");
            String has_id = sc.next();
            if (has_id == "yes"){
                System.out.println("You can Vote");
            } else {
                System.out.println("You Need ID to Vote");
            }       
        } 
        else {
            System.out.println("You cannot Vote Too Young");
        }






    }

}
