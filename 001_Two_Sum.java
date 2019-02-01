class Solution {
    public int[] twoSum(int[] nums, int target) {
        int lenArr = nums.length;
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        int complement = -1;
        
        for(int i=0; i < lenArr; i++){
            //System.out.println(nums[i]);
            complement = target - nums[i];
            if(complement>=0){
                
            }
            if(map.containsKey(complement)){
                arr[1]=i;
                arr[0]=map.get(complement);
                //System.out.println("Pair found at index : "+i+" with value "+nums[i]);
                break;
            }else{
                //System.out.println("Complement of "+nums[i]+ " : "+complement+" not found!!");
                //System.out.println("Map inserted with : "+nums[i]+" at index : "+i);
                map.put(nums[i], i);
            }
        }
        return arr;
    }
}

// Time Complexity O[n]
// Space Complexity O[1]
