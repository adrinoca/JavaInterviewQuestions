package Easy;

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//
//To flip an image horizontally means that each row of the image is reversed.
//
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//
//For example, inverting [0,1,1] results in [1,0,0].
//
//
//Example 1:
//
//Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//Output: [[1,0,0],[0,1,0],[1,1,1]]
//Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
//Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
//Example 2:
//
//Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
//Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

import java.util.Arrays;

public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int l = image[i].length;
            for (int j = 0; j < (l + 1) / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][l - 1 - j] ^ 1;
                image[i][l - 1 - j] = temp ^ 1;
            }
        }
        return image;
    }

    public static void main(String[] args) {

        // Test case 1
        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result1 = FlippingImage.flipAndInvertImage(image1);
        System.out.println("Test 1 - Expected: [[1,0,0],[0,1,0],[1,1,1]], Actual: " + Arrays.deepToString(result1));

        // Test case 2
        int[][] image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] result2 = FlippingImage.flipAndInvertImage(image2);
        System.out.println("Test 2 - Expected: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]], Actual: " + Arrays.deepToString(result2));

    }

// Complexity
    // TIME
    // The outer loop runs once for each row in the matrix (n)
    // The inner loop runs l/2 times (l)
    // The internal operations are constant time (O(1))
    // Time complexity is O(n*m)
    //
    // SPACE
    // Space complexity is O(1). No additional memory is used

}
