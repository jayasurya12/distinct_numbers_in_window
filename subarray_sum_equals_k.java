public class subarray_sum_equals_k {
    public int solve(int[] A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int ans = 0;
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            if (hm.containsKey(sum-B)) {
               ans += hm.get(sum-B);
            }
            hm.put(sum,hm.get(sum)+1);
        }
        System.out.println(ans);
        // return ans;
    }
}

// Given an array of integers A and an integer B.
// Find the total number of subarrays having sum equals to B.

// Problem Constraints
//  1 <= length of the array <= 50000
// -1000 <= A[i] <= 1000

// Example Input
// Input 1:
// A = [1, 0, 1]
// B = 1
// Input 2:
// A = [0, 0, 0]
// B = 0

// Example Output
// Output 1:
// 4
// Output 2:
// 6


// Example Explanation
// Explanation 1:
// [1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
// Explanation 1:
// All the possible subarrays having sum 0.