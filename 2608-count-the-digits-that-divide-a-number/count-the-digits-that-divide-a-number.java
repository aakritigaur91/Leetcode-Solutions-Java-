class Solution {
    public int countDigits(int num) {
        int k = num;
        int c = 0;

        while (num != 0) {
            int a = num % 10;

            if (a != 0 && k % a == 0) {
                c++;
            }

            num /= 10;
        }

        return c;
    }
}