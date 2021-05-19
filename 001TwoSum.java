class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
 
        for (int i = 0; i < length; i++) {
        map.put(nums[i], i);
        }
        
        for (int i = 0; i < length ; i++){
            int requiredNum = target - nums[i];
           
            if (map.containsKey(requiredNum) && map.get(requiredNum)!= i){ 
                solution[0] = i;
                solution[1] = map.get(requiredNum) ;
                }     
        }    
    return solution; 
    }  
}

//for (int j = 0; j < length ; j++){
                //if (nums[j] == requiredNum);
                //solution[1] = j; 
    
