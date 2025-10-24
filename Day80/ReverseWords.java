package Day80;

//LeetCode Problem 151: https://leetcode.com/problems/reverse-words-in-a-string/
//Time: O(n), Space: O(n)

public class ReverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int lp = n - 1, rp = n - 1;

        while (lp >= 0) {
            while (lp >= 0 && s.charAt(lp) != ' ') {
                lp--;
            } 
            ans.append(s.substring(lp + 1, rp + 1)).append(" ");
            while (lp >= 0 && s.charAt(lp) == ' ') {
                lp--;
            }
            rp = lp;
        }

        return ans.toString().trim();
    }    
}