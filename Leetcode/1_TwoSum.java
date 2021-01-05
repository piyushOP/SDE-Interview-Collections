class Solution {
    public int[] twoSum(int[] arr, int x) {
        HashMap<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (check.containsKey(x-arr[i])) {
                return new int[]{check.get(x-arr[i]), i};
            }
            check.put(arr[i], i);
        }
        return new int[]{};
    }
}
