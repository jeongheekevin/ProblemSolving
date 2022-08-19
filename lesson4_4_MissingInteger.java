package lesson4_CountingElements;
//
//public class lesson4_4 {
//	// you can also use imports, for example:
//	// import java.util.*;
//
//	// you can write to stdout for debugging purposes, e.g.
//	// System.out.println("this is a debug message");
//
//	class Solution {
//	    public int solution(int[] A) {
//	        // write your code in Java SE 8
//	        int ans = 1000000+1;
//	        int[] checking = new int[1000000 +1];
//
//	        for(int i=0; i< A.length; ++i){
//	            if(A[i] > 0){
//	                checking[A[i]] = 1;
//	            }
//	        }
//	        for(int i =1; i<checking.length ; ++i){
//	            if(checking[i] == 0){
//	                if(ans >= i){
//	                    ans = i;
//	                    break;
//	                }
//	                
//	            }
//	        }
//
//	        return ans;
//	    }
//	}
//
//}
