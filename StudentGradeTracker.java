import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class StudentGradeTracker {
    
    // Method to calculate average
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Input grades
        System.out.println("Enter student grades. Type -1 to stop.");
        while (true) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            if (grade == -1) {  // Stop input when -1 is entered
                break;
            }
            grades.add(grade);
        }

        // Check if grades were entered
        if (grades.size() > 0) {
            // Calculate average, highest, and lowest
            double average = calculateAverage(grades);
            int highest = Collections.max(grades);
            int lowest = Collections.min(grades);

            // Display results
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }

        // Close the scanner
        scanner.close();
    }
}
