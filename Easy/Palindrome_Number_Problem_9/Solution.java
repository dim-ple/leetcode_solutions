public class Solution {
    public boolean isPalindrome(int x) {
        
        String xToString = String.valueOf(x);
        String temp = "";

        for (int i = xToString.length() - 1; i >= 0; i--) {
            temp += xToString.charAt(i);
        }

        System.out.println(temp);
        System.out.println(xToString);

        if (temp.equals(xToString)) {
            return true;
        } else {
            return false;
        }
    }
}
