package Day58;

//LeetCode Problem 796: https://leetcode.com/problems/rotate-string/
//Time: O(n), Space: O(n) 

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())  return false;
        return (s + s).contains(goal);
    }
}