class LC916 {
  public List<String> wordSubsets(String[] words1, String[] words2) {
    // Calculo la frecuencia maxima de cada caracter en el segundo array
      
    int[] maxFreq = new int[26]; // arreglo de tamaño 26, cada posición representando una letra
    for (String word : words2) {
      int[] freq = getFrequency(word);
      for (int i = 0; i < 26; i++) {
        // Comparamos la frecuencia actual en maxFreq con la frecuencia en freq, Si freq[i] es mayor, actualizamos maxFreq[i] con ese valor
        maxFreq[i] = Math.max(maxFreq[i], freq[i]); 
        // Esto asegura que maxFreq[i] contenga la frecuencia máxima requerida para cada letra en todas las palabras de words2
      }
    }
  
    // Filtro de words1 con words2
      
    List<String> universalWords = new ArrayList<>();
      for (String word : words1) {
        int[] freq = getFrequency(word);
        if (isUniversal(freq, maxFreq)) {
          universalWords.add(word);
        }
    }
    return universalWords;
  }

  // función para devolver arreglo de frecuencia por letra (posición = letra)
  
  private int[] getFrequency(String word) {
    int[] freq = new int[26];
    for (char c : word.toCharArray()) {
      freq[c - 'a']++;
    }
    return freq;
  }

  // función para checkear si añadir o no la palabra a la lista final
  
  private boolean isUniversal(int[] wordFreq, int[] maxFreq) {
    for (int i = 0; i < 26; i++) {
      if (wordFreq[i] < maxFreq[i]) {
        return false;
      }
    }
    return true;
  }
}
