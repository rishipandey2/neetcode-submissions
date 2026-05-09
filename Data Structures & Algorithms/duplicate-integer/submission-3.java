class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Created hasmap
        HashMap<Integer,Boolean>map = new HashMap<>();
        
        for(int num:nums){
            if(map.containsKey(num)){
                return true;
            }

            map.put(num,true);
            
        }
        
        return false;
    }
}