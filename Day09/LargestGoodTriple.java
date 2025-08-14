package Day09;

// LeetCode Problem: https://leetcode.com/problems/largest-3-same-digit-number-in-string/
// Time: O(n), Space: O(1)

public class LargestGoodTriple {

    public String largestGoodInteger(String num) {
        int n = num.length(); 
        String ans = "";
        for(int i=0; i<n-2; i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                String good = num.substring(i,i+3);
                if(good.compareTo(ans) > 0){
                    ans = good;
                }
            }
        }
        return ans;
    }
}