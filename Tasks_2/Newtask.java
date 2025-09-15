package Tasks_2;

import java.util.*;

public class Newtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Student's grade level (1-12) 
        Base tuition fee 
        Discount percentage 
        Academic Topper status (e.g., whether the student is an academic topper or not,
         */

        System.out.println("Student Grade level: ");
        int sgl = sc.nextInt();

        System.out.println("Tuition fee: ");
        double tf = sc.nextDouble();
        
        //System.out.println("Discount Percentage:");
        double dp = 0.0; 

        System.out.println(" Academic Topper status");
        boolean ats = sc.nextBoolean();

        /*
            -> For students in grades 9 to 12
                -> If they are academic toppers, apply a 20% discount.
                -> Otherwise, apply a 10% discount.
            -> For students in grades 6 to 8
                -> apply a 5% discount
            -> Below grade 6 
                -> No discount
        */

        if (sgl >= 9 && sgl <= 12) {
            //System.out.println("Academic Topper (yes/no): ");
            //String topper = sc.next();
            // if(topper=="yes"){10
            //     dp = 20.0;
            if (ats) { 
               dp = 20.0;
            } else {
                dp = 10.0;
            }
        } else if (sgl >= 6 && sgl <= 8) {
            dp = 5.0;
        } else {
            dp = 0.0;
            System.out.println("No Discount");
        }


        /*
         Apply Additional Discount
            -> For grade 10, add an additional 3% discount.
            -> For grade 12, add an additional 5% discount.
            -> No additional discounts for other grades.
         */
  
        if (sgl == 10) {
            dp += 3.0; 
        } else if (sgl == 12) {
            dp += 5.0; 
        }

        /*
        -> Calculate Actual Fee 
            -> Base Fee - Discount 
         */
        double discountAmount = (tf * dp) / 100;
        double finalFee = tf - discountAmount;


        /*
        -> Display Output
            -> Student Grade
            -> Student Base Fee 
            -> Discount Amount 
            -> Fee To Pay
         */

        System.out.println("Student Grade: " + sgl);
        System.out.println("Base Tuition Fee: " + tf);
        System.out.println("Discount Percentage: " + dp + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Fee to Pay: " + finalFee);
    }
}
