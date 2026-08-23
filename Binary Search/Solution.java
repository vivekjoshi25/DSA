public class Solution {
    // Function to check if cows can be placed with distance d
    public boolean canPlace(int[] stalls, int cows, int d) {
        // Place first cow at first stall
        int count = 1;
        int lastPos = stalls[0];

        // Loop through stalls
        for (int i = 1; i < stalls.length; i++) {
            // If stall is at least d away from last placed cow
            if (stalls[i] - lastPos >= d) {
                // Place cow here
                count++;
                // Update last position
                lastPos = stalls[i];
            }
            // If all cows are placed successfully
            if (count >= cows) return true;
        }
        // Could not place all cows
        return false;
    }

    // Function to maximize minimum distance
    public int aggressiveCows(int[] stalls, int cows) {
        // Sort stalls
        Arrays.sort(stalls);

        // Define search space
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        // Binary search
        while (low <= high) {
            // Find mid distance
            int mid = low + (high - low) / 2;

            // If placement possible
            if (canPlace(stalls, cows, mid)) {
                // Store answer
                ans = mid;
                // Try bigger distance
                low = mid + 1;
            }
            else {
                // Try smaller distance
                high = mid - 1;
            }
        }
        // Return result
        return ans;
    }
} {
    
}
