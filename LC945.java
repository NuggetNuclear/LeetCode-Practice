class LC945 {
    public int minIncrementForUnique(int[] nums) {
        int[] contador = new int[1000000];

        for (int num : nums) {
            contador[num]++;
        }
        
        int movimientos = 0;

        for (int i = 0; i < 1000000; i++) {
            if (contador[i] > 1) {
                movimientos += contador[i] - 1;
                contador[i + 1] += contador[i] - 1;
            }
        }
        
        return movimientos;
    }
}
