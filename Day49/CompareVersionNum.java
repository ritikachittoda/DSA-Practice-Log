package Day49;

//LeetCode Problem 165: https://leetcode.com/problems/compare-version-numbers/
//Time: O(n1 + n2), Space: O(n1 + n2)

public class CompareVersionNum {
    public int compareVersion(String version1, String version2) {
        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");

        int len = Math.max(str1.length, str2.length);

        for (int i = 0; i < len; i++) {
            int num1 = 0;
            if(i < str1.length) {
                num1 = Integer.parseInt(str1[i]);
            } 

            int num2 = 0;
            if(i < str2.length) {
                num2 = Integer.parseInt(str2[i]);
            }

            if (num1 > num2) return 1;
            if (num1 < num2) return -1;
        }

        return 0;
    }
}
