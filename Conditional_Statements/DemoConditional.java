package Conditional_Statements;

public class DemoConditional {
    public static void main(String[] args) {
        int num = 25;

        //if
        if(num>=10 && num<=20){
            System.out.println("Num is in range");
        }


        //if else
        int num2=25;
        if(num2>=10 && num2<=20){
            System.out.println("Num is in range");
        }
        else{
            System.out.println("out of range");
        }

        // voting 
        int age = 19;
        if(age>=18) System.out.println("You can vote");
        else System.out.println("You cannot vote");

        //ternary 

        //here we did compare and assign the value to max
        int a = 10;
        int b = 20;
        int max = (a>=b) ? a:b;
        System.out.println(max);


        String res = (age>=18) ? "You can vote" : "You cannot vote";
        System.out.println("res");


        //else if ladder(grade system)
        int marks = 88;
        if(marks >= 90) System.out.println("A");
        else if(marks >=80) System.out.println("B");
        else if(marks >=75) System.out.println("c");
        else if(marks >=60) System.out.println("D");
        else System.out.println("False");


        // switch case -> like a menu
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                System.out.println("In valid day");
                break;
        }

        // switch case with fall through
        int week = 7;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break; 
            default:
                System.out.println("Invalid Day");
                break;
        }






    }

   
}
