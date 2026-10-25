class Solution {
    public int reverseBits(int n) {
        String binary = "";

        for (int i = 0; i < 32; i++) {
            int bit = n % 2;
            binary = binary + bit;
            n = n / 2;
        }

        return (int) Long.parseLong(binary, 2);
    }
}