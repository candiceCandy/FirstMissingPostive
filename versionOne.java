public class Solution {
    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here 
        
        // 0 case
        if (A.length == 0 || A == null) {
            return 1;
        }
        // 1 case 
        if (A.length == 1) {
            if (A[0] < 0) {
                return 1;
            }
            
            else {
                if (A[0] > 1) {
                    return 1;
                }
                return A[0] + 1;
            }
        }
        
        // postive duplicate array B
        Arrays.sort(A);
        
        int[] B = new int[A.length];
        int size = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[size] = A[i];
                size++;
            }
        }
        
        // non duplicate array C
        int[] C = new int[size];
        C[0] = B[0];
        int hehe = 1;
        for (int i = 1; i < size; i++) {
            if (B[i] != B[i - 1]) {
                C[hehe] = B[i];
                hehe++; 
            }
        }
        
        if (C[0] != 1) {
            return 1;
        }
        
        for (int i = 0; i < hehe - 2; i++) {
            if (C[i + 1] - C[i] != 1) {
                return C[i] + 1; 
            }
        }
        
        return C[hehe - 1] + 1;
    }
}