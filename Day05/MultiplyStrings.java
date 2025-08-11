package Day05;

// LeetCode Problem: https://leetcode.com/problems/multiply-strings/
// Time: O(m*n), Space: O(m+n)

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();

        int ans[]=new int[n+m];

        //Multiply each digit
        for(int i=n-1; i>=0; i--){
            int d1=num1.charAt(i)-'0';
            for(int j=m-1; j>=0; j--){
                int d2=num2.charAt(j)-'0';
                ans[i+j+1]+=d1*d2;
            }
        }

        //Handle carry
        for(int i=n+m-1; i>0; i--){
            if(ans[i]>=10){
                ans[i-1] += ans[i]/10;
                ans[i] %= 10;
            }
        }

        //Result string,skipping leading zeros
        StringBuilder sb = new StringBuilder();
        int k=0;
        while(k<ans.length && ans[k]==0){
            k++;
        }
        for(;k<ans.length; k++){
            sb.append(ans[k]);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}