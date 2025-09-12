package Day38;

// LeetCode Problem: https://leetcode.com/problems/vowels-game-in-a-string/
// Time: O(n), Space: O(1)

public class VowelGame {
    public boolean doesAliceWin(String s) {

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            switch(c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        return false;
    }
}
