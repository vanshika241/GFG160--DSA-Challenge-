class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        List<Integer> ans = new ArrayList<>();
        int tsum = 0;
        for(int num : arr)tsum += num;
        if(tsum %3 != 0){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int n = arr.length;
        int findSum = tsum/3;
        int ans1= -1;
        int ans2 = -1;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == findSum){
                ans1 = i;
                break;
            }
        }
        
         sum = 0;
        for(int i = ans1+1;i<n;i++){
            sum += arr[i];
            if(sum == findSum){
                ans2 = i;
                break;
            }
        }
        
        if(ans1 != -1 && ans2 != -1){
            ans.add(ans1);
            ans.add(ans2);
            return ans;
        }
         ans.add(-1);
            ans.add(-1);
            return ans;
    }
}
