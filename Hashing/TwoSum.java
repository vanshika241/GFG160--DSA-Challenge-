
class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
      HashMap<Integer, Integer> map = new HashMap<>();
      
        for (int i = 0; i < arr.length; i++) {
            int second = target - arr[i];
            if (map.containsKey(second)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;

    }
}
