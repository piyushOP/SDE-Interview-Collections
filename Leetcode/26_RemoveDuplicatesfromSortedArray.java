class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int l = 0, r = 1;
        while (r < arr.length) {
            if (arr[r] != arr[l]) {
                l++;
                arr[l] = arr[r];
            }
            r++;
        }
        return l+1;
    }
}
