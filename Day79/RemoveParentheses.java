package Day79;

//LeetCode Problem 1021: https://leetcode.com/problems/remove-outermost-parentheses/
//Time: O(n), Space: O(n)

public class RemoveParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder(); 
        int depth = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) ans.append(c);
                depth++;
            } else {
                depth--;
                if (depth > 0) ans.append(c);
            }
        }

        return ans.toString();
    }
}
