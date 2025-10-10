package Task_3_Student_Grade_Tracker;

import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        int Student_ID = sc.nextInt();

        System.out.println("Enter Student Name: ");
        String Student_Name = sc.next();

        System.out.println("Enter Student Attendance: ");
        int Attendance = sc.nextInt();


        //Repeatedly ask student for marks (yes/no)
        //System.out.println("Repeatedly ask student for marks (yes/no):");
        

        // System.out.println("Enter num of Scores: ");
        // int score = sc.nextInt();
        int countsubjects = 0;
        
        int sum = 0;
        // for(int i=0;i<countsubjects;i++){
        //     System.out.println("Do you want to Enter Marks (yes/no):");
        //     String Entermarks = sc.next();

        //     if(Entermarks == "no"){
        //         break;
        //     }

        //     System.out.println("Enter Marks:");
        //     int subject = sc.nextInt();
        //     sum += subject;
        //     countsubjects++;
        // }
        // int avg = sum/countsubjects;

        while (true) {
            System.out.println("Do you want to Enter Marks (yes/no):");
            String Entermarks = sc.next();

            if (Entermarks == "no") {
                break;
            }

            System.out.println("Enter Marks:");
            int subject = sc.nextInt();
            sum += subject;
            countsubjects++;
        }
        int avg = sum/countsubjects;


    /*
    Based on average marks
    -> 85 and above = A
    -> 75 to 84 = B
    -> 74 to 60 = C
    -> 59 to 35 = D
    -> below 35 = Fail
         */

        String grade;
        if(avg>=85) System.out.println("A");
        else if (avg>=75 && avg<=84) System.out.println("B");
        else if (avg>=74 && avg<=60) System.out.println("c");
        else if (avg>=59 && avg<=35) System.out.println("D");
        else if (avg<=35) System.out.println("Fail");
        
    // -> Attendance >= 75 also A then give him Award 
    
    if(Attendance>=75 && avg >=85 ) System.out.println(Student_Name +" got Awarded");
    else System.out.println("No Award");
    
    // String award;
    // if (Attendance >= 75 && avg >= 85) {
    //     award = "He got awarded";
    // } else {
    //     award = "No Awarded";
    // }


    System.out.println("Student Name: "+ Student_Name);
    System.out.println("Total Score: "+ sum);
    System.out.println("Average Score: "+ avg);
    System.out.println("Number Of Subjects / Score: "+ countsubjects);

    //System.out.println("Award Status: "+ award);
     
     



    }

}
