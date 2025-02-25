import java.util.Scanner;

public class Chapter4_GuessBirthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Is your birthday in the first half of the year? (Y/N)");
        String response = input.next().toUpperCase();
        
        if (response.equals("Y")) {
            System.out.println("Is your birthday in January, February, or March? (Y/N)");
            response = input.next().toUpperCase();
            
            if (response.equals("Y")) {
                System.out.println("Is your birthday on or before the 15th? (Y/N)");
                response = input.next().toUpperCase();
                
                if (response.equals("Y")) {
                    System.out.println("Your birthday is on January 1st!");
                } else {
                    System.out.println("Your birthday is on January 16th!");
                }
            } else {
                System.out.println("Is your birthday on or before the 15th? (Y/N)");
                response = input.next().toUpperCase();
                
                if (response.equals("Y")) {
                    System.out.println("Your birthday is on February 1st!");
                } else {
                    System.out.println("Your birthday is on February 16th!");
                }
            }
        } else {
            System.out.println("Is your birthday in July, August, or September? (Y/N)");
            response = input.next().toUpperCase();
            
            if (response.equals("Y")) {
                System.out.println("Is your birthday on or before the 15th? (Y/N)");
                response = input.next().toUpperCase();
                
                if (response.equals("Y")) {
                    System.out.println("Your birthday is on July 1st!");
                } else {
                    System.out.println("Your birthday is on July 16th!");
                }
            } else {
                System.out.println("Is your birthday on or before the 15th? (Y/N)");
                response = input.next().toUpperCase();
                
                if (response.equals("Y")) {
                    System.out.println("Your birthday is on October 1st!");
                } else {
                    System.out.println("Your birthday is on October 16th!");
                }
            }
        }
    }
}
