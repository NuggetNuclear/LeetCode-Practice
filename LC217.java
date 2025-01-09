class LC217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numeros = new HashSet<Integer>(); 
        
        for(int i = 0; i < nums.length; i++){
            if(!numeros.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
