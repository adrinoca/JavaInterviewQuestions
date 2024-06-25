//You are given an integer array bloomDay, an integer m and an integer k.
//
//You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
//
//The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
//
//Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.
//
//Example 1:
//
//Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
//Output: 3
//Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
//We need 3 bouquets each should contain 1 flower.
//After day 1: [x, _, _, _, _]   // we can only make one bouquet.
//After day 2: [x, _, _, _, x]   // we can only make two bouquets.
//After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
//
//Example 2:
//
//Input: bloomDay = [1,10,3,10,2], m = 3, k = 2
//Output: -1
//Explanation: We need 3 bouquets each has 2 flowers, that means we need 6 flowers. We only have 5 flowers so it is impossible to get the needed bouquets and we return -1.
//
//Example 3:
//
//Input: bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
//Output: 12
//Explanation: We need 2 bouquets each should have 3 flowers.
//Here is the garden after the 7 and 12 days:
//After day 7: [x, x, x, x, _, x, x]
//We can make one bouquet of the first three flowers that bloomed. We cannot make another bouquet from the last three flowers that bloomed because they are not adjacent.
//After day 12: [x, x, x, x, x, x, x]
//It is obvious that we can make two bouquets in different ways.

public class MinimunNumberDaysMakeBouquet {

    public static int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Edge case when we don't have enough flowers
        if (m*k > n) {
            return -1;
        }

        // Find the maximum in bloomDay
        int low = 0, high = 0;
        for (int day:bloomDay) {
            high = Math.max(high, day);
        }

        // Main Logic
        while(low < high) {
            int mid = (low + high) / 2;
            if (canMakeBouquets(bloomDay, m, k, mid)) {
                high = mid; // Try with less days
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0, flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset the counter if the flower did not bloom
            }
        } return bouquets >= m;
    }

    public static void main (String[] args) {
        // Test 1
        int [] bloomDay1 = {1,10,3,10,2};
        int days1 = minDays(bloomDay1, 3, 1);
        System.out.println("Bloomday = [1,10,3,10,2], m = 3, k = 1 // Expected Days = 3: " + days1);

        // Test 2
        int [] bloomDay2 = {1,10,3,10,2};
        int days2 = minDays(bloomDay2, 3, 2);
        System.out.println("Bloomday = [1,10,3,10,2], m = 3, k = 2 // Expected Days = -1: " + days2);

        // Test 3
        int [] bloomDay3 = {7,7,7,7,12,7,7};
        int days3 = minDays(bloomDay3, 2, 3);
        System.out.println("Bloomday = [7,7,7,7,12,7,7], m = 2, k = 3 // Expected Days = 12: " + days3);


    }

}

// COMPLEXITY
// TIME
// First we iterate over the blommDay array to find the max value so O(n).
// Then we do a binary search while low < high. In the worst case the number os iterations is O(log D) where D is the
// range between the minimum and the maximum value in bloomDay.
// In each binary iteration canMakeBouquets is called. This function iterates over bloomDay array so O(n).
// The total time complexity is <- O(nlog(D)).
//
// SPATIAL
// We don't use additional memory