class LC347 {
    public int[] topKFrequent(int[] nums, int k) {
        // O(n^2) TC | O(n) SC
        
        int[] repetidos = new int[k];
        HashMap<Integer, Integer> repetidosMapa = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!repetidosMapa.containsKey(nums[i])) {
                repetidosMapa.put(nums[i], 1);
            } else {
                repetidosMapa.put(nums[i], repetidosMapa.get(nums[i]) + 1);
            }
        }

        for(int i = 0; i < k; i++) {
            int indiceMayor = 0;

            for(int j = 0; j < nums.length; j++) {
                if(repetidosMapa.get(nums[indiceMayor]) < repetidosMapa.get(nums[j])) {
                    indiceMayor = j;
                }
            }

            int aux = nums[indiceMayor];
            repetidos[i] = aux;

            repetidosMapa.put(aux, 0);
        }
        return repetidos;
    }
}
