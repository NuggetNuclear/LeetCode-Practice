class LC1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int[] indexArr = new int[2];

        for(int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; // Diferencia entre el valor que busco menos el indice actual
            if(indexMap.containsKey(difference) && indexMap.get(difference) != i) { // Si existe una llave que sea igual a la diferencia en el mapa y su indice no sea el mismo (i), los guardo en el array de resultado
                indexArr[0] = i;
                indexArr[1] = indexMap.get(difference);
                break;
            }
        }
        return indexArr;
    }
}
