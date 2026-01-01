class Solution {
    public static int lengthOfLastWord(String str) {
        int size = 0;
        int index = str.length() - 1;
        while (index >= 0 && str.charAt(index) == ' ') {
            index--;
        }

        while (index >= 0 && str.charAt(index) != ' ') {
            size++;
            index--;
        }

        return size;
    }
}