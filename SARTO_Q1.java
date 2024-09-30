import java.util.Scanner;


public class SARTO_Q1{
    public static void main(String[] args) {
        //Scanner for user's input 
        Scanner scan = new Scanner(System.in);
        //Variables to store the student's information
        String name;
        String course;
        String courseCode;
        int numOfUnits;
        int maxUnit = 10;
        int feePerUnit = 1000;
        int totalFee;
        int paymentAmount;

        System.out.print("Enter Name: ");//ask for the user's name
        name = scan.nextLine();

        System.out.print("Enter Course: "); //ask for the user's course
        course = scan.nextLine();

        System.out.print("Enter Course Code: "); //ask for the user's course code
        courseCode = scan.nextLine();

        System.out.print("Enter Number of Units: "); ////ask for the user's number of units
        numOfUnits = scan.nextInt();
        scan.nextLine();

        if (numOfUnits > maxUnit){//check if the user enterd a valid number of units 
            System.out.println("Error");
            return;
        }

        totalFee = numOfUnits * feePerUnit;//compute the total amount

        System.out.println("Student Name: " + name);
        System.out.println("Total Enrollment Fee: " + totalFee);

        System.out.print("Enter Payment: ");////ask the amount
        paymentAmount = scan.nextInt();
        scan.nextLine();

        if (paymentAmount == totalFee){
            System.out.println("Fully Paid.");
        } else if  (paymentAmount < totalFee){
            System.out.println( "Partial Payment: " + paymentAmount);
            System.out.println("Balance: " + (totalFee - paymentAmount));//compute the balnce
        } else {
            System.out.println("INVALID");
        }

        scan.close();


    }
}