class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        String reversed = "";
        for(int i = a.length() - 1; i != -1; i--){
            reversed = reversed + a.charAt(i);
        }

        return a.equals(reversed);
    }
}

//solution without using strings
class Solution2 {
    public boolean isPalindrome(int x) {
        if(x < 0){ 
            return false;
        }

        int temp = x;
        int reversed = 0;

        while(temp > 0){
            int number = temp % 10;
            reversed = reversed * 10 + number;
            temp /= 10;
        }

        return reversed == x;
    }
}