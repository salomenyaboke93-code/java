//Salome Nyaboke J77-10533-2024
import java.util.Scanner ;
public class FitnessTracker {
    
    // Method to calculate fitness level
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of steps you walked today:");
        int steps = input.nextInt();
        
        // Get fitness level by calling the method
        String level = getFitnessLevel(steps);
        System.out.println("Your fitness level is: " + level);
        
        input.close();
    }
}