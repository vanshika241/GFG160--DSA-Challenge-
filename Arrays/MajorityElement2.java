class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        //Moore's Voting Algorithm 
        int cnt1 = 0;
        int cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(cnt1 == 0 && el2 != nums[i]){
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && el1 != nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if( el1 == nums[i]){
                cnt1++;
            }
            else if( el2 == nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
            
        }
        
        //verify
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == el1)cnt1++;
            if(nums[i] == el2)cnt2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(cnt1 > nums.length/3){
            ans.add(el1);
        }
         if(cnt2 > nums.length/3){
            ans.add(el2);
        }
        Collections.sort(ans);
        return ans;
    }
}
