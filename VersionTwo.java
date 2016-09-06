public class Solution {
/* 
* @param A: an array of integers
* @return: an integer
/
public int firstMissingPositive(int[] A) {
// write your code here
if (A.length == 0 || A == null) {
return 1; 
}

   // length 1
   if (A.length == 1) {
       if (A[0] < 0) {
           return 1;
       }

       else {
           if (A[0] == 0) {
               return 1;
           }

           else {
               return A[0] + 1; 
           }
       }
   }

   // length > 1
   Arrays.sort(A);
   if (A[0] > 0 && A[0] != 1) {
       return 1;
   }
   for (int i = 0; i < A.length - 1; i++) {
       if (A[i] < 0 && A[i + 1] > 0 && A[i + 1] != 1) {
           return 1; 
       }

       if (A[i] < 0 && A[i + 1] > 0 && A[i + 1] == 1) {
           if (A[i + 2] - A[i + 1] == 1) {
               continue;
           }
          else {
               return A[i + 1] + 1; 
           }
       }

       if (A[i] < 0 && A[i + 1] < 0) {
           continue; 
       }

       if (A[i + 1] - A[i] == 1) {
           continue;
       }

       if (A[i + 1] == A[i]) {
           continue; 
       }
       if (A[i + 1] - A[i] != 1) {
           return A[i] + 1;
       }
   }

   return A[A.length - 1] + 1; 
}
}