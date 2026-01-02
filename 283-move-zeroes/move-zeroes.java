class Solution {
    public void moveZeroes(int[] arr) {
        int index = 0, valid = 0;
        while (index < arr.length) {
            if (arr[index] != 0) {
                arr[valid] = arr[index];
                valid++;
            }
            index++;
        }
        Arrays.fill(arr, valid, arr.length, 0);
    }
}
