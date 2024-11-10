import java.util.Arrays;

public class GroupPhoto {

    public static void main(String[] args) {
        // Array representing the heights of students in centimeters
        int[] heights = {160, 175, 168, 155, 180, 165};

        System.out.println("Original heights of students:");
        displayHeights(heights);

        // Sort the heights array in ascending order
        Arrays.sort(heights);

        System.out.println("\nArranged heights of students for the photo:");
        displayHeights(heights);
    }

    // Method to display the heights of students
    public static void displayHeights(int[] heights) {
        for (int height : heights) {
            System.out.print(height + " cm ");
        }
        System.out.println();
    }
}
