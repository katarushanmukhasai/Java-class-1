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

        if(age>=18){
            System.err.println("Do you have id");
            String has_id = sc.next();

            if(has_id == "yes"){
                System.out.println("you can vote");
            }
            else{
                System.out.println("you need id to vote");
            }
        }
        else{
            System.out.println();
        }








    }

}
