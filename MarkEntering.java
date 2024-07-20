
import java.util.Scanner;

public class MarkEntering {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your marks: ");
            int marks = scanner.nextInt();
           
            
            
            if (marks > 100 || marks < 0) {
            	
                System.out.println("Invalid percentage entered. Please enter a number between 0 and 100.");
                
            }
            
            else if (marks >= 80) {
                System.out.println("Outstanding Achievement");
            } 
            
            else if (marks >= 70) {
                System.out.println("Meritorious Achievement");
            } 
            
            else if (marks >= 60) {
                System.out.println("Substantial Achievement");
            }
            
            else if (marks >= 50) {
                System.out.println("Moderate Achievement");
            }
            
            else if (marks >= 40) {
                System.out.println("Adequate Achievement");
            }
            
            else if (marks >= 30) {
                System.out.println("Elementary Acievement");
           
            }
       
            else {
				System.out.println("Not Achieved - Fail");
			}
            
            scanner.close();
        }
    }

